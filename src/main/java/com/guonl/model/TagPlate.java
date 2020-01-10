package com.guonl.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TagPlate {
    private Integer id;

    private Integer plateId;

    private String plateName;

    private String plateDesc;

    private Integer coreStocksCount;

    private Integer actStocksCount;

    private Integer hashCode;

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

    public String getPlateDesc() {
        return plateDesc;
    }

    public void setPlateDesc(String plateDesc) {
        this.plateDesc = plateDesc == null ? null : plateDesc.trim();
    }

    public Integer getCoreStocksCount() {
        return coreStocksCount;
    }

    public void setCoreStocksCount(Integer coreStocksCount) {
        this.coreStocksCount = coreStocksCount;
    }

    public Integer getActStocksCount() {
        return actStocksCount;
    }

    public void setActStocksCount(Integer actStocksCount) {
        this.actStocksCount = actStocksCount;
    }

    public Integer getHashCode() {
        return hashCode;
    }

    public void setHashCode(Integer hashCode) {
        this.hashCode = hashCode;
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

    public static TagPlate.Builder builder() {
        return new TagPlate.Builder();
    }

    public static class Builder {
        private TagPlate obj;

        public Builder() {
            this.obj = new TagPlate();
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

        public Builder plateDesc(String plateDesc) {
            obj.setPlateDesc(plateDesc);
            return this;
        }

        public Builder coreStocksCount(Integer coreStocksCount) {
            obj.setCoreStocksCount(coreStocksCount);
            return this;
        }

        public Builder actStocksCount(Integer actStocksCount) {
            obj.setActStocksCount(actStocksCount);
            return this;
        }

        public Builder hashCode(Integer hashCode) {
            obj.setHashCode(hashCode);
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

        public TagPlate build() {
            return this.obj;
        }
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        plateId("plate_id", "plateId", "INTEGER", false),
        plateName("plate_name", "plateName", "VARCHAR", false),
        plateDesc("plate_desc", "plateDesc", "VARCHAR", false),
        coreStocksCount("core_stocks_count", "coreStocksCount", "INTEGER", false),
        actStocksCount("act_stocks_count", "actStocksCount", "INTEGER", false),
        hashCode("hash_code", "hashCode", "INTEGER", false),
        createdBy("created_by", "createdBy", "VARCHAR", false),
        createdAt("created_at", "createdAt", "TIMESTAMP", false),
        updatedAt("updated_at", "updatedAt", "TIMESTAMP", false),
        isDel("is_del", "isDel", "BIT", false),
        questionAnswers("question_answers", "questionAnswers", "LONGVARCHAR", false),
        introducedesc("introduceDesc", "introducedesc", "LONGVARCHAR", false);

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