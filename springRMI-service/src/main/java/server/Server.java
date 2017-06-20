package server;

import mapper.JnshuFeatureMapper;
import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by think on 2017/6/14.
 */
public class Server {

    public static void main(String[] args) throws IOException {

         SCADomain domain = SCADomain.newInstance("META-INF.SpringRMI-service/server.composite");
//        System.out.println("回车键退出.......");
//        System.in.read();
//        domain.close();
//        System.out.println("退出.......");
//        System.exit(0);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-service.xml");

        JnshuFeatureMapper jnshuFeatureMapper = (JnshuFeatureMapper) context.getBean("jnshuFeatureMapper");
//
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//
//        for (String s:beanDefinitionNames){
//            System.out.println("已经实例化的bean："+s);
//        }

    }
}
