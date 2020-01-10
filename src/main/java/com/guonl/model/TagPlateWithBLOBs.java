package com.guonl.model;

import java.util.ArrayList;
import java.util.Arrays;

public class TagPlateWithBLOBs extends TagPlate {
    private String questionAnswers;

    private String introducedesc;

    public String getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(String questionAnswers) {
        this.questionAnswers = questionAnswers == null ? null : questionAnswers.trim();
    }

    public String getIntroducedesc() {
        return introducedesc;
    }

    public void setIntroducedesc(String introducedesc) {
        this.introducedesc = introducedesc == null ? null : introducedesc.trim();
    }

    public static TagPlateWithBLOBs.Builder builder() {
        return new TagPlateWithBLOBs.Builder();
    }

    public static class Builder extends TagPlate.Builder {
        private TagPlateWithBLOBs obj;

        public Builder() {
            this.obj = new TagPlateWithBLOBs();
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

        public Builder createdAt(java.util.Date createdAt) {
            obj.setCreatedAt(createdAt);
            return this;
        }

        public Builder updatedAt(java.util.Date updatedAt) {
            obj.setUpdatedAt(updatedAt);
            return this;
        }

        public Builder isDel(Boolean isDel) {
            obj.setIsDel(isDel);
            return this;
        }

        public Builder questionAnswers(String questionAnswers) {
            obj.setQuestionAnswers(questionAnswers);
            return this;
        }

        public Builder introducedesc(String introducedesc) {
            obj.setIntroducedesc(introducedesc);
            return this;
        }

        public TagPlateWithBLOBs build() {
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