package com.dengwang.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Setmeal_CheckGroupExample  implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Setmeal_CheckGroupExample() {
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

        public Criteria andSetmeal_idIsNull() {
            addCriterion("setmeal_id is null");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idIsNotNull() {
            addCriterion("setmeal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idEqualTo(Integer value) {
            addCriterion("setmeal_id =", value, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idNotEqualTo(Integer value) {
            addCriterion("setmeal_id <>", value, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idGreaterThan(Integer value) {
            addCriterion("setmeal_id >", value, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("setmeal_id >=", value, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idLessThan(Integer value) {
            addCriterion("setmeal_id <", value, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idLessThanOrEqualTo(Integer value) {
            addCriterion("setmeal_id <=", value, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idIn(List<Integer> values) {
            addCriterion("setmeal_id in", values, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idNotIn(List<Integer> values) {
            addCriterion("setmeal_id not in", values, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_id between", value1, value2, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andSetmeal_idNotBetween(Integer value1, Integer value2) {
            addCriterion("setmeal_id not between", value1, value2, "setmeal_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idIsNull() {
            addCriterion("checkgroup_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idIsNotNull() {
            addCriterion("checkgroup_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idEqualTo(Integer value) {
            addCriterion("checkgroup_id =", value, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idNotEqualTo(Integer value) {
            addCriterion("checkgroup_id <>", value, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idGreaterThan(Integer value) {
            addCriterion("checkgroup_id >", value, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkgroup_id >=", value, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idLessThan(Integer value) {
            addCriterion("checkgroup_id <", value, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idLessThanOrEqualTo(Integer value) {
            addCriterion("checkgroup_id <=", value, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idIn(List<Integer> values) {
            addCriterion("checkgroup_id in", values, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idNotIn(List<Integer> values) {
            addCriterion("checkgroup_id not in", values, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idBetween(Integer value1, Integer value2) {
            addCriterion("checkgroup_id between", value1, value2, "checkgroup_id");
            return (Criteria) this;
        }

        public Criteria andCheckgroup_idNotBetween(Integer value1, Integer value2) {
            addCriterion("checkgroup_id not between", value1, value2, "checkgroup_id");
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