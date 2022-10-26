package com.devsuperior.dscatalog.dto;

import java.util.HashSet;
import java.util.Set;

import com.devsuperior.dscatalog.entities.User;

public class UserDTO {
	private Long id;
	private String firstName;
	private String LastName;
	private String email;

	Set<RoleDTO> roles = new HashSet<>();
	public UserDTO() {
		
	}

	public UserDTO(Long id, String firstName, String lastName, String email) {
	
		this.id = id;
		this.firstName = firstName;
		this.LastName = lastName;
		this.email = email;
		
	}

	

	public UserDTO(User entity) {
	
		id = entity.getId();
		firstName = entity.getFirstName();
		LastName = entity.getLastName();
		email = entity.getEmail();
		entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}



}
