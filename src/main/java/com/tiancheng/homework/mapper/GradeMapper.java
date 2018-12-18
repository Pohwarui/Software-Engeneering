package com.tiancheng.homework.mapper;

import com.tiancheng.homework.domain.Grade;
import com.tiancheng.homework.domain.GradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    long countByExample(GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int deleteByExample(GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int deleteByPrimaryKey(Integer idExaminee);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int insert(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int insertSelective(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    List<Grade> selectByExample(GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    Grade selectByPrimaryKey(Integer idExaminee);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int updateByPrimaryKeySelective(Grade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grade
     *
     * @mbg.generated Fri Dec 14 14:23:28 CST 2018
     */
    int updateByPrimaryKey(Grade record);
}