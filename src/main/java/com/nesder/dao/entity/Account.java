package com.nesder.dao.entity;

import java.util.Date;

public class Account {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.account_id
	 * @mbg.generated
	 */
	private String account_id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.role
	 * @mbg.generated
	 */
	private String role;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.password
	 * @mbg.generated
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.nick_name
	 * @mbg.generated
	 */
	private String nick_name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.email
	 * @mbg.generated
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.gender
	 * @mbg.generated
	 */
	private Integer gender;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.create_date
	 * @mbg.generated
	 */
	private Date create_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.age
	 * @mbg.generated
	 */
	private Integer age;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.introduction
	 * @mbg.generated
	 */
	private String introduction;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.login_auth
	 * @mbg.generated
	 */
	private Integer login_auth;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.account.avatarurl
	 * @mbg.generated
	 */
	private String avatarurl;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.id
	 * @return  the value of public.account.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.id
	 * @param id  the value for public.account.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.account_id
	 * @return  the value of public.account.account_id
	 * @mbg.generated
	 */
	public String getAccount_id() {
		return account_id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.account_id
	 * @param account_id  the value for public.account.account_id
	 * @mbg.generated
	 */
	public void setAccount_id(String account_id) {
		this.account_id = account_id == null ? null : account_id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.role
	 * @return  the value of public.account.role
	 * @mbg.generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.role
	 * @param role  the value for public.account.role
	 * @mbg.generated
	 */
	public void setRole(String role) {
		this.role = role == null ? null : role.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.password
	 * @return  the value of public.account.password
	 * @mbg.generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.password
	 * @param password  the value for public.account.password
	 * @mbg.generated
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.nick_name
	 * @return  the value of public.account.nick_name
	 * @mbg.generated
	 */
	public String getNick_name() {
		return nick_name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.nick_name
	 * @param nick_name  the value for public.account.nick_name
	 * @mbg.generated
	 */
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name == null ? null : nick_name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.email
	 * @return  the value of public.account.email
	 * @mbg.generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.email
	 * @param email  the value for public.account.email
	 * @mbg.generated
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.gender
	 * @return  the value of public.account.gender
	 * @mbg.generated
	 */
	public Integer getGender() {
		return gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.gender
	 * @param gender  the value for public.account.gender
	 * @mbg.generated
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.create_date
	 * @return  the value of public.account.create_date
	 * @mbg.generated
	 */
	public Date getCreate_date() {
		return create_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.create_date
	 * @param create_date  the value for public.account.create_date
	 * @mbg.generated
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.age
	 * @return  the value of public.account.age
	 * @mbg.generated
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.age
	 * @param age  the value for public.account.age
	 * @mbg.generated
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.introduction
	 * @return  the value of public.account.introduction
	 * @mbg.generated
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.introduction
	 * @param introduction  the value for public.account.introduction
	 * @mbg.generated
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction == null ? null : introduction.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.login_auth
	 * @return  the value of public.account.login_auth
	 * @mbg.generated
	 */
	public Integer getLogin_auth() {
		return login_auth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.login_auth
	 * @param login_auth  the value for public.account.login_auth
	 * @mbg.generated
	 */
	public void setLogin_auth(Integer login_auth) {
		this.login_auth = login_auth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.account.avatarurl
	 * @return  the value of public.account.avatarurl
	 * @mbg.generated
	 */
	public String getAvatarurl() {
		return avatarurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.account.avatarurl
	 * @param avatarurl  the value for public.account.avatarurl
	 * @mbg.generated
	 */
	public void setAvatarurl(String avatarurl) {
		this.avatarurl = avatarurl == null ? null : avatarurl.trim();
	}
}