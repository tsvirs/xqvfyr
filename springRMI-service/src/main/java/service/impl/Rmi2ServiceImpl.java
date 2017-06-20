package service.impl;

import com.jn.service.Rmi2Service;

/**
 * Created by think on 2017/6/12.
 */
public class Rmi2ServiceImpl implements Rmi2Service {
    @Override
    public String doWork() {
        return "这条信息是由伺服器返回的。";
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
