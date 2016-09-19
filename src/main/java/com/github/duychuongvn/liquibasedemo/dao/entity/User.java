package com.github.duychuongvn.liquibasedemo.dao.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="user")
public class User {

	@Id
	private String id = UUID.randomUUID().toString();
	private String username;
	private String firstName;
	private String lastName;
	
	
	@Override
	public String toString() {
		return "Id = " + id +", username = " + username + ", firstName = " + firstName + ", lastName = " + lastName +"\n";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
