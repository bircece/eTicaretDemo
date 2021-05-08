package eTicaretDemo;

import eTicaretDemo.Business.abstracts.UserService;
import eTicaretDemo.Business.concretes.UserMenager;
import eTicaretDemo.DataAccses.concretes.HibernateUserDao;
import eTicaretDemo.Entities.concretes.User;
import eTicaretDemo.core.loginWithGoogleMenagerAdapters;

public class main {

	public static void main(String[] args) {
		
		UserService userService= new UserMenager(new HibernateUserDao(), new loginWithGoogleMenagerAdapters() );
	
		User user1= new User(1,"birce", "çetin", "birce96@gmail.com", "1234567");
		User user2= new User(2, "g", "çetin", "gkhn23@gmail.com", "47937034");
		User user3= new User(3, "ayaz ", "özcan", "ayazözcan", "9876021");
		User user4 = new User(4, "güneþ ", "özcan", "güneþ3@gmail.com", "121");
		
		userService.register(user1);
		userService.emailConfirm();
		userService.loginGoogle();
		userService.login(user1.getEmail(), user1.getPassword());
		
		System.out.println("**************************************");
		userService.register(user2);
		userService.login(user2.getEmail(), user2.getPassword());
		
		System.out.println("**************************************");
		
		userService.register(user3);
	     userService.login(user3.getEmail(), user3.getPassword());
		
		System.out.println("**************************************");
		userService.register(user4);
		
		userService.login(user4.getEmail(), user4.getPassword());
		
		System.out.println("*********************************");
		
		
	}

}
