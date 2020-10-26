import com.smart.wen.entity.Cate;
import com.smart.wen.entity.Product;
import com.smart.wen.entity.User;
import com.smart.wen.mapper.CateMapper;
import com.smart.wen.mapper.ProductMapper;
import com.smart.wen.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.math.BigDecimal;

public class Mybatis_test {
    @Test
    public void test1() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User ww = new User("ww", "111");
        int insert = mapper.insert(ww);
        System.out.println(insert);
    }

    @Test
    public void test2() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUserById(2);
        System.out.println(user);
    }

    @Test
    public void productTest() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        Cate cate = new Cate("5G");
        int i = cateMapper.insertCate(cate);
        System.out.println(cate.getCateId());
        int num =0;
        for (int j = 0; j < 2; j++) {
            Product product = new Product(cate.getCateId(),"华为手机"+j, "最新款式"+j, "imgs/1.rng"+j,new BigDecimal(999.99));
            num = productMapper.insertProduct(product);
            System.out.println(num);
        }
        System.out.println(i);
    }

    @Test
    public void queryByIdTest() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        Cate cate = cateMapper.selectListById(1);
    }
}
