package service.impl;

import com.jn.bean.JnshuIntro;
import com.jn.service.JnshuIntroService;
import utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mapper.JnshuIntroMapper;

import java.util.List;

/**
 * Created by think on 2017/5/27.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class JnshuIntroServiceImpl implements JnshuIntroService {

    private static int count;

//    @Autowired
//    private SqlSession sqlSession;
    @Autowired
    private JnshuIntroMapper mapper;

    @Override
    public List<JnshuIntro> selectAll() {

        List<JnshuIntro> jnshuIntroList = null;

//        if(null != MemoCachedUtil.get("jnshuIntroList")){
//            jnshuIntroList = (List<JnshuIntro>) MemoCachedUtil.get("jnshuIntros");
//            System.out.println("features数据从memcache缓存中取出");
//            return jnshuIntroList;
//        }
//        jnshuIntroList = sqlSession.selectList("com.jn.mapper.JnshuIntroMapper.selectAll");
//        MemoCachedUtil.add("jnshuIntroList",jnshuIntroList);
//        System.out.println("jnshuIntroList数据从数据库中取出，已加入memcache");
//        return jnshuIntroList;

        // 模拟缓存穿透的场景，当count值为20,21,22,23,24的倍数时，删掉缓存。
        if (count % 20 == 0 || count % 21 == 0 || count % 22 == 0 || count % 23 == 0 || count % 24 == 0) {
            System.out.println("删除缓存");
            RedisUtil.setList("jnshuFeatures", null);
        }
        jnshuIntroList = (List<JnshuIntro>) RedisUtil.getList("jnshuIntroList");
        if (null != jnshuIntroList) {
            System.out.println("jnshuIntro 数据从redis中取出");
            System.out.println("intro 访问计数："+count++);
            return jnshuIntroList;
        }
        jnshuIntroList = mapper.selectAll();

                //sqlSession.selectList("com.jn.mapper.JnshuIntroMapper.selectAll");

        RedisUtil.setList("jnshuIntroList", jnshuIntroList);
        System.out.println("jnshuIntro 数据从数据库中取出，已缓存入 redis");
        System.out.println("intro 访问计数："+count++);
        return jnshuIntroList;

    }
}
