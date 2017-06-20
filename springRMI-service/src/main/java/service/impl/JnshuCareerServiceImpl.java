package service.impl;

import com.jn.bean.JnshuCareer;
import com.jn.service.JnshuCareerService;
import org.springframework.stereotype.Service;
import mapper.JnshuCareerMapper;

import java.util.List;

/**
 * Created by think on 2017/5/28.
 */
@Service
public class JnshuCareerServiceImpl implements JnshuCareerService {
//    @Autowired
//    private SqlSession sqlSession;
//
    private JnshuCareerMapper jnshuCareerMapper;
    @Override
    public List<JnshuCareer> selectAll() {

        List<JnshuCareer> careerList = jnshuCareerMapper.selectAll();
        return careerList;
    }
}
