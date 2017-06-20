import com.jn.bean.JnshuFeature;
import service.JnshuFeatureService;
import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.impl.JnshuFeatureServiceImpl;

import java.util.List;

/**
 * Created by think on 2017/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"classpath:applicationContext-service.xml"}) //加载配置文件
public class NosqlTest {


    private JnshuFeatureService featureService = new JnshuFeatureServiceImpl();

    @Test
    public void test() {
        // 初始化SockIOPool，管理memcached的连接池
        String[] servers = {"127.0.0.1:11211"};
        SockIOPool pool = SockIOPool.getInstance();
        pool.setServers(servers);
        pool.setFailover(true);
        pool.setInitConn(10);
        pool.setMinConn(5);
        pool.setMaxConn(250);
        pool.setMaintSleep(30);
        pool.setNagle(false);
        pool.setSocketTO(3000);
        pool.setAliveCheck(true);
        pool.initialize();

        MemCachedClient memCachedClient = new MemCachedClient();

//        boolean set = memCachedClient.set("testTEST", "测试的值");
//
//        Object v2 = memCachedClient.get("testTEST");
//        System.out.println(v2);

        List<JnshuFeature> jnshuFeatures = featureService.selectAll();

        boolean features = memCachedClient.set("features", jnshuFeatures);
        Object f = memCachedClient.get("features");
        System.out.println(f);

    }


}
