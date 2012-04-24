package com.truman.trippy;

import com.truman.trippy.api.entities.User;

public class CurrentUser extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static User getUser() {
		return user;
	}

	static void setUser(User currentUser) {
		user = currentUser;
	}

	  static User user;
}
