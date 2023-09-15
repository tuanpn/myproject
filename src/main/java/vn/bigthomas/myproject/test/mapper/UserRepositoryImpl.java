package vn.bigthomas.myproject.test.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;
import vn.bigthomas.myproject.test.enity.User;
import vn.bigthomas.myproject.test.repository.UserRepository;

import java.io.Reader;
import java.util.List;

@Service
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save(User user) throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        // open session
        SqlSession session = sqlSessionFactory.openSession();

        // get all student
        int save = session.insert("User.insertUser", user);
        session.commit();
        // close session
        session.close();
    }

    @Override
    public Iterable<User> findAll() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        // open session
        SqlSession session = sqlSessionFactory.openSession();

        // get all student
        List<User> listUsers = session.selectList("User.selectAllUser");
        // close session
        session.close();
        return listUsers;
    }
}
