package src;

public class UserController {
     private int id;
     private String Username;
     private String password;
     private int sex;
     private String love;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id + 10;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}
    
}
