package com.aspire.usermanage.usermanagement.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
//@Entity
@Table(name = "rights")
@Configurable
public class Rights {
	
	@Id
	@Column(name = "rights_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rightsId;
	@NotNull
	@Column(unique = true)
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
