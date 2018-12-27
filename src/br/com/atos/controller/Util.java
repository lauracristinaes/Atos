package br.com.atos.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import br.com.atos.model.Employee;

public class Util{
	
	public Util() {}
	
	/*
	 * Author: Laura C E Santo
	 * Function for read JSON Files
	 * Return a list of Employees 
	 * 
	 * */
	
	
	public List<Employee> ReadJSON(){
	
		JSONParser parser = new JSONParser();
		
		  try {
	          
	          Object obj = parser.parse(new FileReader("/src/employees.json"));
		        JSONArray json = (JSONArray) obj;
		        
	           List<Employee> employees = new ArrayList<Employee>();
	           
		        
	           for(int i=0; i < json.size(); i++) {
		        	//iterator for employees
		        	Employee employee = new Employee((JSONObject) json.get(i));
		        	employees.add(employee);
		       	
		        }
	           
		       return employees;
		  } catch (FileNotFoundException e) {
	          e.printStackTrace();
	      } catch (IOException e) {
	          e.printStackTrace();
	      } catch (ParseException e) {
	          e.printStackTrace();
	      }
		  return null;
	}

}
