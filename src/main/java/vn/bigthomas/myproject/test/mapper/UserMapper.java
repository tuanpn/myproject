package vn.bigthomas.myproject.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import vn.bigthomas.myproject.test.enity.User;

public interface UserMapper<User> {
    @Insert("Insert into user(name, email) values (#{name}, #{email})")
    public Integer save(User person);

    @Select("SELECT id, name, email FROM user WHERE id = #{id}")
    User getPerson(Integer id);
}
