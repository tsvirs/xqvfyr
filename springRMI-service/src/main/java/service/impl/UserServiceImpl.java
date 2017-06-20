package service.impl;

import com.jn.bean.User;

import com.jn.service.PersistentLoginsService;
import com.jn.service.UserService;

import mapper.UserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by think on 2017/5/30.
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private PersistentLoginsService persistentLoginsService;

    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int updateByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User SelectByUser(User u) {
        return userMapper.selectByUser(u);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }


}
