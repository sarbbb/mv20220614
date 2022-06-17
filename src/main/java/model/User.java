package model;

public class User {
	private String userName,phone,password;
	private int age;
	private boolean married;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public User(String userName, String phone, String password, int age, boolean married) {
		super();
		this.userName = userName;
		this.phone = phone;
		this.password = password;
		this.age = age;
		this.married = married;
	}
	public User() {
		super();
	}
	
    public String toString() {
    	return userName+"->"+phone+"->"+password+"->"+age;
    }
	
}
