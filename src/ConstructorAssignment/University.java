package ConstructorAssignment;

import java.util.ArrayList;
import java.util.Date;

public class University {

	String name;
	String country;
	Date establishedDate;
	
	ArrayList<String> coursesList ;      // = new ArrayList<String>();


	public University(String name, String country, Date establishedDate, ArrayList<String> coursesList) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.coursesList = coursesList;
	}
	
	public University(String name, String country) {

		this.name = name;
		this.country = country;
		
		this.establishedDate = new Date(1999, 11, 21);
		this.coursesList = new ArrayList<String>(){
				{
					add("Computer");
					add("Mechanical");
					add("Electronics");
				}};
		
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getEstablishedDate() {
		return establishedDate;
	}

	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}

	public ArrayList<String> getCoursesList() {
		return coursesList;
	}

	public void setCoursesList(ArrayList<String> coursesList) {
		this.coursesList = coursesList;
	}
	
	
	
	
}
