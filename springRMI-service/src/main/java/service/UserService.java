package service;

import com.jn.bean.User;

/**
 * Created by think on 2017/5/30.
 */
public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    User SelectByUser(User u);
    /**
     * 根据用户名查用户详情
     * */
    User selectByName(String name);

//    /**
//     * 登录
//     *
//     * @param user
//     *            登录的用户信息
//     * @param rememberme
//     *            是否记住登录
//     * @param response
//     *            HttpServletResponse
//     * @return 根据传递的用户信息在数据库中查询到的用户详情
//     */
//    User login(User user, boolean rememberme, HttpServletResponse response);
//
//    /**
//     * 退出登录
//     * */
//    void logout(HttpServletRequest request, HttpServletResponse response);
}
