package cn.dengwang.mapper;

import com.dengwang.pojo.Setmeal_CheckGroupExample;
import com.dengwang.pojo.Setmeal_CheckGroupKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Setmeal_CheckGroupMapper {
    long countByExample(Setmeal_CheckGroupExample example);

    int deleteByExample(Setmeal_CheckGroupExample example);

    int deleteByPrimaryKey(Setmeal_CheckGroupKey key);

    int insert(Setmeal_CheckGroupKey record);

    int insertSelective(Setmeal_CheckGroupKey record);

    List<Setmeal_CheckGroupKey> selectByExample(Setmeal_CheckGroupExample example);

    int updateByExampleSelective(@Param("record") Setmeal_CheckGroupKey record, @Param("example") Setmeal_CheckGroupExample example);

    int updateByExample(@Param("record") Setmeal_CheckGroupKey record, @Param("example") Setmeal_CheckGroupExample example);
}