package utils;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;


public class RedisUtil {

    // Redis服务器IP
    private static String ADDR = "127.0.0.1";

    // Redis的端口号
    private static int PORT = 6379;

    // 访问密码 未设置密码
    // private static String AUTH = "";

    // 可用连接实例的最大数目，默认值为8；
    // 如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
    private static int MAX_ACTIVE = 1024;

    // 控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
    private static int MAX_IDLE = 200;

    // 等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
    private static int MAX_WAIT = 10000;

    private static int TIMEOUT = 10000;

    // 在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    private static boolean TEST_ON_BORROW = true;

    private static JedisPool jedisPool = null;

    /**
     * 初始化Redis连接池
     */
    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxActive(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWait(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, ADDR, PORT, TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Jedis实例
     *
     * @return
     */
    public synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 释放jedis资源
     *
     * @param jedis
     */
    public static void returnResource(final Jedis jedis) {
        if (jedis != null) {
            jedisPool.returnResource(jedis);
        }
    }

    /*
        设置对象
     */
    public static void setObject(String key, Object obj) {
        try {
            obj = obj == null ? new Object() : obj;
            getJedis().set(key.getBytes(), SerializeUtil.serialize(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    获取对象
     */
    public static Object getObject(String key) {
        if (getJedis() == null || !getJedis().exists(key)) {
            return null;
        }
        byte[] data = getJedis().get(key.getBytes());
        return SerializeUtil.unserialize(data);
    }

    public static void setList(String key, List<?> list) {
        try {
            if (null != list && list.size() != 0) {
                getJedis().set(key.getBytes(), SerializeUtil.serializeList(list));
            } else {
                getJedis().set(key.getBytes(), "".getBytes());
            }
        } catch (Exception e) {

        }
    }

    public static List<?> getList(String key) {
        if (null == getJedis() || !getJedis().exists(key)) {
            return null;
        }
        byte[] data = getJedis().get(key.getBytes());
        return SerializeUtil.unserializeList(data);
    }

}