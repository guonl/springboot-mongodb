package com.guonl.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TagPlateStock {
    private Integer id;

    private Integer plateId;

    private String plateName;

    private String stockCode;

    private String stockName;

    private String stockDesc;

    private String logoImg;

    private String address;

    private String companyDesc;

    private String coreProduct;

    private Integer isShow;

    private String createdBy;

    private Date createdAt;

    private Date updatedAt;

    private Boolean isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName == null ? null : plateName.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getStockDesc() {
        return stockDesc;
    }

    public void setStockDesc(String stockDesc) {
        this.stockDesc = stockDesc == null ? null : stockDesc.trim();
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg == null ? null : logoImg.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc == null ? null : companyDesc.trim();
    }

    public String getCoreProduct() {
        return coreProduct;
    }

    public void setCoreProduct(String coreProduct) {
        this.coreProduct = coreProduct == null ? null : coreProduct.trim();
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public static TagPlateStock.Builder builder() {
        return new TagPlateStock.Builder();
    }

    public static class Builder {
        private TagPlateStock obj;

        public Builder() {
            this.obj = new TagPlateStock();
        }

        public Builder id(Integer id) {
            obj.setId(id);
            return this;
        }

        public Builder plateId(Integer plateId) {
            obj.setPlateId(plateId);
            return this;
        }

        public Builder plateName(String plateName) {
            obj.setPlateName(plateName);
            return this;
        }

        public Builder stockCode(String stockCode) {
            obj.setStockCode(stockCode);
            return this;
        }

        public Builder stockName(String stockName) {
            obj.setStockName(stockName);
            return this;
        }

        public Builder stockDesc(String stockDesc) {
            obj.setStockDesc(stockDesc);
            return this;
        }

        public Builder logoImg(String logoImg) {
            obj.setLogoImg(logoImg);
            return this;
        }

        public Builder address(String address) {
            obj.setAddress(address);
            return this;
        }

        public Builder companyDesc(String companyDesc) {
            obj.setCompanyDesc(companyDesc);
            return this;
        }

        public Builder coreProduct(String coreProduct) {
            obj.setCoreProduct(coreProduct);
            return this;
        }

        public Builder isShow(Integer isShow) {
            obj.setIsShow(isShow);
            return this;
        }

        public Builder createdBy(String createdBy) {
            obj.setCreatedBy(createdBy);
            return this;
        }

        public Builder createdAt(Date createdAt) {
            obj.setCreatedAt(createdAt);
            return this;
        }

        public Builder updatedAt(Date updatedAt) {
            obj.setUpdatedAt(updatedAt);
            return this;
        }

        public Builder isDel(Boolean isDel) {
            obj.setIsDel(isDel);
            return this;
        }

        public TagPlateStock build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        plateId("plate_id", "plateId", "INTEGER", false),
        plateName("plate_name", "plateName", "VARCHAR", false),
        stockCode("stock_code", "stockCode", "VARCHAR", false),
        stockName("stock_name", "stockName", "VARCHAR", false),
        stockDesc("stock_desc", "stockDesc", "VARCHAR", false),
        logoImg("logo_img", "logoImg", "VARCHAR", false),
        address("address", "address", "VARCHAR", false),
        companyDesc("company_desc", "companyDesc", "VARCHAR", false),
        coreProduct("core_product", "coreProduct", "VARCHAR", false),
        isShow("is_show", "isShow", "INTEGER", false),
        createdBy("created_by", "createdBy", "VARCHAR", false),
        createdAt("created_at", "createdAt", "TIMESTAMP", false),
        updatedAt("updated_at", "updatedAt", "TIMESTAMP", false),
        isDel("is_del", "isDel", "BIT", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}