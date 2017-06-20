package utils;

import com.cloopen.rest.sdk.CCPRestSmsSDK;
import java.util.HashMap;

/**
 * Created by think on 2017/6/7.
 */
public class CCPclient {

    private String serverIP = null;

    private String serverPort = null;

    private String accountSid = null;

    private String accountToken = null;

    private String appId = null;

    private CCPRestSmsSDK restAPI = new CCPRestSmsSDK();

    public HashMap<String, Object> sendSMS(String phoneNum, String templateId, String[] info) {

        restAPI.init(serverIP, serverPort);
        restAPI.setAccount(accountSid, accountToken);
        restAPI.setAppId(appId);
        HashMap<String, Object> result = restAPI.sendTemplateSMS(phoneNum, templateId, info);

        return result;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    public String getAccountToken() {
        return accountToken;
    }

    public void setAccountToken(String accountToken) {
        this.accountToken = accountToken;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public static void main(String[] args) {

        //CCPclient.sendSMS("17721420363", "1", new String[]{"1826", "5"});
    }


}
