package com.guonl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TagPlateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TagPlateExample() {
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

    public TagPlateExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TagPlateExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        TagPlateExample example = new TagPlateExample();
        return example.createCriteria();
    }

    public TagPlateExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TagPlateExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andIdEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

        public Criteria andPlateIdIsNull() {
            addCriterion("plate_id is null");
            return (Criteria) this;
        }

        public Criteria andPlateIdIsNotNull() {
            addCriterion("plate_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlateIdEqualTo(Integer value) {
            addCriterion("plate_id =", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdNotEqualTo(Integer value) {
            addCriterion("plate_id <>", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThan(Integer value) {
            addCriterion("plate_id >", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plate_id >=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThan(Integer value) {
            addCriterion("plate_id <", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanOrEqualTo(Integer value) {
            addCriterion("plate_id <=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdIn(List<Integer> values) {
            addCriterion("plate_id in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotIn(List<Integer> values) {
            addCriterion("plate_id not in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdBetween(Integer value1, Integer value2) {
            addCriterion("plate_id between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plate_id not between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateNameIsNull() {
            addCriterion("plate_name is null");
            return (Criteria) this;
        }

        public Criteria andPlateNameIsNotNull() {
            addCriterion("plate_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNameEqualTo(String value) {
            addCriterion("plate_name =", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameNotEqualTo(String value) {
            addCriterion("plate_name <>", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThan(String value) {
            addCriterion("plate_name >", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThanOrEqualTo(String value) {
            addCriterion("plate_name >=", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThan(String value) {
            addCriterion("plate_name <", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThanOrEqualTo(String value) {
            addCriterion("plate_name <=", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameLike(String value) {
            addCriterion("plate_name like", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotLike(String value) {
            addCriterion("plate_name not like", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameIn(List<String> values) {
            addCriterion("plate_name in", values, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotIn(List<String> values) {
            addCriterion("plate_name not in", values, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameBetween(String value1, String value2) {
            addCriterion("plate_name between", value1, value2, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotBetween(String value1, String value2) {
            addCriterion("plate_name not between", value1, value2, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateDescIsNull() {
            addCriterion("plate_desc is null");
            return (Criteria) this;
        }

        public Criteria andPlateDescIsNotNull() {
            addCriterion("plate_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPlateDescEqualTo(String value) {
            addCriterion("plate_desc =", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateDescNotEqualTo(String value) {
            addCriterion("plate_desc <>", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateDescGreaterThan(String value) {
            addCriterion("plate_desc >", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateDescGreaterThanOrEqualTo(String value) {
            addCriterion("plate_desc >=", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateDescLessThan(String value) {
            addCriterion("plate_desc <", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateDescLessThanOrEqualTo(String value) {
            addCriterion("plate_desc <=", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("plate_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateDescLike(String value) {
            addCriterion("plate_desc like", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescNotLike(String value) {
            addCriterion("plate_desc not like", value, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescIn(List<String> values) {
            addCriterion("plate_desc in", values, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescNotIn(List<String> values) {
            addCriterion("plate_desc not in", values, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescBetween(String value1, String value2) {
            addCriterion("plate_desc between", value1, value2, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andPlateDescNotBetween(String value1, String value2) {
            addCriterion("plate_desc not between", value1, value2, "plateDesc");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountIsNull() {
            addCriterion("core_stocks_count is null");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountIsNotNull() {
            addCriterion("core_stocks_count is not null");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountEqualTo(Integer value) {
            addCriterion("core_stocks_count =", value, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("core_stocks_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountNotEqualTo(Integer value) {
            addCriterion("core_stocks_count <>", value, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("core_stocks_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountGreaterThan(Integer value) {
            addCriterion("core_stocks_count >", value, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("core_stocks_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("core_stocks_count >=", value, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("core_stocks_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountLessThan(Integer value) {
            addCriterion("core_stocks_count <", value, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("core_stocks_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountLessThanOrEqualTo(Integer value) {
            addCriterion("core_stocks_count <=", value, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("core_stocks_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountIn(List<Integer> values) {
            addCriterion("core_stocks_count in", values, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountNotIn(List<Integer> values) {
            addCriterion("core_stocks_count not in", values, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountBetween(Integer value1, Integer value2) {
            addCriterion("core_stocks_count between", value1, value2, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andCoreStocksCountNotBetween(Integer value1, Integer value2) {
            addCriterion("core_stocks_count not between", value1, value2, "coreStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountIsNull() {
            addCriterion("act_stocks_count is null");
            return (Criteria) this;
        }

        public Criteria andActStocksCountIsNotNull() {
            addCriterion("act_stocks_count is not null");
            return (Criteria) this;
        }

        public Criteria andActStocksCountEqualTo(Integer value) {
            addCriterion("act_stocks_count =", value, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("act_stocks_count = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActStocksCountNotEqualTo(Integer value) {
            addCriterion("act_stocks_count <>", value, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("act_stocks_count <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActStocksCountGreaterThan(Integer value) {
            addCriterion("act_stocks_count >", value, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("act_stocks_count > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActStocksCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_stocks_count >=", value, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("act_stocks_count >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActStocksCountLessThan(Integer value) {
            addCriterion("act_stocks_count <", value, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("act_stocks_count < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActStocksCountLessThanOrEqualTo(Integer value) {
            addCriterion("act_stocks_count <=", value, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("act_stocks_count <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActStocksCountIn(List<Integer> values) {
            addCriterion("act_stocks_count in", values, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountNotIn(List<Integer> values) {
            addCriterion("act_stocks_count not in", values, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountBetween(Integer value1, Integer value2) {
            addCriterion("act_stocks_count between", value1, value2, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andActStocksCountNotBetween(Integer value1, Integer value2) {
            addCriterion("act_stocks_count not between", value1, value2, "actStocksCount");
            return (Criteria) this;
        }

        public Criteria andHashCodeIsNull() {
            addCriterion("hash_code is null");
            return (Criteria) this;
        }

        public Criteria andHashCodeIsNotNull() {
            addCriterion("hash_code is not null");
            return (Criteria) this;
        }

        public Criteria andHashCodeEqualTo(Integer value) {
            addCriterion("hash_code =", value, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("hash_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHashCodeNotEqualTo(Integer value) {
            addCriterion("hash_code <>", value, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("hash_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHashCodeGreaterThan(Integer value) {
            addCriterion("hash_code >", value, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("hash_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHashCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hash_code >=", value, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("hash_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHashCodeLessThan(Integer value) {
            addCriterion("hash_code <", value, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("hash_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHashCodeLessThanOrEqualTo(Integer value) {
            addCriterion("hash_code <=", value, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("hash_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andHashCodeIn(List<Integer> values) {
            addCriterion("hash_code in", values, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeNotIn(List<Integer> values) {
            addCriterion("hash_code not in", values, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeBetween(Integer value1, Integer value2) {
            addCriterion("hash_code between", value1, value2, "hashCode");
            return (Criteria) this;
        }

        public Criteria andHashCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("hash_code not between", value1, value2, "hashCode");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_by = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_by <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_by > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_by >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_by < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_by <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("created_at <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("updated_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("updated_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("updated_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("updated_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("updated_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("updated_at <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("is_del = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("is_del <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("is_del > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("is_del >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("is_del < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualToColumn(TagPlateWithBLOBs.Column column) {
            addCriterion(new StringBuilder("is_del <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TagPlateExample example;

        protected Criteria(TagPlateExample example) {
            super();
            this.example = example;
        }

        public TagPlateExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.guonl.model.TagPlateExample example);
    }
}