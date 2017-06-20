package com.jn.service;

import java.util.HashMap;

/**
 * Created by think on 2017/6/15.
 */
public interface SMSService {

    HashMap<String, Object> sendSMS(String phoneNum, String templateId, String[] info);

}
