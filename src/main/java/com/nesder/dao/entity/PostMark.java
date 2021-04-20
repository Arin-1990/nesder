package com.nesder.dao.entity;

import java.util.Date;

public class PostMark {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.post_mark.post_id
     *
     * @mbg.generated
     */
    private Integer post_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.post_mark.marks
     *
     * @mbg.generated
     */
    private Boolean marks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.post_mark.likes
     *
     * @mbg.generated
     */
    private Boolean likes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.post_mark.account_id
     *
     * @mbg.generated
     */
    private Integer account_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.post_mark.create_date
     *
     * @mbg.generated
     */
    private Date create_date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.post_mark.post_id
     *
     * @return the value of public.post_mark.post_id
     *
     * @mbg.generated
     */
    public Integer getPost_id() {
        return post_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.post_mark.post_id
     *
     * @param post_id the value for public.post_mark.post_id
     *
     * @mbg.generated
     */
    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.post_mark.marks
     *
     * @return the value of public.post_mark.marks
     *
     * @mbg.generated
     */
    public Boolean getMarks() {
        return marks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.post_mark.marks
     *
     * @param marks the value for public.post_mark.marks
     *
     * @mbg.generated
     */
    public void setMarks(Boolean marks) {
        this.marks = marks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.post_mark.likes
     *
     * @return the value of public.post_mark.likes
     *
     * @mbg.generated
     */
    public Boolean getLikes() {
        return likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.post_mark.likes
     *
     * @param likes the value for public.post_mark.likes
     *
     * @mbg.generated
     */
    public void setLikes(Boolean likes) {
        this.likes = likes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.post_mark.account_id
     *
     * @return the value of public.post_mark.account_id
     *
     * @mbg.generated
     */
    public Integer getAccount_id() {
        return account_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.post_mark.account_id
     *
     * @param account_id the value for public.post_mark.account_id
     *
     * @mbg.generated
     */
    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.post_mark.create_date
     *
     * @return the value of public.post_mark.create_date
     *
     * @mbg.generated
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.post_mark.create_date
     *
     * @param create_date the value for public.post_mark.create_date
     *
     * @mbg.generated
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}