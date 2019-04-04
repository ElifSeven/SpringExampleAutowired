package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public List<User> getUserList(){
		return userDao.getUserList();
	}
}
