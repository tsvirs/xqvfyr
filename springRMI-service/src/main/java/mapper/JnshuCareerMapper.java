package mapper;

import com.jn.bean.JnshuCareer;

import java.util.List;

public interface JnshuCareerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_career
     *
     * @mbggenerated
     */
    int insert(JnshuCareer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_career
     *
     * @mbggenerated
     */
    int insertSelective(JnshuCareer record);

    List<JnshuCareer> selectAll();


}