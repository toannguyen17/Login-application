package app.dao;

import app.model.Login;
import app.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	private static List<User> users;

	static {
		users = new ArrayList<>();

		User user1 = new User();
		user1.setName("John");
		user1.setAccount("john");
		user1.setEmail("john@gmail.com");
		user1.setAge(10);
		user1.setPassword("123456");

		User user2 = new User();
		user2.setName("Mind");
		user2.setAccount("mind");
		user2.setEmail("mind@gmail.com");
		user2.setAge(16);
		user2.setPassword("123456");

		User user3 = new User();
		user3.setName("Mike");
		user3.setAccount("mike");
		user3.setEmail("mike@gmail.com");
		user3.setAge(17);
		user3.setPassword("123456");

		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	public static User checkLogin(Login login){
		for (User user: users){
			if (user.getAccount().equals(login.getAccount()) &&
				user.getPassword().equals(login.getPassword())
			){
				return user;
			}
		}
		return null;
	}
}
