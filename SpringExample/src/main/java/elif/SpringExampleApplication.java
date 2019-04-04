package elif;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.User;
import service.UserService;

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
		
        UserService userService = new UserService();
        
        List<User> allUserList = userService.getUserList();
        for(User user : allUserList) {
        	System.out.println("Name: " + user.getName());
        	System.out.println("Title: "+ user.getTitle());
        }
        

       
		
	}
	

}
