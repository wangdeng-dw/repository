package cn.dengwang.mapper;

import com.dengwang.pojo.Checkitem;
import com.dengwang.pojo.CheckitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckitemMapper {
    long countByExample(CheckitemExample example);

    int deleteByExample(CheckitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checkitem record);

    int insertSelective(Checkitem record);

    List<Checkitem> selectByExample(CheckitemExample example);

    Checkitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkitem record, @Param("example") CheckitemExample example);

    int updateByExample(@Param("record") Checkitem record, @Param("example") CheckitemExample example);

    int updateByPrimaryKeySelective(Checkitem record);

    int updateByPrimaryKey(Checkitem record);
}