package cn.dengwang.mapper;

import com.dengwang.pojo.Role_MenuExample;
import com.dengwang.pojo.Role_MenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_MenuMapper {
    long countByExample(Role_MenuExample example);

    int deleteByExample(Role_MenuExample example);

    int deleteByPrimaryKey(Role_MenuKey key);

    int insert(Role_MenuKey record);

    int insertSelective(Role_MenuKey record);

    List<Role_MenuKey> selectByExample(Role_MenuExample example);

    int updateByExampleSelective(@Param("record") Role_MenuKey record, @Param("example") Role_MenuExample example);

    int updateByExample(@Param("record") Role_MenuKey record, @Param("example") Role_MenuExample example);
}