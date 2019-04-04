package dao;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import model.User;

@Repository
public class UserDao {
	private List<User> userList = new ArrayList<User>();
	
	public UserDao() {
		System.out.println("UserDao created");
		addUser();
	}
	
	public List<User> getUserList(){
		return userList;
	}

	public  void addUser() {
		
		userList.add(new User("Elif Seven", "Software Developer"));
		userList.add(new User("Elif ", "Assistant Software Engineer"));
		userList.add(new User("Elif S.", "Computer Engineer"));
		
	}
	
	public boolean removeUser(User user) {
		return userList.remove(user);	
	}
	
	
	
	

}
