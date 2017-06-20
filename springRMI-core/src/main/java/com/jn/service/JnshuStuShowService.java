package com.jn.service;

import com.jn.bean.JnshuStuShow;
import org.osoa.sca.annotations.Remotable;

import java.util.List;

/**
 * Created by think on 2017/5/27.
 */

public interface JnshuStuShowService {

    public List<JnshuStuShow> selectAll();
}
