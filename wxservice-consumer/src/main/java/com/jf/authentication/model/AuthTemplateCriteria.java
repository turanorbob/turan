package com.jf.authentication.model;

import java.util.ArrayList;
import java.util.List;

public class AuthTemplateCriteria {
    /**
     * auth_template
     */
    protected String orderByClause;

    /**
     * auth_template
     */
    protected boolean distinct;

    /**
     * auth_template
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated
     */
    public AuthTemplateCriteria() {
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
     * auth_template null
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

        public Criteria andTemplateNameIsNull() {
            addCriterion("template_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("template_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("template_name =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("template_name <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("template_name >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("template_name >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("template_name <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("template_name <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("template_name like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("template_name not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("template_name in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("template_name not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("template_name between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("template_name not between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameIsNull() {
            addCriterion("manufacturer_name is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameIsNotNull() {
            addCriterion("manufacturer_name is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameEqualTo(String value) {
            addCriterion("manufacturer_name =", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotEqualTo(String value) {
            addCriterion("manufacturer_name <>", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameGreaterThan(String value) {
            addCriterion("manufacturer_name >", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer_name >=", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameLessThan(String value) {
            addCriterion("manufacturer_name <", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameLessThanOrEqualTo(String value) {
            addCriterion("manufacturer_name <=", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameLike(String value) {
            addCriterion("manufacturer_name like", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotLike(String value) {
            addCriterion("manufacturer_name not like", value, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameIn(List<String> values) {
            addCriterion("manufacturer_name in", values, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotIn(List<String> values) {
            addCriterion("manufacturer_name not in", values, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameBetween(String value1, String value2) {
            addCriterion("manufacturer_name between", value1, value2, "manufacturerName");
            return (Criteria) this;
        }

        public Criteria andManufacturerNameNotBetween(String value1, String value2) {
            addCriterion("manufacturer_name not between", value1, value2, "manufacturerName");
            return (Criteria) this;
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

        public Criteria andAuthTypeIsNull() {
            addCriterion("auth_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("auth_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(Integer value) {
            addCriterion("auth_type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(Integer value) {
            addCriterion("auth_type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(Integer value) {
            addCriterion("auth_type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(Integer value) {
            addCriterion("auth_type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(Integer value) {
            addCriterion("auth_type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<Integer> values) {
            addCriterion("auth_type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<Integer> values) {
            addCriterion("auth_type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(Integer value1, Integer value2) {
            addCriterion("auth_type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionIsNull() {
            addCriterion("auth_type_version is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionIsNotNull() {
            addCriterion("auth_type_version is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionEqualTo(String value) {
            addCriterion("auth_type_version =", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionNotEqualTo(String value) {
            addCriterion("auth_type_version <>", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionGreaterThan(String value) {
            addCriterion("auth_type_version >", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionGreaterThanOrEqualTo(String value) {
            addCriterion("auth_type_version >=", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionLessThan(String value) {
            addCriterion("auth_type_version <", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionLessThanOrEqualTo(String value) {
            addCriterion("auth_type_version <=", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionLike(String value) {
            addCriterion("auth_type_version like", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionNotLike(String value) {
            addCriterion("auth_type_version not like", value, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionIn(List<String> values) {
            addCriterion("auth_type_version in", values, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionNotIn(List<String> values) {
            addCriterion("auth_type_version not in", values, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionBetween(String value1, String value2) {
            addCriterion("auth_type_version between", value1, value2, "authTypeVersion");
            return (Criteria) this;
        }

        public Criteria andAuthTypeVersionNotBetween(String value1, String value2) {
            addCriterion("auth_type_version not between", value1, value2, "authTypeVersion");
            return (Criteria) this;
        }
    }

    /**
     * auth_template
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * auth_template null
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