package vn.bigthomas.myproject.test.repository;

import org.springframework.stereotype.Service;
import vn.bigthomas.myproject.test.enity.User;
import vn.bigthomas.myproject.test.utils.MyBatisUtil;

public interface UserRepository {

    void save(User user) throws Exception;

    Iterable<User> findAll() throws Exception;
}
