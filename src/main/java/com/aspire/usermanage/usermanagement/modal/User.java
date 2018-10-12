package com.aspire.usermanage.usermanagement.modal;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * User Entity class 
 * 
 * @author kathiravan.sethurama
 *
 */
@Document(collection="user")
@Configuration
public class User {
	
	@Id 
	private int userId;
	
	@NotNull
	@Size(max=100)
	private String userName;
	
	@NotNull
	@Size(max=100)
	private String userRole;
	
	@NotNull
    @Email
    @Size(max = 100)
   
    private String userEmail;

	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	

	
	// DBRef is for entity reference which tells this entity associated with some other entity
	@DBRef
	private Group groups;



	

}
