package com.aspire.usermanage.usermanagement.modal;


import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Rights Entity class
 * 
 * @author kathiravan.sethurama
 *
 */
@Document(collection="rights")
@Configuration
public class Rights {
	
	@Id 
	private int rightsId;
	@NotNull
	private String rightsName;

	public int getRightsId() {
		return rightsId;
	}

	public void setRightsId(int rightsId) {
		this.rightsId = rightsId;
	}

	public String getRightsName() {
		return rightsName;
	}

	public void setRightsName(String rightsName) {
		this.rightsName = rightsName;
	}

}
