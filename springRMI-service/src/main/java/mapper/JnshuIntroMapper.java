package mapper;

import com.jn.bean.JnshuIntro;

import java.util.List;

public interface JnshuIntroMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_intro
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_intro
     *
     * @mbggenerated
     */
    int insert(JnshuIntro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_intro
     *
     * @mbggenerated
     */
    int insertSelective(JnshuIntro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_intro
     *
     * @mbggenerated
     */
    JnshuIntro selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_intro
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JnshuIntro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jnshu_intro
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JnshuIntro record);

    List<JnshuIntro> selectAll();
}