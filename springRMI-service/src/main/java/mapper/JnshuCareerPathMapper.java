package mapper;

import com.jn.bean.JnshuCareerPath;

import java.util.List;

public interface JnshuCareerPathMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_careerPath
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_careerPath
     *
     * @mbggenerated
     */
    int insert(JnshuCareerPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_careerPath
     *
     * @mbggenerated
     */
    int insertSelective(JnshuCareerPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_careerPath
     *
     * @mbggenerated
     */
    JnshuCareerPath selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_careerPath
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JnshuCareerPath record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_careerPath
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JnshuCareerPath record);


    List<JnshuCareerPath> selectAll();
}