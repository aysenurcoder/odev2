package odev2;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println(user.id + "/ " + user.email + " /" + user.password + "/ " + " Kullan�c� ekleme ba�ar�l�.");
	}
	
	public void logIn(User user) {
		System.out.println(user.email + " /" + user.password + "/ " + "Kullan�c� giri�i ba�ar�l�.");
	}
	
	public void logOut(User user) {
		System.out.println(user.id + " /" + "kullan�c� ��k��� ba�ar�l�.");
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}

}
