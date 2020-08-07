package com.tianma.BI_Process.Domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApprovalNodeDimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalNodeDimExample() {
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

        public Criteria andModify_UserIsNull() {
            addCriterion("Modify_User is null");
            return (Criteria) this;
        }

        public Criteria andModify_UserIsNotNull() {
            addCriterion("Modify_User is not null");
            return (Criteria) this;
        }

        public Criteria andModify_UserEqualTo(String value) {
            addCriterion("Modify_User =", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserNotEqualTo(String value) {
            addCriterion("Modify_User <>", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserGreaterThan(String value) {
            addCriterion("Modify_User >", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserGreaterThanOrEqualTo(String value) {
            addCriterion("Modify_User >=", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserLessThan(String value) {
            addCriterion("Modify_User <", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserLessThanOrEqualTo(String value) {
            addCriterion("Modify_User <=", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserLike(String value) {
            addCriterion("Modify_User like", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserNotLike(String value) {
            addCriterion("Modify_User not like", value, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserIn(List<String> values) {
            addCriterion("Modify_User in", values, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserNotIn(List<String> values) {
            addCriterion("Modify_User not in", values, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserBetween(String value1, String value2) {
            addCriterion("Modify_User between", value1, value2, "modify_User");
            return (Criteria) this;
        }

        public Criteria andModify_UserNotBetween(String value1, String value2) {
            addCriterion("Modify_User not between", value1, value2, "modify_User");
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

        public Criteria andNode_TypeIsNull() {
            addCriterion("Node_Type is null");
            return (Criteria) this;
        }

        public Criteria andNode_TypeIsNotNull() {
            addCriterion("Node_Type is not null");
            return (Criteria) this;
        }

        public Criteria andNode_TypeEqualTo(Integer value) {
            addCriterion("Node_Type =", value, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeNotEqualTo(Integer value) {
            addCriterion("Node_Type <>", value, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeGreaterThan(Integer value) {
            addCriterion("Node_Type >", value, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Node_Type >=", value, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeLessThan(Integer value) {
            addCriterion("Node_Type <", value, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeLessThanOrEqualTo(Integer value) {
            addCriterion("Node_Type <=", value, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeIn(List<Integer> values) {
            addCriterion("Node_Type in", values, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeNotIn(List<Integer> values) {
            addCriterion("Node_Type not in", values, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeBetween(Integer value1, Integer value2) {
            addCriterion("Node_Type between", value1, value2, "node_Type");
            return (Criteria) this;
        }

        public Criteria andNode_TypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Node_Type not between", value1, value2, "node_Type");
            return (Criteria) this;
        }

        public Criteria andConditionsIsNull() {
            addCriterion("Conditions is null");
            return (Criteria) this;
        }

        public Criteria andConditionsIsNotNull() {
            addCriterion("Conditions is not null");
            return (Criteria) this;
        }

        public Criteria andConditionsEqualTo(String value) {
            addCriterion("Conditions =", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotEqualTo(String value) {
            addCriterion("Conditions <>", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsGreaterThan(String value) {
            addCriterion("Conditions >", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("Conditions >=", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLessThan(String value) {
            addCriterion("Conditions <", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLessThanOrEqualTo(String value) {
            addCriterion("Conditions <=", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLike(String value) {
            addCriterion("Conditions like", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotLike(String value) {
            addCriterion("Conditions not like", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsIn(List<String> values) {
            addCriterion("Conditions in", values, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotIn(List<String> values) {
            addCriterion("Conditions not in", values, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsBetween(String value1, String value2) {
            addCriterion("Conditions between", value1, value2, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotBetween(String value1, String value2) {
            addCriterion("Conditions not between", value1, value2, "conditions");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeIsNull() {
            addCriterion("Prev_Node is null");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeIsNotNull() {
            addCriterion("Prev_Node is not null");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeEqualTo(Integer value) {
            addCriterion("Prev_Node =", value, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeNotEqualTo(Integer value) {
            addCriterion("Prev_Node <>", value, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeGreaterThan(Integer value) {
            addCriterion("Prev_Node >", value, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Prev_Node >=", value, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeLessThan(Integer value) {
            addCriterion("Prev_Node <", value, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeLessThanOrEqualTo(Integer value) {
            addCriterion("Prev_Node <=", value, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeIn(List<Integer> values) {
            addCriterion("Prev_Node in", values, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeNotIn(List<Integer> values) {
            addCriterion("Prev_Node not in", values, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeBetween(Integer value1, Integer value2) {
            addCriterion("Prev_Node between", value1, value2, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andPrev_NodeNotBetween(Integer value1, Integer value2) {
            addCriterion("Prev_Node not between", value1, value2, "prev_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeIsNull() {
            addCriterion("Next_Node is null");
            return (Criteria) this;
        }

        public Criteria andNext_NodeIsNotNull() {
            addCriterion("Next_Node is not null");
            return (Criteria) this;
        }

        public Criteria andNext_NodeEqualTo(Integer value) {
            addCriterion("Next_Node =", value, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeNotEqualTo(Integer value) {
            addCriterion("Next_Node <>", value, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeGreaterThan(Integer value) {
            addCriterion("Next_Node >", value, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Next_Node >=", value, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeLessThan(Integer value) {
            addCriterion("Next_Node <", value, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeLessThanOrEqualTo(Integer value) {
            addCriterion("Next_Node <=", value, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeIn(List<Integer> values) {
            addCriterion("Next_Node in", values, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeNotIn(List<Integer> values) {
            addCriterion("Next_Node not in", values, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeBetween(Integer value1, Integer value2) {
            addCriterion("Next_Node between", value1, value2, "next_Node");
            return (Criteria) this;
        }

        public Criteria andNext_NodeNotBetween(Integer value1, Integer value2) {
            addCriterion("Next_Node not between", value1, value2, "next_Node");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
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