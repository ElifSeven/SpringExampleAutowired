package service;

import java.util.List;

import entity.User;

public interface UserService {

	public void addUser(User user);

	public void updateUser(User user);

	public List<User> userList();

	public User getUserById(int id);

	public void removeUser(int id);

}
