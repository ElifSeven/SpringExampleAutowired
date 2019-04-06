package elif;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.User;
import service.UserService;

@Configuration
public class SpringExampleApplication {

	public static void main(String[] args) {

		SpringExampleApplication springApplication = new SpringExampleApplication();
		springApplication.printAllUser();

	}

	private void printAllUser() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath*:/applicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");

		List<User> allUserList = userService.getUserList();
		for (User user : allUserList) {
			System.out.println("Name: " + user.getName());
			System.out.println("Title: " + user.getTitle());
		}

	}

}
