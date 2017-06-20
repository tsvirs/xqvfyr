package com.jn.web;

import org.apache.tuscany.sca.host.embedded.SCADomain;
import service.IAdd;
import service.JnshuFeatureService;
import service.impl.Add;

/**
 * Created by think on 2017/6/19.
 */
public class TuscanyClient {

    public static void main(String[] args) {

        SCADomain domain = SCADomain.newInstance("META-INF.SpringRMI-service/server.composite");

//        IAdd iAdd = domain.getService(Add.class,"AddServiceComponent");
//
//        System.out.println("1+2 = "+iAdd.add(1,2));

        JnshuFeatureService featureServiceComponent = domain.getService(JnshuFeatureService.class, "FeatureServiceComponent");

        System.out.println(featureServiceComponent.selectAll());
    }
}
