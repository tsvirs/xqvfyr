package com.jn.service;


import com.jn.bean.JnshuIntro;
import org.osoa.sca.annotations.Remotable;

import java.util.List;

/**
 * Created by think on 2017/5/27.
 */
@Remotable
public interface JnshuIntroService {

   public List<JnshuIntro> selectAll();

}
