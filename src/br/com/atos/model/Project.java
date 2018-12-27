package br.com.atos.model;

import org.json.simple.JSONObject;
/*
 * Author: Laura C E Santo
 * Class Project
 * Built from a JSONObject
 * 
 * */
public class Project {
	
 	
    	
    private String name;
	private String customer;
	private String valueOfProject;
	private String dtBegin;
	private String dtEnd;
	public Project() {}
	
	public Project(JSONObject project) {
		
		this.name = project.get("name").toString();
		this.customer = project.get("customer").toString();
		this.valueOfProject = project.get("valueOfProject").toString();
		this.dtBegin = project.get("dtBegin").toString();
		this.dtEnd = project.get("dtEnd").toString();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getValueOfProject() {
		return valueOfProject;
	}
	public void setValueOfProject(String valueOfProject) {
		this.valueOfProject = valueOfProject;
	}
	public String getDtBegin() {
		return dtBegin;
	}
	public void setDtBegin(String dtBegin) {
		this.dtBegin = dtBegin;
	}
	public String getDtEnd() {
		return dtEnd;
	}
	public void setDtEnd(String dtEnd) {
		this.dtEnd = dtEnd;
	}



}
