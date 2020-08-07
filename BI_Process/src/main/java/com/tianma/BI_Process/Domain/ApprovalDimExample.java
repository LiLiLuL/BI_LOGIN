package com.tianma.BI_Process.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApprovalDimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalDimExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApproval_NameIsNull() {
            addCriterion("Approval_Name is null");
            return (Criteria) this;
        }

        public Criteria andApproval_NameIsNotNull() {
            addCriterion("Approval_Name is not null");
            return (Criteria) this;
        }

        public Criteria andApproval_NameEqualTo(String value) {
            addCriterion("Approval_Name =", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameNotEqualTo(String value) {
            addCriterion("Approval_Name <>", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameGreaterThan(String value) {
            addCriterion("Approval_Name >", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameGreaterThanOrEqualTo(String value) {
            addCriterion("Approval_Name >=", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameLessThan(String value) {
            addCriterion("Approval_Name <", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameLessThanOrEqualTo(String value) {
            addCriterion("Approval_Name <=", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameLike(String value) {
            addCriterion("Approval_Name like", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameNotLike(String value) {
            addCriterion("Approval_Name not like", value, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameIn(List<String> values) {
            addCriterion("Approval_Name in", values, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameNotIn(List<String> values) {
            addCriterion("Approval_Name not in", values, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameBetween(String value1, String value2) {
            addCriterion("Approval_Name between", value1, value2, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andApproval_NameNotBetween(String value1, String value2) {
            addCriterion("Approval_Name not between", value1, value2, "approval_Name");
            return (Criteria) this;
        }

        public Criteria andCreate_UserIsNull() {
            addCriterion("Create_User is null");
            return (Criteria) this;
        }

        public Criteria andCreate_UserIsNotNull() {
            addCriterion("Create_User is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_UserEqualTo(String value) {
            addCriterion("Create_User =", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserNotEqualTo(String value) {
            addCriterion("Create_User <>", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserGreaterThan(String value) {
            addCriterion("Create_User >", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserGreaterThanOrEqualTo(String value) {
            addCriterion("Create_User >=", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserLessThan(String value) {
            addCriterion("Create_User <", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserLessThanOrEqualTo(String value) {
            addCriterion("Create_User <=", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserLike(String value) {
            addCriterion("Create_User like", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserNotLike(String value) {
            addCriterion("Create_User not like", value, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserIn(List<String> values) {
            addCriterion("Create_User in", values, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserNotIn(List<String> values) {
            addCriterion("Create_User not in", values, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserBetween(String value1, String value2) {
            addCriterion("Create_User between", value1, value2, "create_User");
            return (Criteria) this;
        }

        public Criteria andCreate_UserNotBetween(String value1, String value2) {
            addCriterion("Create_User not between", value1, value2, "create_User");
            return (Criteria) this;
        }

        public Criteria andModify_userIsNull() {
            addCriterion("modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModify_userIsNotNull() {
            addCriterion("modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModify_userEqualTo(String value) {
            addCriterion("modify_user =", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userNotEqualTo(String value) {
            addCriterion("modify_user <>", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userGreaterThan(String value) {
            addCriterion("modify_user >", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user >=", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userLessThan(String value) {
            addCriterion("modify_user <", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userLessThanOrEqualTo(String value) {
            addCriterion("modify_user <=", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userLike(String value) {
            addCriterion("modify_user like", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userNotLike(String value) {
            addCriterion("modify_user not like", value, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userIn(List<String> values) {
            addCriterion("modify_user in", values, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userNotIn(List<String> values) {
            addCriterion("modify_user not in", values, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userBetween(String value1, String value2) {
            addCriterion("modify_user between", value1, value2, "modify_user");
            return (Criteria) this;
        }

        public Criteria andModify_userNotBetween(String value1, String value2) {
            addCriterion("modify_user not between", value1, value2, "modify_user");
            return (Criteria) this;
        }

        public Criteria andCreate_DateIsNull() {
            addCriterion("Create_Date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_DateIsNotNull() {
            addCriterion("Create_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_DateEqualTo(Date value) {
            addCriterion("Create_Date =", value, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateNotEqualTo(Date value) {
            addCriterion("Create_Date <>", value, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateGreaterThan(Date value) {
            addCriterion("Create_Date >", value, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Date >=", value, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateLessThan(Date value) {
            addCriterion("Create_Date <", value, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateLessThanOrEqualTo(Date value) {
            addCriterion("Create_Date <=", value, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateIn(List<Date> values) {
            addCriterion("Create_Date in", values, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateNotIn(List<Date> values) {
            addCriterion("Create_Date not in", values, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateBetween(Date value1, Date value2) {
            addCriterion("Create_Date between", value1, value2, "create_Date");
            return (Criteria) this;
        }

        public Criteria andCreate_DateNotBetween(Date value1, Date value2) {
            addCriterion("Create_Date not between", value1, value2, "create_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateIsNull() {
            addCriterion("Record_Date is null");
            return (Criteria) this;
        }

        public Criteria andRecord_DateIsNotNull() {
            addCriterion("Record_Date is not null");
            return (Criteria) this;
        }

        public Criteria andRecord_DateEqualTo(Date value) {
            addCriterion("Record_Date =", value, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateNotEqualTo(Date value) {
            addCriterion("Record_Date <>", value, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateGreaterThan(Date value) {
            addCriterion("Record_Date >", value, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateGreaterThanOrEqualTo(Date value) {
            addCriterion("Record_Date >=", value, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateLessThan(Date value) {
            addCriterion("Record_Date <", value, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateLessThanOrEqualTo(Date value) {
            addCriterion("Record_Date <=", value, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateIn(List<Date> values) {
            addCriterion("Record_Date in", values, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateNotIn(List<Date> values) {
            addCriterion("Record_Date not in", values, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateBetween(Date value1, Date value2) {
            addCriterion("Record_Date between", value1, value2, "record_Date");
            return (Criteria) this;
        }

        public Criteria andRecord_DateNotBetween(Date value1, Date value2) {
            addCriterion("Record_Date not between", value1, value2, "record_Date");
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