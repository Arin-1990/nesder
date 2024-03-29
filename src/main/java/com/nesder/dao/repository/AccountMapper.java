package com.nesder.dao.repository;

import com.nesder.dao.domain.Account;
import com.nesder.dao.domain.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    long countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    Account selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.account
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Account record);
}