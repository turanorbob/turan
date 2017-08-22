package com.jf.authentication.model;

import java.util.ArrayList;
import java.util.List;

public class AuthManufacturerVersionParametersCriteria {
    /**
     * auth_manufacturer_version_parameters
     */
    protected String orderByClause;

    /**
     * auth_manufacturer_version_parameters
     */
    protected boolean distinct;

    /**
     * auth_manufacturer_version_parameters
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated
     */
    public AuthManufacturerVersionParametersCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
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
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * auth_manufacturer_version_parameters null
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

        public Criteria andManufacturerVersionIsNull() {
            addCriterion("manufacturer_version is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionIsNotNull() {
            addCriterion("manufacturer_version is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionEqualTo(String value) {
            addCriterion("manufacturer_version =", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionNotEqualTo(String value) {
            addCriterion("manufacturer_version <>", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionGreaterThan(String value) {
            addCriterion("manufacturer_version >", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer_version >=", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionLessThan(String value) {
            addCriterion("manufacturer_version <", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionLessThanOrEqualTo(String value) {
            addCriterion("manufacturer_version <=", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionLike(String value) {
            addCriterion("manufacturer_version like", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionNotLike(String value) {
            addCriterion("manufacturer_version not like", value, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionIn(List<String> values) {
            addCriterion("manufacturer_version in", values, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionNotIn(List<String> values) {
            addCriterion("manufacturer_version not in", values, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionBetween(String value1, String value2) {
            addCriterion("manufacturer_version between", value1, value2, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andManufacturerVersionNotBetween(String value1, String value2) {
            addCriterion("manufacturer_version not between", value1, value2, "manufacturerVersion");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameIsNull() {
            addCriterion("device_config_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameIsNotNull() {
            addCriterion("device_config_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameEqualTo(String value) {
            addCriterion("device_config_name =", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameNotEqualTo(String value) {
            addCriterion("device_config_name <>", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameGreaterThan(String value) {
            addCriterion("device_config_name >", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_config_name >=", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameLessThan(String value) {
            addCriterion("device_config_name <", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameLessThanOrEqualTo(String value) {
            addCriterion("device_config_name <=", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameLike(String value) {
            addCriterion("device_config_name like", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameNotLike(String value) {
            addCriterion("device_config_name not like", value, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameIn(List<String> values) {
            addCriterion("device_config_name in", values, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameNotIn(List<String> values) {
            addCriterion("device_config_name not in", values, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameBetween(String value1, String value2) {
            addCriterion("device_config_name between", value1, value2, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andDeviceConfigNameNotBetween(String value1, String value2) {
            addCriterion("device_config_name not between", value1, value2, "deviceConfigName");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNull() {
            addCriterion("parameter_name is null");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNotNull() {
            addCriterion("parameter_name is not null");
            return (Criteria) this;
        }

        public Criteria andParameterNameEqualTo(String value) {
            addCriterion("parameter_name =", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotEqualTo(String value) {
            addCriterion("parameter_name <>", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThan(String value) {
            addCriterion("parameter_name >", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThanOrEqualTo(String value) {
            addCriterion("parameter_name >=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThan(String value) {
            addCriterion("parameter_name <", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThanOrEqualTo(String value) {
            addCriterion("parameter_name <=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLike(String value) {
            addCriterion("parameter_name like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotLike(String value) {
            addCriterion("parameter_name not like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameIn(List<String> values) {
            addCriterion("parameter_name in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotIn(List<String> values) {
            addCriterion("parameter_name not in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameBetween(String value1, String value2) {
            addCriterion("parameter_name between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotBetween(String value1, String value2) {
            addCriterion("parameter_name not between", value1, value2, "parameterName");
            return (Criteria) this;
        }
    }

    /**
     * auth_manufacturer_version_parameters
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * auth_manufacturer_version_parameters null
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