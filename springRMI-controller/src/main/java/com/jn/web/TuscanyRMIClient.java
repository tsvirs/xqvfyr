package com.jn.web;

import com.jn.bean.JnshuFeature;
import mapper.JnshuFeatureMapper;
import org.apache.tuscany.sca.host.embedded.SCADomain;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.JnshuFeatureService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by think on 2017/6/18.
 */
public class TuscanyRMIClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {


        JnshuFeatureService featureService= (JnshuFeatureService) Naming.lookup("//localhost:8091/FeatureRMIService");

        List<JnshuFeature> jnshuFeatures = featureService.selectAll();

        System.out.println(jnshuFeatures);

//        IAdd iAdd = (IAdd) Naming.lookup("//localhost:8099/AddRMIService");
//
//        double add = iAdd.add(1, 2);
//
//        System.out.println(add);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-service.xml");

        JnshuFeatureMapper jnshuFeatureMapper = (JnshuFeatureMapper) context.getBean("jnshuFeatureMapper");

        jnshuFeatureMapper.selectAll();
        SCADomain domain = SCADomain.newInstance("META-INF.SpringRMI-service/server.composite");

        JnshuFeatureService featureServiceComponent = domain.getService(JnshuFeatureService.class, "FeatureServiceComponent");
//
//
//        List<JnshuFeature> jnshuFeatures = featureServiceComponent.selectAll();
//
//       // IAdd addServiceComponent = domain.getService(IAdd.class, "AddServiceComponent");
//       // double add = addServiceComponent.add(1, 2);
//
//        System.out.println(jnshuFeatures);
    }

}
