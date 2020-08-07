package com.tianma.BI_Process.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApprovalCaseRecordFactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalCaseRecordFactExample() {
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

        public Criteria andCase_IdIsNull() {
            addCriterion("Case_Id is null");
            return (Criteria) this;
        }

        public Criteria andCase_IdIsNotNull() {
            addCriterion("Case_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCase_IdEqualTo(Integer value) {
            addCriterion("Case_Id =", value, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdNotEqualTo(Integer value) {
            addCriterion("Case_Id <>", value, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdGreaterThan(Integer value) {
            addCriterion("Case_Id >", value, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Case_Id >=", value, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdLessThan(Integer value) {
            addCriterion("Case_Id <", value, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Case_Id <=", value, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdIn(List<Integer> values) {
            addCriterion("Case_Id in", values, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdNotIn(List<Integer> values) {
            addCriterion("Case_Id not in", values, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdBetween(Integer value1, Integer value2) {
            addCriterion("Case_Id between", value1, value2, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCase_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Case_Id not between", value1, value2, "case_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdIsNull() {
            addCriterion("Currenty_Node_Id is null");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdIsNotNull() {
            addCriterion("Currenty_Node_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdEqualTo(Integer value) {
            addCriterion("Currenty_Node_Id =", value, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdNotEqualTo(Integer value) {
            addCriterion("Currenty_Node_Id <>", value, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdGreaterThan(Integer value) {
            addCriterion("Currenty_Node_Id >", value, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Currenty_Node_Id >=", value, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdLessThan(Integer value) {
            addCriterion("Currenty_Node_Id <", value, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Currenty_Node_Id <=", value, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdIn(List<Integer> values) {
            addCriterion("Currenty_Node_Id in", values, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdNotIn(List<Integer> values) {
            addCriterion("Currenty_Node_Id not in", values, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdBetween(Integer value1, Integer value2) {
            addCriterion("Currenty_Node_Id between", value1, value2, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andCurrenty_Node_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Currenty_Node_Id not between", value1, value2, "currenty_Node_Id");
            return (Criteria) this;
        }

        public Criteria andOpration_userIsNull() {
            addCriterion("opration_user is null");
            return (Criteria) this;
        }

        public Criteria andOpration_userIsNotNull() {
            addCriterion("opration_user is not null");
            return (Criteria) this;
        }

        public Criteria andOpration_userEqualTo(Integer value) {
            addCriterion("opration_user =", value, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userNotEqualTo(Integer value) {
            addCriterion("opration_user <>", value, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userGreaterThan(Integer value) {
            addCriterion("opration_user >", value, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userGreaterThanOrEqualTo(Integer value) {
            addCriterion("opration_user >=", value, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userLessThan(Integer value) {
            addCriterion("opration_user <", value, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userLessThanOrEqualTo(Integer value) {
            addCriterion("opration_user <=", value, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userIn(List<Integer> values) {
            addCriterion("opration_user in", values, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userNotIn(List<Integer> values) {
            addCriterion("opration_user not in", values, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userBetween(Integer value1, Integer value2) {
            addCriterion("opration_user between", value1, value2, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_userNotBetween(Integer value1, Integer value2) {
            addCriterion("opration_user not between", value1, value2, "opration_user");
            return (Criteria) this;
        }

        public Criteria andOpration_resultIsNull() {
            addCriterion("opration_result is null");
            return (Criteria) this;
        }

        public Criteria andOpration_resultIsNotNull() {
            addCriterion("opration_result is not null");
            return (Criteria) this;
        }

        public Criteria andOpration_resultEqualTo(Integer value) {
            addCriterion("opration_result =", value, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultNotEqualTo(Integer value) {
            addCriterion("opration_result <>", value, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultGreaterThan(Integer value) {
            addCriterion("opration_result >", value, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultGreaterThanOrEqualTo(Integer value) {
            addCriterion("opration_result >=", value, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultLessThan(Integer value) {
            addCriterion("opration_result <", value, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultLessThanOrEqualTo(Integer value) {
            addCriterion("opration_result <=", value, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultIn(List<Integer> values) {
            addCriterion("opration_result in", values, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultNotIn(List<Integer> values) {
            addCriterion("opration_result not in", values, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultBetween(Integer value1, Integer value2) {
            addCriterion("opration_result between", value1, value2, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_resultNotBetween(Integer value1, Integer value2) {
            addCriterion("opration_result not between", value1, value2, "opration_result");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonIsNull() {
            addCriterion("opration_reason is null");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonIsNotNull() {
            addCriterion("opration_reason is not null");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonEqualTo(String value) {
            addCriterion("opration_reason =", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonNotEqualTo(String value) {
            addCriterion("opration_reason <>", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonGreaterThan(String value) {
            addCriterion("opration_reason >", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonGreaterThanOrEqualTo(String value) {
            addCriterion("opration_reason >=", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonLessThan(String value) {
            addCriterion("opration_reason <", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonLessThanOrEqualTo(String value) {
            addCriterion("opration_reason <=", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonLike(String value) {
            addCriterion("opration_reason like", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonNotLike(String value) {
            addCriterion("opration_reason not like", value, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonIn(List<String> values) {
            addCriterion("opration_reason in", values, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonNotIn(List<String> values) {
            addCriterion("opration_reason not in", values, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonBetween(String value1, String value2) {
            addCriterion("opration_reason between", value1, value2, "opration_reason");
            return (Criteria) this;
        }

        public Criteria andOpration_reasonNotBetween(String value1, String value2) {
            addCriterion("opration_reason not between", value1, value2, "opration_reason");
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