package service.impl;

import service.IAdd;

/**
 * Created by think on 2017/6/15.
 */
public class Add implements IAdd {

    @Override
    public double add(double n1, double n2) {
        return n1 + n2;
    }
}
