package utils;

import com.qcloud.cos.COS;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.request.UploadFileRequest;
import com.qcloud.cos.sign.Credentials;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by think on 2017/6/9.
 */
public class COSclientUtil {

    String appId = null;

    String secretId = null;

    String secretKey = null;

    String bucketName = null;

    String region = null;

    ClientConfig clientConfig = new ClientConfig();

    Credentials cred = null;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String uploadFile(String cosFilePath, String localFilePath1) {

        cred = new Credentials(Long.valueOf(appId), secretId, secretKey);

        clientConfig.setRegion(region);
        COSClient cosClient = new COSClient(clientConfig, cred);
        UploadFileRequest uploadFileRequest = new UploadFileRequest(bucketName, cosFilePath, localFilePath1);
        uploadFileRequest.setEnableShaDigest(false);
        String uploadFileRet = cosClient.uploadFile(uploadFileRequest);
        cosClient.shutdown();
        return uploadFileRet;

    }

    public void main(String[] args) {


    }


}
