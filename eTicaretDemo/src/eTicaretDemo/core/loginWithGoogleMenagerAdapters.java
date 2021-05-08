package eTicaretDemo.core;

import eTicaretDemo.loginWithGoogle.loginMenager;

public class  loginWithGoogleMenagerAdapters implements loginWithGoogleService{

	@Override
	public void loginWithGoogle() {
		loginMenager _loginMenager = new loginMenager();
	
		_loginMenager.log();
	}

}
