package com.design.dao;

import com.design.entity.TopicGuidances;
import com.design.entity.TopicGuidancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicGuidancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    Long countByExample(TopicGuidancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int deleteByExample(TopicGuidancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int insert(TopicGuidances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int insertSelective(TopicGuidances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    List<TopicGuidances> selectByExample(TopicGuidancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    TopicGuidances selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TopicGuidances record, @Param("example") TopicGuidancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TopicGuidances record, @Param("example") TopicGuidancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TopicGuidances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_guidances
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TopicGuidances record);

    List<TopicGuidances> guidanceInsertList(Integer topicId);
}