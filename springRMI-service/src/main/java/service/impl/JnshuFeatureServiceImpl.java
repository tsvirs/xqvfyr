package service.impl;

import com.jn.bean.JnshuFeature;

import mapper.JnshuFeatureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.JnshuFeatureService;
import utils.RedisUtil;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by think on 2017/5/26.
 */
@Service
public class JnshuFeatureServiceImpl implements JnshuFeatureService {

    private static int count;

//    @Resource
//    private JnshuFeatureMapper jnshuFeatureMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
//        int delete = sqlSession.delete("com.jn.mapper.JnshuFeatureMapper");
        return 0;
    }

    @Override
    public int insert(JnshuFeature record) {
        return 0;
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

//        List<JnshuFeature> jnshuFeatures = null;
//
//        // 模拟缓存穿透的场景，当count值为20,21,22,23,24的倍数时，删掉缓存。
//        if (count % 20 == 0 || count % 21 == 0 || count % 22 == 0 || count % 23 == 0 || count % 24 == 0) {
//            System.out.println("删除缓存");
//            RedisUtil.setList("jnshuFeatures", null);
//        }
//        //使用redis作为缓存
//        jnshuFeatures = (List<JnshuFeature>) RedisUtil.getList("jnshuFeatures");
//
//        if (null != jnshuFeatures && jnshuFeatures.size() > 0) {
//            System.out.println("features 数据从redis中取出");
//
//            System.out.println("features 访问数：" + count++);
//            return jnshuFeatures;
//        }
//
//        jnshuFeatures = jnshuFeatureMapper.selectAll();
//        //sqlSession.selectList("com.jn.mapper.JnshuFeatureMapper.selectAll");
//
//        RedisUtil.setList("jnshuFeatures", jnshuFeatures);
//        System.out.println("访问计数：" + count++);
//        System.out.println("features 数据从数据库中取出，已缓存入 redis");

        ArrayList<JnshuFeature> jnshuFeatures = new ArrayList<>();
        jnshuFeatures.add(new JnshuFeature());
        return jnshuFeatures;

    }

}
