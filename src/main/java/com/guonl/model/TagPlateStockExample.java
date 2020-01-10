package com.guonl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TagPlateStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TagPlateStockExample() {
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

    public TagPlateStockExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TagPlateStockExample orderBy(String ... orderByClauses) {
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
        TagPlateStockExample example = new TagPlateStockExample();
        return example.createCriteria();
    }

    public TagPlateStockExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TagPlateStockExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(TagPlateStock.Column column) {
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

        public Criteria andPlateIdEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdNotEqualTo(Integer value) {
            addCriterion("plate_id <>", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThan(Integer value) {
            addCriterion("plate_id >", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plate_id >=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThan(Integer value) {
            addCriterion("plate_id <", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanOrEqualTo(Integer value) {
            addCriterion("plate_id <=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanOrEqualToColumn(TagPlateStock.Column column) {
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

        public Criteria andPlateNameEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameNotEqualTo(String value) {
            addCriterion("plate_name <>", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThan(String value) {
            addCriterion("plate_name >", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThanOrEqualTo(String value) {
            addCriterion("plate_name >=", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThan(String value) {
            addCriterion("plate_name <", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("plate_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThanOrEqualTo(String value) {
            addCriterion("plate_name <=", value, "plateName");
            return (Criteria) this;
        }

        public Criteria andPlateNameLessThanOrEqualToColumn(TagPlateStock.Column column) {
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

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_code = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_code <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_code > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_code >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_code < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_code <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockDescIsNull() {
            addCriterion("stock_desc is null");
            return (Criteria) this;
        }

        public Criteria andStockDescIsNotNull() {
            addCriterion("stock_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStockDescEqualTo(String value) {
            addCriterion("stock_desc =", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDescNotEqualTo(String value) {
            addCriterion("stock_desc <>", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDescGreaterThan(String value) {
            addCriterion("stock_desc >", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDescGreaterThanOrEqualTo(String value) {
            addCriterion("stock_desc >=", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDescLessThan(String value) {
            addCriterion("stock_desc <", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDescLessThanOrEqualTo(String value) {
            addCriterion("stock_desc <=", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("stock_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStockDescLike(String value) {
            addCriterion("stock_desc like", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescNotLike(String value) {
            addCriterion("stock_desc not like", value, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescIn(List<String> values) {
            addCriterion("stock_desc in", values, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescNotIn(List<String> values) {
            addCriterion("stock_desc not in", values, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescBetween(String value1, String value2) {
            addCriterion("stock_desc between", value1, value2, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andStockDescNotBetween(String value1, String value2) {
            addCriterion("stock_desc not between", value1, value2, "stockDesc");
            return (Criteria) this;
        }

        public Criteria andLogoImgIsNull() {
            addCriterion("logo_img is null");
            return (Criteria) this;
        }

        public Criteria andLogoImgIsNotNull() {
            addCriterion("logo_img is not null");
            return (Criteria) this;
        }

        public Criteria andLogoImgEqualTo(String value) {
            addCriterion("logo_img =", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("logo_img = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogoImgNotEqualTo(String value) {
            addCriterion("logo_img <>", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("logo_img <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogoImgGreaterThan(String value) {
            addCriterion("logo_img >", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("logo_img > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogoImgGreaterThanOrEqualTo(String value) {
            addCriterion("logo_img >=", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("logo_img >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogoImgLessThan(String value) {
            addCriterion("logo_img <", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("logo_img < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogoImgLessThanOrEqualTo(String value) {
            addCriterion("logo_img <=", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("logo_img <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLogoImgLike(String value) {
            addCriterion("logo_img like", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotLike(String value) {
            addCriterion("logo_img not like", value, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgIn(List<String> values) {
            addCriterion("logo_img in", values, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotIn(List<String> values) {
            addCriterion("logo_img not in", values, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgBetween(String value1, String value2) {
            addCriterion("logo_img between", value1, value2, "logoImg");
            return (Criteria) this;
        }

        public Criteria andLogoImgNotBetween(String value1, String value2) {
            addCriterion("logo_img not between", value1, value2, "logoImg");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNull() {
            addCriterion("company_desc is null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIsNotNull() {
            addCriterion("company_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyDescEqualTo(String value) {
            addCriterion("company_desc =", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("company_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotEqualTo(String value) {
            addCriterion("company_desc <>", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("company_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThan(String value) {
            addCriterion("company_desc >", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("company_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThanOrEqualTo(String value) {
            addCriterion("company_desc >=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("company_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThan(String value) {
            addCriterion("company_desc <", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("company_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThanOrEqualTo(String value) {
            addCriterion("company_desc <=", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("company_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompanyDescLike(String value) {
            addCriterion("company_desc like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotLike(String value) {
            addCriterion("company_desc not like", value, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescIn(List<String> values) {
            addCriterion("company_desc in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotIn(List<String> values) {
            addCriterion("company_desc not in", values, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescBetween(String value1, String value2) {
            addCriterion("company_desc between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCompanyDescNotBetween(String value1, String value2) {
            addCriterion("company_desc not between", value1, value2, "companyDesc");
            return (Criteria) this;
        }

        public Criteria andCoreProductIsNull() {
            addCriterion("core_product is null");
            return (Criteria) this;
        }

        public Criteria andCoreProductIsNotNull() {
            addCriterion("core_product is not null");
            return (Criteria) this;
        }

        public Criteria andCoreProductEqualTo(String value) {
            addCriterion("core_product =", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("core_product = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreProductNotEqualTo(String value) {
            addCriterion("core_product <>", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("core_product <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreProductGreaterThan(String value) {
            addCriterion("core_product >", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("core_product > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreProductGreaterThanOrEqualTo(String value) {
            addCriterion("core_product >=", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("core_product >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreProductLessThan(String value) {
            addCriterion("core_product <", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("core_product < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreProductLessThanOrEqualTo(String value) {
            addCriterion("core_product <=", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("core_product <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCoreProductLike(String value) {
            addCriterion("core_product like", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductNotLike(String value) {
            addCriterion("core_product not like", value, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductIn(List<String> values) {
            addCriterion("core_product in", values, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductNotIn(List<String> values) {
            addCriterion("core_product not in", values, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductBetween(String value1, String value2) {
            addCriterion("core_product between", value1, value2, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andCoreProductNotBetween(String value1, String value2) {
            addCriterion("core_product not between", value1, value2, "coreProduct");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_show = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_show <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_show > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_show >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_show < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_show <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
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

        public Criteria andCreatedByEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_by = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_by <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_by > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_by >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_by < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(TagPlateStock.Column column) {
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

        public Criteria andCreatedAtEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("created_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualToColumn(TagPlateStock.Column column) {
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

        public Criteria andUpdatedAtEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("updated_at = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("updated_at <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("updated_at > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("updated_at >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("updated_at < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualToColumn(TagPlateStock.Column column) {
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

        public Criteria andIsDelEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_del = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_del <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_del > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualToColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_del >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanColumn(TagPlateStock.Column column) {
            addCriterion(new StringBuilder("is_del < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualToColumn(TagPlateStock.Column column) {
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
        private TagPlateStockExample example;

        protected Criteria(TagPlateStockExample example) {
            super();
            this.example = example;
        }

        public TagPlateStockExample example() {
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
        void example(com.guonl.model.TagPlateStockExample example);
    }
}