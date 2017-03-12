package com.yueyuehe.develop.system.test;

import java.util.Date;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.AttributeAccessorSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yueyuehe.develop.system.dao.UserDao;
import com.yueyuehe.develop.system.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring_config.xml")
public class HibernateTest extends AbstractJUnit4SpringContextTests{

	@Resource
	UserDao userDao ;
	@Resource
	SessionFactory sf;
	
	@Test
	public void test() {
		
		//Session session = sessionFactory.getCurrentSession();
		//Transaction tr = session.beginTransaction();
		 User user =new User();
		 user.setUsername("lisi");
		 user.setPassword("123");
		// userDao.insert(user);
	 
		//Session session = sf.getCurrentSession();
      //Transaction tx = session.beginTransaction();
      userDao.insert(user);
		
		
		
	}

}
