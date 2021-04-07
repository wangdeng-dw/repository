package cn.dengwang.mapper;

import com.dengwang.pojo.Role_PermissionExample;
import com.dengwang.pojo.Role_PermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_PermissionMapper {
    long countByExample(Role_PermissionExample example);

    int deleteByExample(Role_PermissionExample example);

    int deleteByPrimaryKey(Role_PermissionKey key);

    int insert(Role_PermissionKey record);

    int insertSelective(Role_PermissionKey record);

    List<Role_PermissionKey> selectByExample(Role_PermissionExample example);

    int updateByExampleSelective(@Param("record") Role_PermissionKey record, @Param("example") Role_PermissionExample example);

    int updateByExample(@Param("record") Role_PermissionKey record, @Param("example") Role_PermissionExample example);
}