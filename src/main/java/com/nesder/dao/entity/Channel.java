package com.nesder.dao.entity;

import java.util.Date;

public class Channel {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.create_date
	 * @mbg.generated
	 */
	private Date create_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.introduction
	 * @mbg.generated
	 */
	private String introduction;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.created_account
	 * @mbg.generated
	 */
	private Integer created_account;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.channel.mid
	 * @mbg.generated
	 */
	private Integer mid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.id
	 * @return  the value of public.channel.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.id
	 * @param id  the value for public.channel.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.name
	 * @return  the value of public.channel.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.name
	 * @param name  the value for public.channel.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.create_date
	 * @return  the value of public.channel.create_date
	 * @mbg.generated
	 */
	public Date getCreate_date() {
		return create_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.create_date
	 * @param create_date  the value for public.channel.create_date
	 * @mbg.generated
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.introduction
	 * @return  the value of public.channel.introduction
	 * @mbg.generated
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.introduction
	 * @param introduction  the value for public.channel.introduction
	 * @mbg.generated
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction == null ? null : introduction.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.created_account
	 * @return  the value of public.channel.created_account
	 * @mbg.generated
	 */
	public Integer getCreated_account() {
		return created_account;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.created_account
	 * @param created_account  the value for public.channel.created_account
	 * @mbg.generated
	 */
	public void setCreated_account(Integer created_account) {
		this.created_account = created_account;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.channel.mid
	 * @return  the value of public.channel.mid
	 * @mbg.generated
	 */
	public Integer getMid() {
		return mid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.channel.mid
	 * @param mid  the value for public.channel.mid
	 * @mbg.generated
	 */
	public void setMid(Integer mid) {
		this.mid = mid;
	}
}