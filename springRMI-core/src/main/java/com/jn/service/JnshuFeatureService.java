package com.jn.service;

import com.jn.bean.JnshuFeature;
import org.osoa.sca.annotations.Remotable;

import java.util.List;

/**
 * Created by think on 2017/5/26.
 */
@Remotable
public interface JnshuFeatureService {

    int deleteByPrimaryKey(Integer id);

    int insert(JnshuFeature record);

    int insertSelective(JnshuFeature record);

    JnshuFeature selectPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JnshuFeature record);

    int updateByPrimaryKey(JnshuFeature record);

    List<JnshuFeature> selectAll();

}
