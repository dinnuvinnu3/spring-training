package com.dbs.project.recModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReceiverInfo {

	@Id
	String bic;
	String recInstitutionName;
	public ReceiverInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReceiverInfo(String bic, String recInstitutionName) {
		super();
		this.bic = bic;
		this.recInstitutionName = recInstitutionName;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getRecInstitutionName() {
		return recInstitutionName;
	}
	public void setRecInstitutionName(String recInstitutionName) {
		this.recInstitutionName = recInstitutionName;
	}
	
}
