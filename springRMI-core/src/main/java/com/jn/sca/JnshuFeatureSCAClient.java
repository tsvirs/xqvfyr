package com.jn.sca;

import com.jn.bean.JnshuFeature;
import com.jn.service.JnshuFeatureService;

import java.util.List;

/**
 * Created by think on 2017/6/16.
 */
public class JnshuFeatureSCAClient implements JnshuFeatureService{

    private JnshuFeatureService jnshuFeatureService;

    public JnshuFeatureService getJnshuFeatureService() {
        return jnshuFeatureService;
    }

    public void setJnshuFeatureService(JnshuFeatureService jnshuFeatureService) {
        this.jnshuFeatureService = jnshuFeatureService;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jnshuFeatureService.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JnshuFeature record) {
        return jnshuFeatureService.insert(record);
    }

    @Override
    public int insertSelective(JnshuFeature record) {
        return 0;
    }

    @Override
    public JnshuFeature selectPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(JnshuFeature record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(JnshuFeature record) {
        return 0;
    }

    @Override
    public List<JnshuFeature> selectAll() {
        return jnshuFeatureService.selectAll();
    }
}
