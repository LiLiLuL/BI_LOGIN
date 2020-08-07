package com.tianma.BI_Process.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrgDimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrgDimExample() {
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

        public Criteria andOrg_CodeIsNull() {
            addCriterion("Org_Code is null");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeIsNotNull() {
            addCriterion("Org_Code is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeEqualTo(String value) {
            addCriterion("Org_Code =", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeNotEqualTo(String value) {
            addCriterion("Org_Code <>", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeGreaterThan(String value) {
            addCriterion("Org_Code >", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeGreaterThanOrEqualTo(String value) {
            addCriterion("Org_Code >=", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeLessThan(String value) {
            addCriterion("Org_Code <", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeLessThanOrEqualTo(String value) {
            addCriterion("Org_Code <=", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeLike(String value) {
            addCriterion("Org_Code like", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeNotLike(String value) {
            addCriterion("Org_Code not like", value, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeIn(List<String> values) {
            addCriterion("Org_Code in", values, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeNotIn(List<String> values) {
            addCriterion("Org_Code not in", values, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeBetween(String value1, String value2) {
            addCriterion("Org_Code between", value1, value2, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_CodeNotBetween(String value1, String value2) {
            addCriterion("Org_Code not between", value1, value2, "org_Code");
            return (Criteria) this;
        }

        public Criteria andOrg_NameIsNull() {
            addCriterion("Org_Name is null");
            return (Criteria) this;
        }

        public Criteria andOrg_NameIsNotNull() {
            addCriterion("Org_Name is not null");
            return (Criteria) this;
        }

        public Criteria andOrg_NameEqualTo(String value) {
            addCriterion("Org_Name =", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameNotEqualTo(String value) {
            addCriterion("Org_Name <>", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameGreaterThan(String value) {
            addCriterion("Org_Name >", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameGreaterThanOrEqualTo(String value) {
            addCriterion("Org_Name >=", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameLessThan(String value) {
            addCriterion("Org_Name <", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameLessThanOrEqualTo(String value) {
            addCriterion("Org_Name <=", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameLike(String value) {
            addCriterion("Org_Name like", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameNotLike(String value) {
            addCriterion("Org_Name not like", value, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameIn(List<String> values) {
            addCriterion("Org_Name in", values, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameNotIn(List<String> values) {
            addCriterion("Org_Name not in", values, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameBetween(String value1, String value2) {
            addCriterion("Org_Name between", value1, value2, "org_Name");
            return (Criteria) this;
        }

        public Criteria andOrg_NameNotBetween(String value1, String value2) {
            addCriterion("Org_Name not between", value1, value2, "org_Name");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentIsNull() {
            addCriterion("Parent_Department is null");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentIsNotNull() {
            addCriterion("Parent_Department is not null");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentEqualTo(String value) {
            addCriterion("Parent_Department =", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentNotEqualTo(String value) {
            addCriterion("Parent_Department <>", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentGreaterThan(String value) {
            addCriterion("Parent_Department >", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("Parent_Department >=", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentLessThan(String value) {
            addCriterion("Parent_Department <", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentLessThanOrEqualTo(String value) {
            addCriterion("Parent_Department <=", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentLike(String value) {
            addCriterion("Parent_Department like", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentNotLike(String value) {
            addCriterion("Parent_Department not like", value, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentIn(List<String> values) {
            addCriterion("Parent_Department in", values, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentNotIn(List<String> values) {
            addCriterion("Parent_Department not in", values, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentBetween(String value1, String value2) {
            addCriterion("Parent_Department between", value1, value2, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andParent_DepartmentNotBetween(String value1, String value2) {
            addCriterion("Parent_Department not between", value1, value2, "parent_Department");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagIsNull() {
            addCriterion("Level_Flag is null");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagIsNotNull() {
            addCriterion("Level_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagEqualTo(String value) {
            addCriterion("Level_Flag =", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagNotEqualTo(String value) {
            addCriterion("Level_Flag <>", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagGreaterThan(String value) {
            addCriterion("Level_Flag >", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagGreaterThanOrEqualTo(String value) {
            addCriterion("Level_Flag >=", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagLessThan(String value) {
            addCriterion("Level_Flag <", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagLessThanOrEqualTo(String value) {
            addCriterion("Level_Flag <=", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagLike(String value) {
            addCriterion("Level_Flag like", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagNotLike(String value) {
            addCriterion("Level_Flag not like", value, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagIn(List<String> values) {
            addCriterion("Level_Flag in", values, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagNotIn(List<String> values) {
            addCriterion("Level_Flag not in", values, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagBetween(String value1, String value2) {
            addCriterion("Level_Flag between", value1, value2, "level_Flag");
            return (Criteria) this;
        }

        public Criteria andLevel_FlagNotBetween(String value1, String value2) {
            addCriterion("Level_Flag not between", value1, value2, "level_Flag");
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

        public Criteria andCreate_userIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreate_userIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_userEqualTo(String value) {
            addCriterion("create_user =", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userNotEqualTo(String value) {
            addCriterion("create_user <>", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userGreaterThan(String value) {
            addCriterion("create_user >", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userLessThan(String value) {
            addCriterion("create_user <", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userLike(String value) {
            addCriterion("create_user like", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userNotLike(String value) {
            addCriterion("create_user not like", value, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userIn(List<String> values) {
            addCriterion("create_user in", values, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userNotIn(List<String> values) {
            addCriterion("create_user not in", values, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "create_user");
            return (Criteria) this;
        }

        public Criteria andCreate_userNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "create_user");
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