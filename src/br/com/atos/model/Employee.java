package br.com.atos.model;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
/*
 * Author: Laura C E Santo
 * Class Employee
 * Built from a JSONObject
 * 
 * */

public class Employee {
	
	private String name;
	private String role;
	private String salary;
	private String manager;
	private String gcm;
	
	private List<Project> projects;
	
	private List<String> skills;
	private List<String> certifications;
	
	public Employee() {	}	
	
	public Employee(JSONObject employee) {
		
		this.name = employee.get("name").toString();
		this.role = employee.get("role").toString();
		this.salary = employee.get("salary").toString();
		this.gcm = employee.get("gcm").toString();
		this.manager = employee.get("manager").toString();
		
		this.projects = new ArrayList<Project>();
		
		JSONArray ListOfProjects = (JSONArray) employee.get("projects");
		for(int i=0; i < ListOfProjects.size(); i++) {
			Project project = new Project((JSONObject) ListOfProjects.get(i));
			projects.add(project);
		}
		
		this.skills = new ArrayList<String>();
			
		JSONArray ListOfSkills = (JSONArray) employee.get("skills");
		for(int i=0; i < ListOfSkills.size(); i++) {
			skills.add(ListOfSkills.get(i).toString());
		}
	    
		this.certifications = new ArrayList<String>();
		JSONArray ListOfCertifications = (JSONArray) employee.get("certification");
		for(int i=0; i < ListOfCertifications.size(); i++) {
			certifications.add(ListOfCertifications.get(i).toString());
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getGcm() {
		return gcm;
	}

	public void setGcm(String gcm) {
		this.gcm = gcm;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<String> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<String> certifications) {
		this.certifications = certifications;
	}
}
