package com.design.dao;

import com.design.entity.Blog;
import com.design.entity.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbggenerated
     */
    int countByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbggenerated
     */
    int deleteByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbggenerated
     */
    @Insert({
        "insert into blog (id, title, ",
        "summary, create_date, ",
        "update_date, click_count, ",
        "reply_count, like_count, ",
        "type_id, content, ",
        "blog_image, reprint)",
        "values (#{id,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, ",
        "#{summary,jdbcType=VARCHAR}, #{createDate,jdbcType=VARCHAR}, ",
        "#{updateDate,jdbcType=VARCHAR}, #{clickCount,jdbcType=VARCHAR}, ",
        "#{replyCount,jdbcType=VARCHAR}, #{likeCount,jdbcType=VARCHAR}, ",
        "#{typeId,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{blogImage,jdbcType=VARCHAR}, #{reprint,jdbcType=VARCHAR})"
    })
    int insert(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbggenerated
     */
    int insertSelective(Blog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbggenerated
     */
    List<Blog> selectByExample(BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);
}