package cn.dengwang.mapper;

import com.dengwang.pojo.Setmeal;
import com.dengwang.pojo.SetmealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetmealMapper {
    long countByExample(SetmealExample example);

    int deleteByExample(SetmealExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Setmeal record);

    int insertSelective(Setmeal record);

    List<Setmeal> selectByExample(SetmealExample example);

    Setmeal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Setmeal record, @Param("example") SetmealExample example);

    int updateByExample(@Param("record") Setmeal record, @Param("example") SetmealExample example);

    int updateByPrimaryKeySelective(Setmeal record);

    int updateByPrimaryKey(Setmeal record);
}