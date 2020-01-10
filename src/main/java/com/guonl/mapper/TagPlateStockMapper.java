package com.guonl.mapper;

import com.guonl.model.TagPlateStock;
import com.guonl.model.TagPlateStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagPlateStockMapper {
    long countByExample(TagPlateStockExample example);

    int deleteByExample(TagPlateStockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagPlateStock record);

    int insertSelective(@Param("record") TagPlateStock record, @Param("selective") TagPlateStock.Column ... selective);

    TagPlateStock selectOneByExample(TagPlateStockExample example);

    List<TagPlateStock> selectByExample(TagPlateStockExample example);

    TagPlateStock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagPlateStock record, @Param("example") TagPlateStockExample example, @Param("selective") TagPlateStock.Column ... selective);

    int updateByExample(@Param("record") TagPlateStock record, @Param("example") TagPlateStockExample example);

    int updateByPrimaryKeySelective(@Param("record") TagPlateStock record, @Param("selective") TagPlateStock.Column ... selective);

    int updateByPrimaryKey(TagPlateStock record);

    int batchInsert(@Param("list") List<TagPlateStock> list);

    int batchInsertSelective(@Param("list") List<TagPlateStock> list, @Param("selective") TagPlateStock.Column ... selective);
}