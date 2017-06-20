package service.impl;

import com.jn.bean.PersistentLogins;
import com.jn.service.PersistentLoginsService;
import mapper.PersistentLoginsMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by think on 2017/5/30.
 */
@Service
public class PersistentLoginServiceImpl implements PersistentLoginsService{

    //@Resource(name="persistentLoginsMapper")
    @Autowired
    private PersistentLoginsMapper persistentLoginsMapper;

    public int deleteByPrimaryKey(Integer id) {
        return persistentLoginsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PersistentLogins pLogins) {
        return persistentLoginsMapper.insert(pLogins);
    }

    @Override
    public int insertSelective(PersistentLogins pLogins) {
        return persistentLoginsMapper.insertSelective(pLogins);
    }

    @Override
    public PersistentLogins selectByPrimaryKey(Integer id) {
        return persistentLoginsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PersistentLogins pLogins) {
        return persistentLoginsMapper.updateByPrimaryKeySelective(pLogins);
    }

    @Override
    public int updateByPrimaryKey(PersistentLogins pLogins) {
        return persistentLoginsMapper.updateByPrimaryKey(pLogins);
    }

    public PersistentLogins selectByUsernameAndSeries(String username, String series) {
        if(StringUtils.isNotBlank(username) && StringUtils.isNotBlank(series))
            return persistentLoginsMapper.selectByUsernameAndSeries(username, series);
        else
            return null;
    }

    @Override
    public PersistentLogins selectByUsername(String username) {
        return persistentLoginsMapper.selectByUsername(username);
    }
}
