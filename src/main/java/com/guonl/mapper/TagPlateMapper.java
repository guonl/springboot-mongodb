package com.guonl.mapper;

import com.guonl.model.TagPlate;
import com.guonl.model.TagPlateExample;
import com.guonl.model.TagPlateWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagPlateMapper {
    long countByExample(TagPlateExample example);

    int deleteByExample(TagPlateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagPlateWithBLOBs record);

    int insertSelective(@Param("record") TagPlateWithBLOBs record, @Param("selective") TagPlateWithBLOBs.Column ... selective);

    TagPlate selectOneByExample(TagPlateExample example);

    TagPlateWithBLOBs selectOneByExampleWithBLOBs(TagPlateExample example);

    List<TagPlateWithBLOBs> selectByExampleWithBLOBs(TagPlateExample example);

    List<TagPlate> selectByExample(TagPlateExample example);

    TagPlateWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagPlateWithBLOBs record, @Param("example") TagPlateExample example, @Param("selective") TagPlateWithBLOBs.Column ... selective);

    int updateByExampleWithBLOBs(@Param("record") TagPlateWithBLOBs record, @Param("example") TagPlateExample example);

    int updateByExample(@Param("record") TagPlate record, @Param("example") TagPlateExample example);

    int updateByPrimaryKeySelective(@Param("record") TagPlateWithBLOBs record, @Param("selective") TagPlateWithBLOBs.Column ... selective);

    int updateByPrimaryKeyWithBLOBs(TagPlateWithBLOBs record);

    int updateByPrimaryKey(TagPlate record);

    int batchInsert(@Param("list") List<TagPlateWithBLOBs> list);

    int batchInsertSelective(@Param("list") List<TagPlateWithBLOBs> list, @Param("selective") TagPlateWithBLOBs.Column ... selective);
}