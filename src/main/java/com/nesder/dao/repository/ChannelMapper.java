package com.nesder.dao.repository;

import com.nesder.dao.entity.Channel;
import com.nesder.dao.entity.ChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    long countByExample(ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int deleteByExample(ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer channel_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int insert(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int insertSelective(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    List<Channel> selectByExample(ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    Channel selectByPrimaryKey(Integer channel_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Channel record, @Param("example") ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Channel record, @Param("example") ChannelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.channel
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Channel record);
}