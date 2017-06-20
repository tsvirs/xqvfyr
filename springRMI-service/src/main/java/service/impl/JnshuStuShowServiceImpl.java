package service.impl;

import com.jn.bean.JnshuStuShow;
import com.jn.service.JnshuStuShowService;
import utils.MemoCachedUtil;
import utils.RedisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by think on 2017/5/27.
 */
@Service
public class JnshuStuShowServiceImpl implements JnshuStuShowService {

    private static int count;
    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<JnshuStuShow> selectAll() {

        List<JnshuStuShow> jnshuStuShows = null;

//        if (null != MemoCachedUtil.get("jnshuStuShows")){
//
//            jnshuStuShows = (List<JnshuStuShow>) MemoCachedUtil.get("jnshuStuShows");
//            System.out.println("jnshuStuShows从memcache缓存中取出");
//            return jnshuStuShows;
//        }
//
//        jnshuStuShows = sqlSession.selectList("com.jn.mapper.JnshuStuShowMapper.selectAll");
//        MemoCachedUtil.add("jnshuStuShows",jnshuStuShows);
//        System.out.println("jnshuStuShows数据从数据库中取出，已加入memcache");
//        return jnshuStuShows;

        // 模拟缓存穿透的场景，当count数为20,21,22,23,24的倍数时，删掉缓存。
        if (count % 20 == 0 || count % 21 == 0 || count % 22 == 0 || count % 23 == 0 || count % 24 == 0) {
            System.out.println("删除缓存");
            RedisUtil.setList("jnshuFeatures", null);
        }

        List<JnshuStuShow> stuShowList = (List<JnshuStuShow>) RedisUtil.getList("stuShowList");
        if (null != stuShowList) {
            System.out.println(stuShowList);
            return stuShowList;
        }

        stuShowList = sqlSession.selectList("com.jn.mapper.JnshuStuShowMapper.selectAll");
        RedisUtil.setList("stuShowList", stuShowList);
        System.out.println("jnshuStuShows 数据从数据库中取出，已加入 redis");
        return jnshuStuShows;

    }
}
