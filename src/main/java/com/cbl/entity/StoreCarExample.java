package com.cbl.entity;

import java.util.ArrayList;
import java.util.List;

public class StoreCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreCarExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andConfigurationIsNull() {
            addCriterion("configuration is null");
            return (Criteria) this;
        }

        public Criteria andConfigurationIsNotNull() {
            addCriterion("configuration is not null");
            return (Criteria) this;
        }

        public Criteria andConfigurationEqualTo(String value) {
            addCriterion("configuration =", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotEqualTo(String value) {
            addCriterion("configuration <>", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationGreaterThan(String value) {
            addCriterion("configuration >", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationGreaterThanOrEqualTo(String value) {
            addCriterion("configuration >=", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationLessThan(String value) {
            addCriterion("configuration <", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationLessThanOrEqualTo(String value) {
            addCriterion("configuration <=", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationLike(String value) {
            addCriterion("configuration like", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotLike(String value) {
            addCriterion("configuration not like", value, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationIn(List<String> values) {
            addCriterion("configuration in", values, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotIn(List<String> values) {
            addCriterion("configuration not in", values, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationBetween(String value1, String value2) {
            addCriterion("configuration between", value1, value2, "configuration");
            return (Criteria) this;
        }

        public Criteria andConfigurationNotBetween(String value1, String value2) {
            addCriterion("configuration not between", value1, value2, "configuration");
            return (Criteria) this;
        }

        public Criteria andCarphotoIsNull() {
            addCriterion("carPhoto is null");
            return (Criteria) this;
        }

        public Criteria andCarphotoIsNotNull() {
            addCriterion("carPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andCarphotoEqualTo(String value) {
            addCriterion("carPhoto =", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotEqualTo(String value) {
            addCriterion("carPhoto <>", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoGreaterThan(String value) {
            addCriterion("carPhoto >", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoGreaterThanOrEqualTo(String value) {
            addCriterion("carPhoto >=", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLessThan(String value) {
            addCriterion("carPhoto <", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLessThanOrEqualTo(String value) {
            addCriterion("carPhoto <=", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoLike(String value) {
            addCriterion("carPhoto like", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotLike(String value) {
            addCriterion("carPhoto not like", value, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoIn(List<String> values) {
            addCriterion("carPhoto in", values, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotIn(List<String> values) {
            addCriterion("carPhoto not in", values, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoBetween(String value1, String value2) {
            addCriterion("carPhoto between", value1, value2, "carphoto");
            return (Criteria) this;
        }

        public Criteria andCarphotoNotBetween(String value1, String value2) {
            addCriterion("carPhoto not between", value1, value2, "carphoto");
            return (Criteria) this;
        }

        public Criteria andSeatsIsNull() {
            addCriterion("seats is null");
            return (Criteria) this;
        }

        public Criteria andSeatsIsNotNull() {
            addCriterion("seats is not null");
            return (Criteria) this;
        }

        public Criteria andSeatsEqualTo(Integer value) {
            addCriterion("seats =", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotEqualTo(Integer value) {
            addCriterion("seats <>", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsGreaterThan(Integer value) {
            addCriterion("seats >", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsGreaterThanOrEqualTo(Integer value) {
            addCriterion("seats >=", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsLessThan(Integer value) {
            addCriterion("seats <", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsLessThanOrEqualTo(Integer value) {
            addCriterion("seats <=", value, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsIn(List<Integer> values) {
            addCriterion("seats in", values, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotIn(List<Integer> values) {
            addCriterion("seats not in", values, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsBetween(Integer value1, Integer value2) {
            addCriterion("seats between", value1, value2, "seats");
            return (Criteria) this;
        }

        public Criteria andSeatsNotBetween(Integer value1, Integer value2) {
            addCriterion("seats not between", value1, value2, "seats");
            return (Criteria) this;
        }

        public Criteria andDoorsIsNull() {
            addCriterion("doors is null");
            return (Criteria) this;
        }

        public Criteria andDoorsIsNotNull() {
            addCriterion("doors is not null");
            return (Criteria) this;
        }

        public Criteria andDoorsEqualTo(Integer value) {
            addCriterion("doors =", value, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsNotEqualTo(Integer value) {
            addCriterion("doors <>", value, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsGreaterThan(Integer value) {
            addCriterion("doors >", value, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsGreaterThanOrEqualTo(Integer value) {
            addCriterion("doors >=", value, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsLessThan(Integer value) {
            addCriterion("doors <", value, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsLessThanOrEqualTo(Integer value) {
            addCriterion("doors <=", value, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsIn(List<Integer> values) {
            addCriterion("doors in", values, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsNotIn(List<Integer> values) {
            addCriterion("doors not in", values, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsBetween(Integer value1, Integer value2) {
            addCriterion("doors between", value1, value2, "doors");
            return (Criteria) this;
        }

        public Criteria andDoorsNotBetween(Integer value1, Integer value2) {
            addCriterion("doors not between", value1, value2, "doors");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNull() {
            addCriterion("displacement is null");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNotNull() {
            addCriterion("displacement is not null");
            return (Criteria) this;
        }

        public Criteria andDisplacementEqualTo(String value) {
            addCriterion("displacement =", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotEqualTo(String value) {
            addCriterion("displacement <>", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThan(String value) {
            addCriterion("displacement >", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("displacement >=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThan(String value) {
            addCriterion("displacement <", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThanOrEqualTo(String value) {
            addCriterion("displacement <=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLike(String value) {
            addCriterion("displacement like", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotLike(String value) {
            addCriterion("displacement not like", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementIn(List<String> values) {
            addCriterion("displacement in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotIn(List<String> values) {
            addCriterion("displacement not in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementBetween(String value1, String value2) {
            addCriterion("displacement between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotBetween(String value1, String value2) {
            addCriterion("displacement not between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andNavigatorIsNull() {
            addCriterion("navigator is null");
            return (Criteria) this;
        }

        public Criteria andNavigatorIsNotNull() {
            addCriterion("navigator is not null");
            return (Criteria) this;
        }

        public Criteria andNavigatorEqualTo(Integer value) {
            addCriterion("navigator =", value, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorNotEqualTo(Integer value) {
            addCriterion("navigator <>", value, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorGreaterThan(Integer value) {
            addCriterion("navigator >", value, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("navigator >=", value, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorLessThan(Integer value) {
            addCriterion("navigator <", value, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorLessThanOrEqualTo(Integer value) {
            addCriterion("navigator <=", value, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorIn(List<Integer> values) {
            addCriterion("navigator in", values, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorNotIn(List<Integer> values) {
            addCriterion("navigator not in", values, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorBetween(Integer value1, Integer value2) {
            addCriterion("navigator between", value1, value2, "navigator");
            return (Criteria) this;
        }

        public Criteria andNavigatorNotBetween(Integer value1, Integer value2) {
            addCriterion("navigator not between", value1, value2, "navigator");
            return (Criteria) this;
        }

        public Criteria andPdcIsNull() {
            addCriterion("pdc is null");
            return (Criteria) this;
        }

        public Criteria andPdcIsNotNull() {
            addCriterion("pdc is not null");
            return (Criteria) this;
        }

        public Criteria andPdcEqualTo(Integer value) {
            addCriterion("pdc =", value, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcNotEqualTo(Integer value) {
            addCriterion("pdc <>", value, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcGreaterThan(Integer value) {
            addCriterion("pdc >", value, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdc >=", value, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcLessThan(Integer value) {
            addCriterion("pdc <", value, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcLessThanOrEqualTo(Integer value) {
            addCriterion("pdc <=", value, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcIn(List<Integer> values) {
            addCriterion("pdc in", values, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcNotIn(List<Integer> values) {
            addCriterion("pdc not in", values, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcBetween(Integer value1, Integer value2) {
            addCriterion("pdc between", value1, value2, "pdc");
            return (Criteria) this;
        }

        public Criteria andPdcNotBetween(Integer value1, Integer value2) {
            addCriterion("pdc not between", value1, value2, "pdc");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeIsNull() {
            addCriterion("drivenMode is null");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeIsNotNull() {
            addCriterion("drivenMode is not null");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeEqualTo(Integer value) {
            addCriterion("drivenMode =", value, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeNotEqualTo(Integer value) {
            addCriterion("drivenMode <>", value, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeGreaterThan(Integer value) {
            addCriterion("drivenMode >", value, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("drivenMode >=", value, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeLessThan(Integer value) {
            addCriterion("drivenMode <", value, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeLessThanOrEqualTo(Integer value) {
            addCriterion("drivenMode <=", value, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeIn(List<Integer> values) {
            addCriterion("drivenMode in", values, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeNotIn(List<Integer> values) {
            addCriterion("drivenMode not in", values, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeBetween(Integer value1, Integer value2) {
            addCriterion("drivenMode between", value1, value2, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andDrivenmodeNotBetween(Integer value1, Integer value2) {
            addCriterion("drivenMode not between", value1, value2, "drivenmode");
            return (Criteria) this;
        }

        public Criteria andFueltankageIsNull() {
            addCriterion("fuelTankage is null");
            return (Criteria) this;
        }

        public Criteria andFueltankageIsNotNull() {
            addCriterion("fuelTankage is not null");
            return (Criteria) this;
        }

        public Criteria andFueltankageEqualTo(Integer value) {
            addCriterion("fuelTankage =", value, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageNotEqualTo(Integer value) {
            addCriterion("fuelTankage <>", value, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageGreaterThan(Integer value) {
            addCriterion("fuelTankage >", value, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuelTankage >=", value, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageLessThan(Integer value) {
            addCriterion("fuelTankage <", value, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageLessThanOrEqualTo(Integer value) {
            addCriterion("fuelTankage <=", value, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageIn(List<Integer> values) {
            addCriterion("fuelTankage in", values, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageNotIn(List<Integer> values) {
            addCriterion("fuelTankage not in", values, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageBetween(Integer value1, Integer value2) {
            addCriterion("fuelTankage between", value1, value2, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andFueltankageNotBetween(Integer value1, Integer value2) {
            addCriterion("fuelTankage not between", value1, value2, "fueltankage");
            return (Criteria) this;
        }

        public Criteria andGearboxIsNull() {
            addCriterion("gearbox is null");
            return (Criteria) this;
        }

        public Criteria andGearboxIsNotNull() {
            addCriterion("gearbox is not null");
            return (Criteria) this;
        }

        public Criteria andGearboxEqualTo(Integer value) {
            addCriterion("gearbox =", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotEqualTo(Integer value) {
            addCriterion("gearbox <>", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxGreaterThan(Integer value) {
            addCriterion("gearbox >", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxGreaterThanOrEqualTo(Integer value) {
            addCriterion("gearbox >=", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxLessThan(Integer value) {
            addCriterion("gearbox <", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxLessThanOrEqualTo(Integer value) {
            addCriterion("gearbox <=", value, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxIn(List<Integer> values) {
            addCriterion("gearbox in", values, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotIn(List<Integer> values) {
            addCriterion("gearbox not in", values, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxBetween(Integer value1, Integer value2) {
            addCriterion("gearbox between", value1, value2, "gearbox");
            return (Criteria) this;
        }

        public Criteria andGearboxNotBetween(Integer value1, Integer value2) {
            addCriterion("gearbox not between", value1, value2, "gearbox");
            return (Criteria) this;
        }

        public Criteria andSkylightIsNull() {
            addCriterion("skylight is null");
            return (Criteria) this;
        }

        public Criteria andSkylightIsNotNull() {
            addCriterion("skylight is not null");
            return (Criteria) this;
        }

        public Criteria andSkylightEqualTo(Integer value) {
            addCriterion("skylight =", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightNotEqualTo(Integer value) {
            addCriterion("skylight <>", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightGreaterThan(Integer value) {
            addCriterion("skylight >", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightGreaterThanOrEqualTo(Integer value) {
            addCriterion("skylight >=", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightLessThan(Integer value) {
            addCriterion("skylight <", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightLessThanOrEqualTo(Integer value) {
            addCriterion("skylight <=", value, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightIn(List<Integer> values) {
            addCriterion("skylight in", values, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightNotIn(List<Integer> values) {
            addCriterion("skylight not in", values, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightBetween(Integer value1, Integer value2) {
            addCriterion("skylight between", value1, value2, "skylight");
            return (Criteria) this;
        }

        public Criteria andSkylightNotBetween(Integer value1, Integer value2) {
            addCriterion("skylight not between", value1, value2, "skylight");
            return (Criteria) this;
        }

        public Criteria andAircellIsNull() {
            addCriterion("aircell is null");
            return (Criteria) this;
        }

        public Criteria andAircellIsNotNull() {
            addCriterion("aircell is not null");
            return (Criteria) this;
        }

        public Criteria andAircellEqualTo(Integer value) {
            addCriterion("aircell =", value, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellNotEqualTo(Integer value) {
            addCriterion("aircell <>", value, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellGreaterThan(Integer value) {
            addCriterion("aircell >", value, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircell >=", value, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellLessThan(Integer value) {
            addCriterion("aircell <", value, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellLessThanOrEqualTo(Integer value) {
            addCriterion("aircell <=", value, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellIn(List<Integer> values) {
            addCriterion("aircell in", values, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellNotIn(List<Integer> values) {
            addCriterion("aircell not in", values, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellBetween(Integer value1, Integer value2) {
            addCriterion("aircell between", value1, value2, "aircell");
            return (Criteria) this;
        }

        public Criteria andAircellNotBetween(Integer value1, Integer value2) {
            addCriterion("aircell not between", value1, value2, "aircell");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Float value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Float value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Float value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Float value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Float value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Float value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Float> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Float> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Float value1, Float value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Float value1, Float value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesIsNull() {
            addCriterion("nodeductibles is null");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesIsNotNull() {
            addCriterion("nodeductibles is not null");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesEqualTo(Float value) {
            addCriterion("nodeductibles =", value, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesNotEqualTo(Float value) {
            addCriterion("nodeductibles <>", value, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesGreaterThan(Float value) {
            addCriterion("nodeductibles >", value, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesGreaterThanOrEqualTo(Float value) {
            addCriterion("nodeductibles >=", value, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesLessThan(Float value) {
            addCriterion("nodeductibles <", value, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesLessThanOrEqualTo(Float value) {
            addCriterion("nodeductibles <=", value, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesIn(List<Float> values) {
            addCriterion("nodeductibles in", values, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesNotIn(List<Float> values) {
            addCriterion("nodeductibles not in", values, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesBetween(Float value1, Float value2) {
            addCriterion("nodeductibles between", value1, value2, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andNodeductiblesNotBetween(Float value1, Float value2) {
            addCriterion("nodeductibles not between", value1, value2, "nodeductibles");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTotalstarIsNull() {
            addCriterion("totalStar is null");
            return (Criteria) this;
        }

        public Criteria andTotalstarIsNotNull() {
            addCriterion("totalStar is not null");
            return (Criteria) this;
        }

        public Criteria andTotalstarEqualTo(Integer value) {
            addCriterion("totalStar =", value, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarNotEqualTo(Integer value) {
            addCriterion("totalStar <>", value, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarGreaterThan(Integer value) {
            addCriterion("totalStar >", value, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalStar >=", value, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarLessThan(Integer value) {
            addCriterion("totalStar <", value, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarLessThanOrEqualTo(Integer value) {
            addCriterion("totalStar <=", value, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarIn(List<Integer> values) {
            addCriterion("totalStar in", values, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarNotIn(List<Integer> values) {
            addCriterion("totalStar not in", values, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarBetween(Integer value1, Integer value2) {
            addCriterion("totalStar between", value1, value2, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalstarNotBetween(Integer value1, Integer value2) {
            addCriterion("totalStar not between", value1, value2, "totalstar");
            return (Criteria) this;
        }

        public Criteria andTotalcommentIsNull() {
            addCriterion("totalComment is null");
            return (Criteria) this;
        }

        public Criteria andTotalcommentIsNotNull() {
            addCriterion("totalComment is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcommentEqualTo(Integer value) {
            addCriterion("totalComment =", value, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentNotEqualTo(Integer value) {
            addCriterion("totalComment <>", value, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentGreaterThan(Integer value) {
            addCriterion("totalComment >", value, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalComment >=", value, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentLessThan(Integer value) {
            addCriterion("totalComment <", value, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentLessThanOrEqualTo(Integer value) {
            addCriterion("totalComment <=", value, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentIn(List<Integer> values) {
            addCriterion("totalComment in", values, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentNotIn(List<Integer> values) {
            addCriterion("totalComment not in", values, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentBetween(Integer value1, Integer value2) {
            addCriterion("totalComment between", value1, value2, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andTotalcommentNotBetween(Integer value1, Integer value2) {
            addCriterion("totalComment not between", value1, value2, "totalcomment");
            return (Criteria) this;
        }

        public Criteria andAvgstarIsNull() {
            addCriterion("avgStar is null");
            return (Criteria) this;
        }

        public Criteria andAvgstarIsNotNull() {
            addCriterion("avgStar is not null");
            return (Criteria) this;
        }

        public Criteria andAvgstarEqualTo(Float value) {
            addCriterion("avgStar =", value, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarNotEqualTo(Float value) {
            addCriterion("avgStar <>", value, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarGreaterThan(Float value) {
            addCriterion("avgStar >", value, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarGreaterThanOrEqualTo(Float value) {
            addCriterion("avgStar >=", value, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarLessThan(Float value) {
            addCriterion("avgStar <", value, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarLessThanOrEqualTo(Float value) {
            addCriterion("avgStar <=", value, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarIn(List<Float> values) {
            addCriterion("avgStar in", values, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarNotIn(List<Float> values) {
            addCriterion("avgStar not in", values, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarBetween(Float value1, Float value2) {
            addCriterion("avgStar between", value1, value2, "avgstar");
            return (Criteria) this;
        }

        public Criteria andAvgstarNotBetween(Float value1, Float value2) {
            addCriterion("avgStar not between", value1, value2, "avgstar");
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