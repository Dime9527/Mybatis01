import com.smart.wen.entity.*;
import com.smart.wen.mapper.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

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
        int num = 0;
        for (int j = 0; j < 2; j++) {
            Product product = new Product(cate.getCateId(), "华为手机" + j, "最新款式" + j, "imgs/1.rng" + j, new BigDecimal(999.99));
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

    @Test
    public void orderTest() {
        //映射关系，先存主表并获取主键，将其设置给从表的外键
        //外键字段 微服务里
        //删除 假删除 主表删除，从表一起删除
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.selectOrderByNo(123);
        System.out.println(order);
    }

    /*
     * 角色关联权限，权限的集合，角色和权限是多对多的关系
     * 多对多的时候  一定有第三章中间表
     * name add 添加权限 del 删除权限 view 查看
     * declare 说明
     *
     *
     *
     * */
    @Test
    public void oneToMuch() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orders = orderMapper.selectOrderByUserId(2);
        System.out.println(orders);
    }

    @Test
    public void selectAddresses() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        List<Address> addresses = addressMapper.selectByUid(2);
        System.out.println(addresses);
    }

    @Test
    public void addAddresses() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        Address address = new Address(2, "xiaoming", "32432", "美国", "芝加哥");
        int i = addressMapper.addAddress(address);
        System.out.println(i);
    }

    @Test
    public void updateAddresses() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        Address address = new Address("xiaoming", "32432", "美国", "芝加哥");
        address.setAddrId(6);
        int i = addressMapper.modifyAddress(address);
        System.out.println(i);
    }

    @Test
    public void deleteAddresses() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        int i = addressMapper.deleteAddress(6);
        System.out.println(i);
    }

    @Test
    public void userPrivileges() {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Mybatis_test.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession(true);
        RolesMapper rolesMapper = sqlSession.getMapper(RolesMapper.class);
        Roles roles = rolesMapper.selectByUid(2);
        System.out.println(roles);
    }
}
