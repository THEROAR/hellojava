package net.nw.action;

import net.nw.dao.UsersDAO;
import net.nw.vo.Users;

public class LoginAction {
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() {
		Users u = new Users();
		u.setUsername(this.getUsername());
		u.setPassword(this.getPassword());
		UsersDAO dao = new UsersDAO();
		if (dao.userLogin(u)) {
			return "login_success";
		}
		else {
			return "login_failure";
		}
	}
}
