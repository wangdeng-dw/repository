package cn.dengwang.mapper;

import com.dengwang.pojo.Checkgroup_CheckitemExample;
import com.dengwang.pojo.Checkgroup_CheckitemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Checkgroup_CheckitemMapper {
    long countByExample(Checkgroup_CheckitemExample example);

    int deleteByExample(Checkgroup_CheckitemExample example);

    int deleteByPrimaryKey(Checkgroup_CheckitemKey key);

    int insert(Checkgroup_CheckitemKey record);

    int insertSelective(Checkgroup_CheckitemKey record);

    List<Checkgroup_CheckitemKey> selectByExample(Checkgroup_CheckitemExample example);

    int updateByExampleSelective(@Param("record") Checkgroup_CheckitemKey record, @Param("example") Checkgroup_CheckitemExample example);

    int updateByExample(@Param("record") Checkgroup_CheckitemKey record, @Param("example") Checkgroup_CheckitemExample example);
}