package net.nw.dao;

import net.nw.vo.Users;

public class UsersDAO {
	public boolean userLogin(Users u) {
		if (u.getUsername().equals("admin") && u.getPassword().equals("admin")) {
			return true;
			
		}
		else {
			return false;
		}
	}

}
