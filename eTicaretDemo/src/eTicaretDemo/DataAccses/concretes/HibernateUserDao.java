package eTicaretDemo.DataAccses.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.DataAccses.abstracts.UserDao;
import eTicaretDemo.Entities.concretes.User;

public class HibernateUserDao implements UserDao{

	ArrayList<User> userlist = new ArrayList<User>();
	
	
	@Override
	public void register(User user) {
		userlist.add(user);
		System.out.println("kayýt baþarýlý lütfen üyeliðinizi tamamlamak için e postanýza göndeilen linke týklayýn");
		
	}

	@Override
	public void login(User user) {

		System.out.println("sisteme giriþ baþarýlý");
	}

	@Override
	public List<User> getAll() {
		
		return userlist;
	}

}
