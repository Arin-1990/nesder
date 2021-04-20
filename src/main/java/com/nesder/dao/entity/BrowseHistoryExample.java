package com.nesder.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrowseHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public BrowseHistoryExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAccount_idIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccount_idIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccount_idEqualTo(Integer value) {
            addCriterion("account_id =", value, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idGreaterThan(Integer value) {
            addCriterion("account_id >", value, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idLessThan(Integer value) {
            addCriterion("account_id <", value, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idIn(List<Integer> values) {
            addCriterion("account_id in", values, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "account_id");
            return (Criteria) this;
        }

        public Criteria andAccount_idNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "account_id");
            return (Criteria) this;
        }

        public Criteria andPost_idIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPost_idIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPost_idEqualTo(Integer value) {
            addCriterion("post_id =", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idGreaterThan(Integer value) {
            addCriterion("post_id >", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idLessThan(Integer value) {
            addCriterion("post_id <", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idIn(List<Integer> values) {
            addCriterion("post_id in", values, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "post_id");
            return (Criteria) this;
        }

        public Criteria andModify_dateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModify_dateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModify_dateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateLessThan(Date value) {
            addCriterion("modify_date <", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modify_date");
            return (Criteria) this;
        }

        public Criteria andModify_dateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modify_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.browse_history
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.browse_history
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}