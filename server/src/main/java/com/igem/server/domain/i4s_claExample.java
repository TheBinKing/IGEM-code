package com.igem.server.domain;

import java.util.ArrayList;
import java.util.List;

public class i4s_claExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public i4s_claExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andI1ClaIsNull() {
            addCriterion("i1_cla is null");
            return (Criteria) this;
        }

        public Criteria andI1ClaIsNotNull() {
            addCriterion("i1_cla is not null");
            return (Criteria) this;
        }

        public Criteria andI1ClaEqualTo(Integer value) {
            addCriterion("i1_cla =", value, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaNotEqualTo(Integer value) {
            addCriterion("i1_cla <>", value, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaGreaterThan(Integer value) {
            addCriterion("i1_cla >", value, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaGreaterThanOrEqualTo(Integer value) {
            addCriterion("i1_cla >=", value, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaLessThan(Integer value) {
            addCriterion("i1_cla <", value, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaLessThanOrEqualTo(Integer value) {
            addCriterion("i1_cla <=", value, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaIn(List<Integer> values) {
            addCriterion("i1_cla in", values, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaNotIn(List<Integer> values) {
            addCriterion("i1_cla not in", values, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaBetween(Integer value1, Integer value2) {
            addCriterion("i1_cla between", value1, value2, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI1ClaNotBetween(Integer value1, Integer value2) {
            addCriterion("i1_cla not between", value1, value2, "i1Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaIsNull() {
            addCriterion("i2_cla is null");
            return (Criteria) this;
        }

        public Criteria andI2ClaIsNotNull() {
            addCriterion("i2_cla is not null");
            return (Criteria) this;
        }

        public Criteria andI2ClaEqualTo(Integer value) {
            addCriterion("i2_cla =", value, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaNotEqualTo(Integer value) {
            addCriterion("i2_cla <>", value, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaGreaterThan(Integer value) {
            addCriterion("i2_cla >", value, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaGreaterThanOrEqualTo(Integer value) {
            addCriterion("i2_cla >=", value, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaLessThan(Integer value) {
            addCriterion("i2_cla <", value, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaLessThanOrEqualTo(Integer value) {
            addCriterion("i2_cla <=", value, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaIn(List<Integer> values) {
            addCriterion("i2_cla in", values, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaNotIn(List<Integer> values) {
            addCriterion("i2_cla not in", values, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaBetween(Integer value1, Integer value2) {
            addCriterion("i2_cla between", value1, value2, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI2ClaNotBetween(Integer value1, Integer value2) {
            addCriterion("i2_cla not between", value1, value2, "i2Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaIsNull() {
            addCriterion("i3_cla is null");
            return (Criteria) this;
        }

        public Criteria andI3ClaIsNotNull() {
            addCriterion("i3_cla is not null");
            return (Criteria) this;
        }

        public Criteria andI3ClaEqualTo(Integer value) {
            addCriterion("i3_cla =", value, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaNotEqualTo(Integer value) {
            addCriterion("i3_cla <>", value, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaGreaterThan(Integer value) {
            addCriterion("i3_cla >", value, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaGreaterThanOrEqualTo(Integer value) {
            addCriterion("i3_cla >=", value, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaLessThan(Integer value) {
            addCriterion("i3_cla <", value, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaLessThanOrEqualTo(Integer value) {
            addCriterion("i3_cla <=", value, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaIn(List<Integer> values) {
            addCriterion("i3_cla in", values, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaNotIn(List<Integer> values) {
            addCriterion("i3_cla not in", values, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaBetween(Integer value1, Integer value2) {
            addCriterion("i3_cla between", value1, value2, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI3ClaNotBetween(Integer value1, Integer value2) {
            addCriterion("i3_cla not between", value1, value2, "i3Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaIsNull() {
            addCriterion("i4_cla is null");
            return (Criteria) this;
        }

        public Criteria andI4ClaIsNotNull() {
            addCriterion("i4_cla is not null");
            return (Criteria) this;
        }

        public Criteria andI4ClaEqualTo(Integer value) {
            addCriterion("i4_cla =", value, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaNotEqualTo(Integer value) {
            addCriterion("i4_cla <>", value, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaGreaterThan(Integer value) {
            addCriterion("i4_cla >", value, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaGreaterThanOrEqualTo(Integer value) {
            addCriterion("i4_cla >=", value, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaLessThan(Integer value) {
            addCriterion("i4_cla <", value, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaLessThanOrEqualTo(Integer value) {
            addCriterion("i4_cla <=", value, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaIn(List<Integer> values) {
            addCriterion("i4_cla in", values, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaNotIn(List<Integer> values) {
            addCriterion("i4_cla not in", values, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaBetween(Integer value1, Integer value2) {
            addCriterion("i4_cla between", value1, value2, "i4Cla");
            return (Criteria) this;
        }

        public Criteria andI4ClaNotBetween(Integer value1, Integer value2) {
            addCriterion("i4_cla not between", value1, value2, "i4Cla");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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