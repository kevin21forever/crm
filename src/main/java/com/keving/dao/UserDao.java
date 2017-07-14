package com.keving.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.keving.model.User;
@Repository
public interface UserDao {

	@Select("select * from t_user where id = #{id}")
	User findById(@Param(value="id")Integer id);

}
