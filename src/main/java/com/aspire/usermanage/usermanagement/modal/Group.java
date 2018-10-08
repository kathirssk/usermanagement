package com.aspire.usermanage.usermanagement.modal;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
//@Entity
@Table(name="groups")
@Configurable
public class Group {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="group_id")
	private int groupId;
	
	@NotNull
	@Size(max = 100)
	@Column(unique = true)
	private String groupName;
	
	

	public int getGroupId() {
		return groupId;
	}
	
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="groupId", referencedColumnName="userId") 
//	private User user;
		
	@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL)
	@JoinColumn(name="groupId",  nullable=false,insertable=false, updatable=false)
	private Rights rights;


	
}
