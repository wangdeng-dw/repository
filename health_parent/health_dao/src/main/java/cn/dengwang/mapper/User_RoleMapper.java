package cn.dengwang.mapper;

import com.dengwang.pojo.User_RoleExample;
import com.dengwang.pojo.User_RoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_RoleMapper {
    long countByExample(User_RoleExample example);

    int deleteByExample(User_RoleExample example);

    int deleteByPrimaryKey(User_RoleKey key);

    int insert(User_RoleKey record);

    int insertSelective(User_RoleKey record);

    List<User_RoleKey> selectByExample(User_RoleExample example);

    int updateByExampleSelective(@Param("record") User_RoleKey record, @Param("example") User_RoleExample example);

    int updateByExample(@Param("record") User_RoleKey record, @Param("example") User_RoleExample example);
}