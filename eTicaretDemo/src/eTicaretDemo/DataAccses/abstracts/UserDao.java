package eTicaretDemo.DataAccses.abstracts;

import java.util.List;

import eTicaretDemo.Entities.concretes.User;

public interface UserDao {

	void register(User  user);
	void login(User user);
	
	List<User> getAll();
}
