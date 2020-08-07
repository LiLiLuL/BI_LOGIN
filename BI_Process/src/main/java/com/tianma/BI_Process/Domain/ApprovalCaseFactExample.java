package com.tianma.BI_Process.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApprovalCaseFactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalCaseFactExample() {
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

        public Criteria andApproval_IdIsNull() {
            addCriterion("Approval_Id is null");
            return (Criteria) this;
        }

        public Criteria andApproval_IdIsNotNull() {
            addCriterion("Approval_Id is not null");
            return (Criteria) this;
        }

        public Criteria andApproval_IdEqualTo(Integer value) {
            addCriterion("Approval_Id =", value, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdNotEqualTo(Integer value) {
            addCriterion("Approval_Id <>", value, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdGreaterThan(Integer value) {
            addCriterion("Approval_Id >", value, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Approval_Id >=", value, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdLessThan(Integer value) {
            addCriterion("Approval_Id <", value, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Approval_Id <=", value, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdIn(List<Integer> values) {
            addCriterion("Approval_Id in", values, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdNotIn(List<Integer> values) {
            addCriterion("Approval_Id not in", values, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdBetween(Integer value1, Integer value2) {
            addCriterion("Approval_Id between", value1, value2, "approval_Id");
            return (Criteria) this;
        }

        public Criteria andApproval_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Approval_Id not between", value1, value2, "approval_Id");
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

        public Criteria andUser_CodeIsNull() {
            addCriterion("User_Code is null");
            return (Criteria) this;
        }

        public Criteria andUser_CodeIsNotNull() {
            addCriterion("User_Code is not null");
            return (Criteria) this;
        }

        public Criteria andUser_CodeEqualTo(String value) {
            addCriterion("User_Code =", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeNotEqualTo(String value) {
            addCriterion("User_Code <>", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeGreaterThan(String value) {
            addCriterion("User_Code >", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("User_Code >=", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeLessThan(String value) {
            addCriterion("User_Code <", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeLessThanOrEqualTo(String value) {
            addCriterion("User_Code <=", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeLike(String value) {
            addCriterion("User_Code like", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeNotLike(String value) {
            addCriterion("User_Code not like", value, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeIn(List<String> values) {
            addCriterion("User_Code in", values, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeNotIn(List<String> values) {
            addCriterion("User_Code not in", values, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeBetween(String value1, String value2) {
            addCriterion("User_Code between", value1, value2, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_CodeNotBetween(String value1, String value2) {
            addCriterion("User_Code not between", value1, value2, "user_Code");
            return (Criteria) this;
        }

        public Criteria andUser_NameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUser_NameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_NameEqualTo(String value) {
            addCriterion("User_Name =", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameGreaterThan(String value) {
            addCriterion("User_Name >", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameLessThan(String value) {
            addCriterion("User_Name <", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameLike(String value) {
            addCriterion("User_Name like", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameNotLike(String value) {
            addCriterion("User_Name not like", value, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameIn(List<String> values) {
            addCriterion("User_Name in", values, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "user_Name");
            return (Criteria) this;
        }

        public Criteria andUser_NameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "user_Name");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberIsNull() {
            addCriterion("Phone_Number is null");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberIsNotNull() {
            addCriterion("Phone_Number is not null");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberEqualTo(String value) {
            addCriterion("Phone_Number =", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberNotEqualTo(String value) {
            addCriterion("Phone_Number <>", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberGreaterThan(String value) {
            addCriterion("Phone_Number >", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberGreaterThanOrEqualTo(String value) {
            addCriterion("Phone_Number >=", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberLessThan(String value) {
            addCriterion("Phone_Number <", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberLessThanOrEqualTo(String value) {
            addCriterion("Phone_Number <=", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberLike(String value) {
            addCriterion("Phone_Number like", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberNotLike(String value) {
            addCriterion("Phone_Number not like", value, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberIn(List<String> values) {
            addCriterion("Phone_Number in", values, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberNotIn(List<String> values) {
            addCriterion("Phone_Number not in", values, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberBetween(String value1, String value2) {
            addCriterion("Phone_Number between", value1, value2, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andPhone_NumberNotBetween(String value1, String value2) {
            addCriterion("Phone_Number not between", value1, value2, "phone_Number");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCase_TitleIsNull() {
            addCriterion("Case_Title is null");
            return (Criteria) this;
        }

        public Criteria andCase_TitleIsNotNull() {
            addCriterion("Case_Title is not null");
            return (Criteria) this;
        }

        public Criteria andCase_TitleEqualTo(String value) {
            addCriterion("Case_Title =", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleNotEqualTo(String value) {
            addCriterion("Case_Title <>", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleGreaterThan(String value) {
            addCriterion("Case_Title >", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleGreaterThanOrEqualTo(String value) {
            addCriterion("Case_Title >=", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleLessThan(String value) {
            addCriterion("Case_Title <", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleLessThanOrEqualTo(String value) {
            addCriterion("Case_Title <=", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleLike(String value) {
            addCriterion("Case_Title like", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleNotLike(String value) {
            addCriterion("Case_Title not like", value, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleIn(List<String> values) {
            addCriterion("Case_Title in", values, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleNotIn(List<String> values) {
            addCriterion("Case_Title not in", values, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleBetween(String value1, String value2) {
            addCriterion("Case_Title between", value1, value2, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_TitleNotBetween(String value1, String value2) {
            addCriterion("Case_Title not between", value1, value2, "case_Title");
            return (Criteria) this;
        }

        public Criteria andCase_StatusIsNull() {
            addCriterion("Case_Status is null");
            return (Criteria) this;
        }

        public Criteria andCase_StatusIsNotNull() {
            addCriterion("Case_Status is not null");
            return (Criteria) this;
        }

        public Criteria andCase_StatusEqualTo(Integer value) {
            addCriterion("Case_Status =", value, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusNotEqualTo(Integer value) {
            addCriterion("Case_Status <>", value, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusGreaterThan(Integer value) {
            addCriterion("Case_Status >", value, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Case_Status >=", value, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusLessThan(Integer value) {
            addCriterion("Case_Status <", value, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusLessThanOrEqualTo(Integer value) {
            addCriterion("Case_Status <=", value, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusIn(List<Integer> values) {
            addCriterion("Case_Status in", values, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusNotIn(List<Integer> values) {
            addCriterion("Case_Status not in", values, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusBetween(Integer value1, Integer value2) {
            addCriterion("Case_Status between", value1, value2, "case_Status");
            return (Criteria) this;
        }

        public Criteria andCase_StatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Case_Status not between", value1, value2, "case_Status");
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