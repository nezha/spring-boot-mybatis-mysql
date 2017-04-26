package com.nezha.Dao;

import com.nezha.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by nezha on 2017/4/26.
 */

@Mapper
public interface UserMapper {

    /**
     * 添加操作，返回新增元素的 ID
     *
     * @param User
     */
    @Insert("insert into person(name,age) values(#{name},#{age})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(User user);

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select id,name,age from person")
    List<User> selectAll();

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);


}
