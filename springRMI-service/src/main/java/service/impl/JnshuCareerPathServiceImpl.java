package service.impl;

import com.jn.bean.JnshuCareerPath;
import com.jn.service.JnshuCareerPathService;
import mapper.JnshuCareerPathMapper;
import org.osoa.sca.annotations.Service;

import java.util.List;

/**
 * Created by think on 2017/5/28.
 */
@Service
public class JnshuCareerPathServiceImpl implements JnshuCareerPathService {

    private JnshuCareerPathMapper jnshuCareerPathMapper;

    @Override
    public List<JnshuCareerPath> selectAll() {

        List<JnshuCareerPath> jnshuCareerPathList = jnshuCareerPathMapper.selectAll();
        return jnshuCareerPathList;
    }



}
