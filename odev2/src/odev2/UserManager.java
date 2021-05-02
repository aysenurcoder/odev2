package odev2;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.id + "/ " + user.email + " /" + user.password + "/ " + " Kullanýcý ekleme baþarýlý.");
	}
	
	public void logIn(User user) {
		System.out.println(user.email + " /" + user.password + "/ " + "Kullanýcý giriþi baþarýlý.");
	}
	
	public void logOut(User user) {
		System.out.println(user.id + " /" + "kullanýcý çýkýþý baþarýlý.");
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}

}
