package service.impl;

import com.jn.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import utils.CCPclient;

import java.util.HashMap;

/**
 * Created by think on 2017/6/15.
 */
public class SMSServiceImpl implements SMSService {

    @Autowired
    private CCPclient ccPclient;

    @Override
    public HashMap<String, Object> sendSMS(String phoneNum, String templateId, String[] info) {
        return ccPclient.sendSMS(phoneNum, templateId, info);
    }
}
