package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDAO;
import entity.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		this.userDAO.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {

		this.userDAO.updateUser(user);
	}

	@Override
	public List<User> userList() {
		return this.userDAO.userList();

	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return userDAO.getUserById(id);
	}

	@Override
	public void removeUser(int id) {

		this.userDAO.removeUser(id);
	}

}
