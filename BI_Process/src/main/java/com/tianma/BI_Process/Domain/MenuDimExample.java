package com.tianma.BI_Process.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuDimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuDimExample() {
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

        public Criteria andType_FlagIsNull() {
            addCriterion("Type_Flag is null");
            return (Criteria) this;
        }

        public Criteria andType_FlagIsNotNull() {
            addCriterion("Type_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andType_FlagEqualTo(Integer value) {
            addCriterion("Type_Flag =", value, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagNotEqualTo(Integer value) {
            addCriterion("Type_Flag <>", value, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagGreaterThan(Integer value) {
            addCriterion("Type_Flag >", value, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type_Flag >=", value, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagLessThan(Integer value) {
            addCriterion("Type_Flag <", value, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagLessThanOrEqualTo(Integer value) {
            addCriterion("Type_Flag <=", value, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagIn(List<Integer> values) {
            addCriterion("Type_Flag in", values, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagNotIn(List<Integer> values) {
            addCriterion("Type_Flag not in", values, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagBetween(Integer value1, Integer value2) {
            addCriterion("Type_Flag between", value1, value2, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andType_FlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Type_Flag not between", value1, value2, "type_Flag");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeIsNull() {
            addCriterion("Menu_Code is null");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeIsNotNull() {
            addCriterion("Menu_Code is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeEqualTo(String value) {
            addCriterion("Menu_Code =", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeNotEqualTo(String value) {
            addCriterion("Menu_Code <>", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeGreaterThan(String value) {
            addCriterion("Menu_Code >", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Menu_Code >=", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeLessThan(String value) {
            addCriterion("Menu_Code <", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeLessThanOrEqualTo(String value) {
            addCriterion("Menu_Code <=", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeLike(String value) {
            addCriterion("Menu_Code like", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeNotLike(String value) {
            addCriterion("Menu_Code not like", value, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeIn(List<String> values) {
            addCriterion("Menu_Code in", values, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeNotIn(List<String> values) {
            addCriterion("Menu_Code not in", values, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeBetween(String value1, String value2) {
            addCriterion("Menu_Code between", value1, value2, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_CodeNotBetween(String value1, String value2) {
            addCriterion("Menu_Code not between", value1, value2, "menu_Code");
            return (Criteria) this;
        }

        public Criteria andMenu_NameIsNull() {
            addCriterion("Menu_Name is null");
            return (Criteria) this;
        }

        public Criteria andMenu_NameIsNotNull() {
            addCriterion("Menu_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMenu_NameEqualTo(String value) {
            addCriterion("Menu_Name =", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameNotEqualTo(String value) {
            addCriterion("Menu_Name <>", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameGreaterThan(String value) {
            addCriterion("Menu_Name >", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameGreaterThanOrEqualTo(String value) {
            addCriterion("Menu_Name >=", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameLessThan(String value) {
            addCriterion("Menu_Name <", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameLessThanOrEqualTo(String value) {
            addCriterion("Menu_Name <=", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameLike(String value) {
            addCriterion("Menu_Name like", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameNotLike(String value) {
            addCriterion("Menu_Name not like", value, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameIn(List<String> values) {
            addCriterion("Menu_Name in", values, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameNotIn(List<String> values) {
            addCriterion("Menu_Name not in", values, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameBetween(String value1, String value2) {
            addCriterion("Menu_Name between", value1, value2, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andMenu_NameNotBetween(String value1, String value2) {
            addCriterion("Menu_Name not between", value1, value2, "menu_Name");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeIsNull() {
            addCriterion("Parent_Menu_Code is null");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeIsNotNull() {
            addCriterion("Parent_Menu_Code is not null");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeEqualTo(String value) {
            addCriterion("Parent_Menu_Code =", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeNotEqualTo(String value) {
            addCriterion("Parent_Menu_Code <>", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeGreaterThan(String value) {
            addCriterion("Parent_Menu_Code >", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Parent_Menu_Code >=", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeLessThan(String value) {
            addCriterion("Parent_Menu_Code <", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeLessThanOrEqualTo(String value) {
            addCriterion("Parent_Menu_Code <=", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeLike(String value) {
            addCriterion("Parent_Menu_Code like", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeNotLike(String value) {
            addCriterion("Parent_Menu_Code not like", value, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeIn(List<String> values) {
            addCriterion("Parent_Menu_Code in", values, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeNotIn(List<String> values) {
            addCriterion("Parent_Menu_Code not in", values, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeBetween(String value1, String value2) {
            addCriterion("Parent_Menu_Code between", value1, value2, "parent_Menu_Code");
            return (Criteria) this;
        }

        public Criteria andParent_Menu_CodeNotBetween(String value1, String value2) {
            addCriterion("Parent_Menu_Code not between", value1, value2, "parent_Menu_Code");
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