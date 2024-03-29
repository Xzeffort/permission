package com.example.permission.dao;

import com.example.permission.model.SysRoleUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);

    List<Integer> getRoleByUserId(@Param("userId") Integer userId);

    List<Integer> getUserIdListByRoleId(@Param("roleId") Integer roleId);

    void deleteByRoleId(@Param("roleId") Integer roleId);

    void batchInsert(@Param("roleUsers") List<SysRoleUser> roleUsers);
}