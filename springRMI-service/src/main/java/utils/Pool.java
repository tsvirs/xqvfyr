package utils;

import org.apache.commons.dbcp.BasicDataSource;
import redis.clients.jedis.BinaryJedis;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by think on 2017/4/27.
 */
public class Pool<J extends BinaryJedis> {

    private static BasicDataSource dbcp;
    private static ThreadLocal<Connection> tl;

    //通过配置文件获取数据库参数
    static {
        try {
            Properties prop = new Properties();
            InputStream is = Pool.class.getClassLoader().getResourceAsStream("conf/db.properties");


            prop.load(is);
            is.close();

            //初始化连接池
            dbcp = new BasicDataSource();
            //设置驱动、url、用户名密码
            dbcp.setDriverClassName(prop.getProperty("jdbc.driver"));
            dbcp.setUrl(prop.getProperty("jdbc.url"));
            dbcp.setUsername(prop.getProperty("jdbc.user"));
            dbcp.setPassword(prop.getProperty("jdbc.password"));

            //连接池允许的最大连接数
            dbcp.setMaxActive(
                    Integer.parseInt(
                            prop.getProperty("maxactive")
                    )
            );
            //设置最大等待时间
            dbcp.setMaxWait(
                    Integer.parseInt(
                            prop.getProperty("maxwait")
                    )
            );
            //设置最小空闲数
            dbcp.setMinIdle(
                    Integer.parseInt(
                            prop.getProperty("minidle")
                    )
            );
            //设置最大空闲数
            dbcp.setMaxIdle(
                    Integer.parseInt(
                            prop.getProperty("maxidle")
                    )
            );
            //初始化线程本地
            tl = new ThreadLocal<Connection>();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
                 /*
           * 通过连接池获取一个空闲连接
           */
        Connection conn = dbcp.getConnection();
        tl.set(conn);
        return conn;
    }

    /**
     * 关闭数据库连接
     */
    public static void closeConnection() {
        try {
            Connection conn = tl.get();
            if (conn != null) {
                /*
                  * 通过连接池获取的Connection
                  * 的close()方法实际上并没有将
                  * 连接关闭，而是将该链接归还。
                  */
                conn.close();
                tl.remove();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试是否连接成功
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {

        for (int i=0;i<1000;i++){
            System.out.println(i+": "+getConnection());
        }

    }


}
