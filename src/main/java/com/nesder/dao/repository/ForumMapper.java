package com.nesder.dao.repository;

import com.nesder.dao.entity.Forum;
import com.nesder.dao.entity.ForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    long countByExample(ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int deleteByExample(ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer forum_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int insert(Forum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int insertSelective(Forum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    List<Forum> selectByExample(ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    Forum selectByPrimaryKey(Integer forum_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Forum record, @Param("example") ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Forum record, @Param("example") ForumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Forum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.forum
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Forum record);
}