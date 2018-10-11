package com.aspire.usermanage.usermanagement.modal;




import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * GROUP Entity class
 * 
 * 
 * 
 * @author kathiravan.sethurama
 *
 */
@Document(collection="group")
@Configuration
public class Group {
	
	
	@Id 
	private int groupId;
	
	@NotNull
	@Size(max = 100)
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
	
	// DBRef is for entity reference which tells this entity associated with some other entity
	@DBRef
	private Rights rights;



	public Rights getRights() {
		return rights;
	}

	public void setRights(Rights rights) {
		this.rights = rights;
	}


	
}
