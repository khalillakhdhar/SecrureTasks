package com.doranco.security.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class AppUser implements Serializable {
	@Id
	private String username;
	private String password;
	private int active;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<AppRole> roles=new ArrayList<>();
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
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public List<AppRole> getRoles() {
		return roles;
	}
	public void setRoles(List<AppRole> roles) {
		this.roles = roles;
	}
	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUser(String username, String password, int active) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
	
	}
	@Override
	public String toString() {
		return "AppUser [username=" + username + ", password=" + password + ", active=" + active + "]";
	}

}
