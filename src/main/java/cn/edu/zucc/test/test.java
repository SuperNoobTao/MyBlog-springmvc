package cn.edu.zucc.test;


//import cn.edu.zucc.action.UserAction;
//import UserDao;
//import UserDaoImpl;
//import cn.edu.zucc.model.UsertableBean;
//import cn.edu.zucc.service.User.UserService;
//import cn.edu.zucc.service.User.UserServiceImpl;
import cn.edu.zucc.model.TbUserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

/**
 * Created by shentao on 2016/5/22.
 */
public class test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        List list = (List) session.createQuery("from TbUserEntity ").list();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            TbUserEntity users = (TbUserEntity) iterator.next();
            System.out.println(users.getUserAcount());
        }








    }


}
