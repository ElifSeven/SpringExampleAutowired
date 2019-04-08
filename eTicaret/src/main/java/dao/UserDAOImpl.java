package dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

//	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
//		logger.info("User saved successfully, User Details="+ user);

	}

	@Override
	public void updateUser(User user) {

		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);
//		logger.info("User updated successfully, User Details="+ user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> userList() {

		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		for (User user : userList) {
//			logger.info("User List::"+user);

		}
		return userList;

	}

	@Override
	public User getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, new Integer(id));
//		logger.info("User loaded successfully, User details="+ user);

		return user;
	}

	@Override
	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();

		User user = (User) session.load(User.class, new Integer(id));
		if (user != null) {
			session.delete(user);
		}

//		logger.info("User deleted successfully, user details="+user);

	}

}
