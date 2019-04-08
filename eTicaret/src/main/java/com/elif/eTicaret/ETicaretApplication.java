package com.elif.eTicaret;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entity.User;

@SpringBootApplication
public class ETicaretApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ETicaretApplication.class, args);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			User user = new User("Tuğrul", "Bayrak", "mail@mail.com");
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
