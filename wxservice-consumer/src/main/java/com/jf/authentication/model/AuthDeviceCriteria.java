package com.jf.authentication.model;

import java.util.ArrayList;
import java.util.List;

public class AuthDeviceCriteria {
    /**
     * auth_device
     */
    protected String orderByClause;

    /**
     * auth_device
     */
    protected boolean distinct;

    /**
     * auth_device
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated
     */
    public AuthDeviceCriteria() {
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
     * auth_device null
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andInternetAddressIsNull() {
            addCriterion("internet_address is null");
            return (Criteria) this;
        }

        public Criteria andInternetAddressIsNotNull() {
            addCriterion("internet_address is not null");
            return (Criteria) this;
        }

        public Criteria andInternetAddressEqualTo(String value) {
            addCriterion("internet_address =", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressNotEqualTo(String value) {
            addCriterion("internet_address <>", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressGreaterThan(String value) {
            addCriterion("internet_address >", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("internet_address >=", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressLessThan(String value) {
            addCriterion("internet_address <", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressLessThanOrEqualTo(String value) {
            addCriterion("internet_address <=", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressLike(String value) {
            addCriterion("internet_address like", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressNotLike(String value) {
            addCriterion("internet_address not like", value, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressIn(List<String> values) {
            addCriterion("internet_address in", values, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressNotIn(List<String> values) {
            addCriterion("internet_address not in", values, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressBetween(String value1, String value2) {
            addCriterion("internet_address between", value1, value2, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andInternetAddressNotBetween(String value1, String value2) {
            addCriterion("internet_address not between", value1, value2, "internetAddress");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNull() {
            addCriterion("report_address is null");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNotNull() {
            addCriterion("report_address is not null");
            return (Criteria) this;
        }

        public Criteria andReportAddressEqualTo(String value) {
            addCriterion("report_address =", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotEqualTo(String value) {
            addCriterion("report_address <>", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThan(String value) {
            addCriterion("report_address >", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThanOrEqualTo(String value) {
            addCriterion("report_address >=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThan(String value) {
            addCriterion("report_address <", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThanOrEqualTo(String value) {
            addCriterion("report_address <=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLike(String value) {
            addCriterion("report_address like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotLike(String value) {
            addCriterion("report_address not like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressIn(List<String> values) {
            addCriterion("report_address in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotIn(List<String> values) {
            addCriterion("report_address not in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressBetween(String value1, String value2) {
            addCriterion("report_address between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotBetween(String value1, String value2) {
            addCriterion("report_address not between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportPortIsNull() {
            addCriterion("report_port is null");
            return (Criteria) this;
        }

        public Criteria andReportPortIsNotNull() {
            addCriterion("report_port is not null");
            return (Criteria) this;
        }

        public Criteria andReportPortEqualTo(Integer value) {
            addCriterion("report_port =", value, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortNotEqualTo(Integer value) {
            addCriterion("report_port <>", value, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortGreaterThan(Integer value) {
            addCriterion("report_port >", value, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_port >=", value, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortLessThan(Integer value) {
            addCriterion("report_port <", value, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortLessThanOrEqualTo(Integer value) {
            addCriterion("report_port <=", value, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortIn(List<Integer> values) {
            addCriterion("report_port in", values, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortNotIn(List<Integer> values) {
            addCriterion("report_port not in", values, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortBetween(Integer value1, Integer value2) {
            addCriterion("report_port between", value1, value2, "reportPort");
            return (Criteria) this;
        }

        public Criteria andReportPortNotBetween(Integer value1, Integer value2) {
            addCriterion("report_port not between", value1, value2, "reportPort");
            return (Criteria) this;
        }

        public Criteria andProtocolClassIsNull() {
            addCriterion("protocol_class is null");
            return (Criteria) this;
        }

        public Criteria andProtocolClassIsNotNull() {
            addCriterion("protocol_class is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolClassEqualTo(String value) {
            addCriterion("protocol_class =", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassNotEqualTo(String value) {
            addCriterion("protocol_class <>", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassGreaterThan(String value) {
            addCriterion("protocol_class >", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassGreaterThanOrEqualTo(String value) {
            addCriterion("protocol_class >=", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassLessThan(String value) {
            addCriterion("protocol_class <", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassLessThanOrEqualTo(String value) {
            addCriterion("protocol_class <=", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassLike(String value) {
            addCriterion("protocol_class like", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassNotLike(String value) {
            addCriterion("protocol_class not like", value, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassIn(List<String> values) {
            addCriterion("protocol_class in", values, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassNotIn(List<String> values) {
            addCriterion("protocol_class not in", values, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassBetween(String value1, String value2) {
            addCriterion("protocol_class between", value1, value2, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andProtocolClassNotBetween(String value1, String value2) {
            addCriterion("protocol_class not between", value1, value2, "protocolClass");
            return (Criteria) this;
        }

        public Criteria andSecretIsNull() {
            addCriterion("secret is null");
            return (Criteria) this;
        }

        public Criteria andSecretIsNotNull() {
            addCriterion("secret is not null");
            return (Criteria) this;
        }

        public Criteria andSecretEqualTo(String value) {
            addCriterion("secret =", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotEqualTo(String value) {
            addCriterion("secret <>", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThan(String value) {
            addCriterion("secret >", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThanOrEqualTo(String value) {
            addCriterion("secret >=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThan(String value) {
            addCriterion("secret <", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThanOrEqualTo(String value) {
            addCriterion("secret <=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLike(String value) {
            addCriterion("secret like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotLike(String value) {
            addCriterion("secret not like", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretIn(List<String> values) {
            addCriterion("secret in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotIn(List<String> values) {
            addCriterion("secret not in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretBetween(String value1, String value2) {
            addCriterion("secret between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotBetween(String value1, String value2) {
            addCriterion("secret not between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andProxyAddressIsNull() {
            addCriterion("proxy_address is null");
            return (Criteria) this;
        }

        public Criteria andProxyAddressIsNotNull() {
            addCriterion("proxy_address is not null");
            return (Criteria) this;
        }

        public Criteria andProxyAddressEqualTo(String value) {
            addCriterion("proxy_address =", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressNotEqualTo(String value) {
            addCriterion("proxy_address <>", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressGreaterThan(String value) {
            addCriterion("proxy_address >", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("proxy_address >=", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressLessThan(String value) {
            addCriterion("proxy_address <", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressLessThanOrEqualTo(String value) {
            addCriterion("proxy_address <=", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressLike(String value) {
            addCriterion("proxy_address like", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressNotLike(String value) {
            addCriterion("proxy_address not like", value, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressIn(List<String> values) {
            addCriterion("proxy_address in", values, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressNotIn(List<String> values) {
            addCriterion("proxy_address not in", values, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressBetween(String value1, String value2) {
            addCriterion("proxy_address between", value1, value2, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andProxyAddressNotBetween(String value1, String value2) {
            addCriterion("proxy_address not between", value1, value2, "proxyAddress");
            return (Criteria) this;
        }

        public Criteria andDefaultUserIsNull() {
            addCriterion("default_user is null");
            return (Criteria) this;
        }

        public Criteria andDefaultUserIsNotNull() {
            addCriterion("default_user is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultUserEqualTo(String value) {
            addCriterion("default_user =", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserNotEqualTo(String value) {
            addCriterion("default_user <>", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserGreaterThan(String value) {
            addCriterion("default_user >", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserGreaterThanOrEqualTo(String value) {
            addCriterion("default_user >=", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserLessThan(String value) {
            addCriterion("default_user <", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserLessThanOrEqualTo(String value) {
            addCriterion("default_user <=", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserLike(String value) {
            addCriterion("default_user like", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserNotLike(String value) {
            addCriterion("default_user not like", value, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserIn(List<String> values) {
            addCriterion("default_user in", values, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserNotIn(List<String> values) {
            addCriterion("default_user not in", values, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserBetween(String value1, String value2) {
            addCriterion("default_user between", value1, value2, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultUserNotBetween(String value1, String value2) {
            addCriterion("default_user not between", value1, value2, "defaultUser");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordIsNull() {
            addCriterion("default_password is null");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordIsNotNull() {
            addCriterion("default_password is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordEqualTo(String value) {
            addCriterion("default_password =", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotEqualTo(String value) {
            addCriterion("default_password <>", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordGreaterThan(String value) {
            addCriterion("default_password >", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("default_password >=", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordLessThan(String value) {
            addCriterion("default_password <", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordLessThanOrEqualTo(String value) {
            addCriterion("default_password <=", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordLike(String value) {
            addCriterion("default_password like", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotLike(String value) {
            addCriterion("default_password not like", value, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordIn(List<String> values) {
            addCriterion("default_password in", values, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotIn(List<String> values) {
            addCriterion("default_password not in", values, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordBetween(String value1, String value2) {
            addCriterion("default_password between", value1, value2, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andDefaultPasswordNotBetween(String value1, String value2) {
            addCriterion("default_password not between", value1, value2, "defaultPassword");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeIsNull() {
            addCriterion("free_online_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeIsNotNull() {
            addCriterion("free_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeEqualTo(Integer value) {
            addCriterion("free_online_time =", value, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeNotEqualTo(Integer value) {
            addCriterion("free_online_time <>", value, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeGreaterThan(Integer value) {
            addCriterion("free_online_time >", value, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("free_online_time >=", value, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeLessThan(Integer value) {
            addCriterion("free_online_time <", value, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeLessThanOrEqualTo(Integer value) {
            addCriterion("free_online_time <=", value, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeIn(List<Integer> values) {
            addCriterion("free_online_time in", values, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeNotIn(List<Integer> values) {
            addCriterion("free_online_time not in", values, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeBetween(Integer value1, Integer value2) {
            addCriterion("free_online_time between", value1, value2, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andFreeOnlineTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("free_online_time not between", value1, value2, "freeOnlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdIsNull() {
            addCriterion("offline_policy_id is null");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdIsNotNull() {
            addCriterion("offline_policy_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdEqualTo(Integer value) {
            addCriterion("offline_policy_id =", value, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdNotEqualTo(Integer value) {
            addCriterion("offline_policy_id <>", value, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdGreaterThan(Integer value) {
            addCriterion("offline_policy_id >", value, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("offline_policy_id >=", value, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdLessThan(Integer value) {
            addCriterion("offline_policy_id <", value, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdLessThanOrEqualTo(Integer value) {
            addCriterion("offline_policy_id <=", value, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdIn(List<Integer> values) {
            addCriterion("offline_policy_id in", values, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdNotIn(List<Integer> values) {
            addCriterion("offline_policy_id not in", values, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdBetween(Integer value1, Integer value2) {
            addCriterion("offline_policy_id between", value1, value2, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andOfflinePolicyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("offline_policy_id not between", value1, value2, "offlinePolicyId");
            return (Criteria) this;
        }

        public Criteria andExtraIsNull() {
            addCriterion("extra is null");
            return (Criteria) this;
        }

        public Criteria andExtraIsNotNull() {
            addCriterion("extra is not null");
            return (Criteria) this;
        }

        public Criteria andExtraEqualTo(String value) {
            addCriterion("extra =", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotEqualTo(String value) {
            addCriterion("extra <>", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThan(String value) {
            addCriterion("extra >", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThanOrEqualTo(String value) {
            addCriterion("extra >=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThan(String value) {
            addCriterion("extra <", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThanOrEqualTo(String value) {
            addCriterion("extra <=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLike(String value) {
            addCriterion("extra like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotLike(String value) {
            addCriterion("extra not like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraIn(List<String> values) {
            addCriterion("extra in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotIn(List<String> values) {
            addCriterion("extra not in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraBetween(String value1, String value2) {
            addCriterion("extra between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotBetween(String value1, String value2) {
            addCriterion("extra not between", value1, value2, "extra");
            return (Criteria) this;
        }
    }

    /**
     * auth_device
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * auth_device null
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