package vn.bigthomas.myproject.test.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    private static SqlSessionFactory factory;

    public static SqlSessionFactory buildqlSessionFactory() throws IOException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        factory
                = new SqlSessionFactoryBuilder().build(inputStream);
        return factory;
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return factory;
    }

}
