package utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;


/**
 * Created by think on 2017/6/6.
 */
public class QiniuClientUtil {

    private String accessKey = null;
    private String secretKey = null;
    private String bucket = null;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    private Auth auth;

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth.create(accessKey, secretKey);
    }

    /**
     * 上传文件到七牛云服务器(断点上传)
     *
     * @param key  文件名
     * @param data 文件内容  byte[]
     * @throws Exception
     */
    public Response uploadFile(String data, String key) throws Exception {

        auth = Auth.create(accessKey, secretKey);

        //同名文件覆盖操作、只能上传指定key的文件可以可通过此方法获取token
        String token = auth.uploadToken(bucket, key);
        UploadManager uploadManager = new UploadManager(new Configuration(Zone.zone2()));
        //上传数据
        Response response = uploadManager.put(data, key, token);

        return response;
    }

    public static void main(String[] args) throws Exception {

        QiniuClientUtil q = new QiniuClientUtil();

        q.setAccessKey("WqaJEgjuDKXMs-oJa-Tdc18enCDUxCn7O94oaaL2");
        q.setSecretKey("5lBR0haGCJl_y5kzWeZocN5klNrw1yJ_yhtOhO07");
        q.setBucket("myfirstbucket");

        //如果是Windows情况下，格式是 D:\\qiniu\\test.png
        String localFilePath = "C:\\Users\\think\\Desktop\\lotteWorldTower2.jpg";

        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = "lotte世界塔大图2";

        try {
            Response response = q.uploadFile(localFilePath, key);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
    }

    /**
     * 从七牛服务器下载文件（获取下载地址）
     *
     * @param key 文件名
     * @throws Exception
     */
    public String downloadFile(String key) throws Exception {
        return auth.privateDownloadUrl(key, 3600 * 24);
    }

    /**
     * 从七牛服务器删除文件
     *
     * @param key 文件名
     */
    public void delFile(String key) throws Exception {
        BucketManager bucketManager = new BucketManager(auth, new Configuration(Zone.zone2()));
        bucketManager.delete(bucket, key);
    }
}


