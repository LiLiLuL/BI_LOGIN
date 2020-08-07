package com.tianma.BI_Process.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryAdminDimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryAdminDimExample() {
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

        public Criteria andCategory_CodeIsNull() {
            addCriterion("Category_Code is null");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeIsNotNull() {
            addCriterion("Category_Code is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeEqualTo(String value) {
            addCriterion("Category_Code =", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeNotEqualTo(String value) {
            addCriterion("Category_Code <>", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeGreaterThan(String value) {
            addCriterion("Category_Code >", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Category_Code >=", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeLessThan(String value) {
            addCriterion("Category_Code <", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeLessThanOrEqualTo(String value) {
            addCriterion("Category_Code <=", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeLike(String value) {
            addCriterion("Category_Code like", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeNotLike(String value) {
            addCriterion("Category_Code not like", value, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeIn(List<String> values) {
            addCriterion("Category_Code in", values, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeNotIn(List<String> values) {
            addCriterion("Category_Code not in", values, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeBetween(String value1, String value2) {
            addCriterion("Category_Code between", value1, value2, "category_Code");
            return (Criteria) this;
        }

        public Criteria andCategory_CodeNotBetween(String value1, String value2) {
            addCriterion("Category_Code not between", value1, value2, "category_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeIsNull() {
            addCriterion("Parameter_Code is null");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeIsNotNull() {
            addCriterion("Parameter_Code is not null");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeEqualTo(String value) {
            addCriterion("Parameter_Code =", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeNotEqualTo(String value) {
            addCriterion("Parameter_Code <>", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeGreaterThan(String value) {
            addCriterion("Parameter_Code >", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Parameter_Code >=", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeLessThan(String value) {
            addCriterion("Parameter_Code <", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeLessThanOrEqualTo(String value) {
            addCriterion("Parameter_Code <=", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeLike(String value) {
            addCriterion("Parameter_Code like", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeNotLike(String value) {
            addCriterion("Parameter_Code not like", value, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeIn(List<String> values) {
            addCriterion("Parameter_Code in", values, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeNotIn(List<String> values) {
            addCriterion("Parameter_Code not in", values, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeBetween(String value1, String value2) {
            addCriterion("Parameter_Code between", value1, value2, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andParameter_CodeNotBetween(String value1, String value2) {
            addCriterion("Parameter_Code not between", value1, value2, "parameter_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeIsNull() {
            addCriterion("Admin_Code is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeIsNotNull() {
            addCriterion("Admin_Code is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeEqualTo(String value) {
            addCriterion("Admin_Code =", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeNotEqualTo(String value) {
            addCriterion("Admin_Code <>", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeGreaterThan(String value) {
            addCriterion("Admin_Code >", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Admin_Code >=", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeLessThan(String value) {
            addCriterion("Admin_Code <", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeLessThanOrEqualTo(String value) {
            addCriterion("Admin_Code <=", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeLike(String value) {
            addCriterion("Admin_Code like", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeNotLike(String value) {
            addCriterion("Admin_Code not like", value, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeIn(List<String> values) {
            addCriterion("Admin_Code in", values, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeNotIn(List<String> values) {
            addCriterion("Admin_Code not in", values, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeBetween(String value1, String value2) {
            addCriterion("Admin_Code between", value1, value2, "admin_Code");
            return (Criteria) this;
        }

        public Criteria andAdmin_CodeNotBetween(String value1, String value2) {
            addCriterion("Admin_Code not between", value1, value2, "admin_Code");
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

        public Criteria andInvalid_FlagIsNull() {
            addCriterion("Invalid_Flag is null");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagIsNotNull() {
            addCriterion("Invalid_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagEqualTo(Boolean value) {
            addCriterion("Invalid_Flag =", value, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagNotEqualTo(Boolean value) {
            addCriterion("Invalid_Flag <>", value, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagGreaterThan(Boolean value) {
            addCriterion("Invalid_Flag >", value, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Invalid_Flag >=", value, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagLessThan(Boolean value) {
            addCriterion("Invalid_Flag <", value, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagLessThanOrEqualTo(Boolean value) {
            addCriterion("Invalid_Flag <=", value, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagIn(List<Boolean> values) {
            addCriterion("Invalid_Flag in", values, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagNotIn(List<Boolean> values) {
            addCriterion("Invalid_Flag not in", values, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagBetween(Boolean value1, Boolean value2) {
            addCriterion("Invalid_Flag between", value1, value2, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andInvalid_FlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Invalid_Flag not between", value1, value2, "invalid_Flag");
            return (Criteria) this;
        }

        public Criteria andOper_SignIsNull() {
            addCriterion("Oper_Sign is null");
            return (Criteria) this;
        }

        public Criteria andOper_SignIsNotNull() {
            addCriterion("Oper_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andOper_SignEqualTo(String value) {
            addCriterion("Oper_Sign =", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignNotEqualTo(String value) {
            addCriterion("Oper_Sign <>", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignGreaterThan(String value) {
            addCriterion("Oper_Sign >", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignGreaterThanOrEqualTo(String value) {
            addCriterion("Oper_Sign >=", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignLessThan(String value) {
            addCriterion("Oper_Sign <", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignLessThanOrEqualTo(String value) {
            addCriterion("Oper_Sign <=", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignLike(String value) {
            addCriterion("Oper_Sign like", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignNotLike(String value) {
            addCriterion("Oper_Sign not like", value, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignIn(List<String> values) {
            addCriterion("Oper_Sign in", values, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignNotIn(List<String> values) {
            addCriterion("Oper_Sign not in", values, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignBetween(String value1, String value2) {
            addCriterion("Oper_Sign between", value1, value2, "oper_Sign");
            return (Criteria) this;
        }

        public Criteria andOper_SignNotBetween(String value1, String value2) {
            addCriterion("Oper_Sign not between", value1, value2, "oper_Sign");
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