package com.jn.web;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * Created by think on 2017/6/12.
 */
public class RMIClient {

    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String s : beanDefinitionNames) {
            System.out.println("已经实例化的bean：" + s);
        }
//        // 测试发短信 smsService
//        SMSService smsService = (SMSService) context.getBean("smsService");
//        HashMap<String, Object> result = smsService.sendSMS("17721420363", "1", new String[]{"7529", "5"});
//        System.out.println(result);

        //     RmiService service = (RmiService) context.getBean("rmiServiceProxy");
//        System.out.println("测试 test");
//        StudentService ss =
//                (StudentService) context.getBean("studentService");

//        int add = service.add(1, 3);

//        Student student = service.selectById(Long.valueOf("20"));
//        System.out.println("服务器 studentService: "+student);

//        JnshuFeatureService fffService = (JnshuFeatureService) context.getBean("fffService");
//
//        List<JnshuFeature> jnshuFeatures = fffService.selectAll();
//
//        System.out.println(jnshuFeatures);


        //         StudentService _ss = (StudentService) context.getBean("studentService");
//        RmiService rmiService = (RmiService) Naming.lookup("rmi://localhost:7777/rmiTestService");
        //      System.out.println(_ss.selectByPrimaryKey(Long.valueOf("21")));

//        System.out.println(lookup1);




    }
}
