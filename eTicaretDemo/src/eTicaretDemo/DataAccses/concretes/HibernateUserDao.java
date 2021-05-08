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
		System.out.println("kay�t ba�ar�l� l�tfen �yeli�inizi tamamlamak i�in e postan�za g�ndeilen linke t�klay�n");
		
	}

	@Override
	public void login(User user) {

		System.out.println("sisteme giri� ba�ar�l�");
	}

	@Override
	public List<User> getAll() {
		
		return userlist;
	}

}
