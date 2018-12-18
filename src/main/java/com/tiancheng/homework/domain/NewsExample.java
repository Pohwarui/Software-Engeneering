package com.tiancheng.homework.domain;

import java.util.ArrayList;
import java.util.List;

public class NewsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public NewsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
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
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdnewsIsNull() {
            addCriterion("idnews is null");
            return (Criteria) this;
        }

        public Criteria andIdnewsIsNotNull() {
            addCriterion("idnews is not null");
            return (Criteria) this;
        }

        public Criteria andIdnewsEqualTo(Integer value) {
            addCriterion("idnews =", value, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsNotEqualTo(Integer value) {
            addCriterion("idnews <>", value, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsGreaterThan(Integer value) {
            addCriterion("idnews >", value, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("idnews >=", value, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsLessThan(Integer value) {
            addCriterion("idnews <", value, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsLessThanOrEqualTo(Integer value) {
            addCriterion("idnews <=", value, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsIn(List<Integer> values) {
            addCriterion("idnews in", values, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsNotIn(List<Integer> values) {
            addCriterion("idnews not in", values, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsBetween(Integer value1, Integer value2) {
            addCriterion("idnews between", value1, value2, "idnews");
            return (Criteria) this;
        }

        public Criteria andIdnewsNotBetween(Integer value1, Integer value2) {
            addCriterion("idnews not between", value1, value2, "idnews");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTimevalueIsNull() {
            addCriterion("timevalue is null");
            return (Criteria) this;
        }

        public Criteria andTimevalueIsNotNull() {
            addCriterion("timevalue is not null");
            return (Criteria) this;
        }

        public Criteria andTimevalueEqualTo(String value) {
            addCriterion("timevalue =", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotEqualTo(String value) {
            addCriterion("timevalue <>", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueGreaterThan(String value) {
            addCriterion("timevalue >", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueGreaterThanOrEqualTo(String value) {
            addCriterion("timevalue >=", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueLessThan(String value) {
            addCriterion("timevalue <", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueLessThanOrEqualTo(String value) {
            addCriterion("timevalue <=", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueLike(String value) {
            addCriterion("timevalue like", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotLike(String value) {
            addCriterion("timevalue not like", value, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueIn(List<String> values) {
            addCriterion("timevalue in", values, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotIn(List<String> values) {
            addCriterion("timevalue not in", values, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueBetween(String value1, String value2) {
            addCriterion("timevalue between", value1, value2, "timevalue");
            return (Criteria) this;
        }

        public Criteria andTimevalueNotBetween(String value1, String value2) {
            addCriterion("timevalue not between", value1, value2, "timevalue");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table news
     *
     * @mbg.generated do_not_delete_during_merge Sun Dec 16 20:16:47 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table news
     *
     * @mbg.generated Sun Dec 16 20:16:47 CST 2018
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