package eTicaretDemo.Business.concretes;


import eTicaretDemo.Business.abstracts.UserService;
import eTicaretDemo.DataAccses.abstracts.UserDao;
import eTicaretDemo.Entities.concretes.User;
import eTicaretDemo.core.loginWithGoogleService;

public class UserMenager implements UserService {

	
	private UserDao userdao;
	private loginWithGoogleService _loginWithGoogleService;
	
	
	public UserMenager(UserDao userdao, loginWithGoogleService _loginWithGoogleService) {
		super();
		this.userdao = userdao;
		this._loginWithGoogleService = _loginWithGoogleService;
	}

	private boolean emailControl(User user) {
		for (var mail: userdao.getAll()) {
			
			if (mail.getEmail()== user.getEmail()) {
				return false;
			}
			
		}
		
		return true;
	}
	
	@Override
	public void register(User user) {

		if (user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("adýnýz ve soyadýnýz en az iki karakter olmalý.");
		}
		
		else if (user.getPassword().length()<6) {
			System.out.println("parola 6 karakterden az olamaz.");
		}
		
		else if (emailControl(user)== false) {
			System.out.println("bu mail zaten kullanýlýyor.");
		}
		
		else if (user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")==false) {
			System.out.println("girmiþ olduðunuz adres mail formatýna uygun deðildir.");
		}
		else {
			userdao.register(user);
		}
	}

	@Override
	public void login(String email, String password) {
		for (var user: userdao.getAll() ) {
			if (email== user.getEmail() && password==user.getPassword()) {
				userdao.login(user);
				return;
			}
		}
		
		System.out.println("email ya da parola hatalý");
		
	}

	@Override
	public void loginGoogle() {
		
		_loginWithGoogleService.loginWithGoogle();
	}

	@Override
	public void emailConfirm() {
    
		System.out.println("Email doðrulandý, üyelik tamamlanmýþtýr.");
	}

	
	
	
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public loginWithGoogleService get_loginWithGoogleService() {
		return _loginWithGoogleService;
	}

	public void set_loginWithGoogleService(loginWithGoogleService _loginWithGoogleService) {
		this._loginWithGoogleService = _loginWithGoogleService;
	}

}
