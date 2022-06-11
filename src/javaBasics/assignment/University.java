package javaBasics.assignment;

import java.util.ArrayList;

public class University {
	
	private String name;
	private String country;
	private String establishedDate;
	private ArrayList<String> courses;
	
//	public University()
//	{
//		
//	}
	public University(String name)
	{
		this.name = name;
	}
	public University(String name, String country)
	{
		this.name = name;
		this.country = country;
	}
	public University(String name, String country, String establishedDate)
	{
		this.name=name;
		this.country = country;
		this.establishedDate=establishedDate;
	}
	
	public University(ArrayList courses)
	{
		this.courses = courses;
	
	}
	
	public University(String name, String country, String establishedDate,ArrayList courses)
	{
		this.name=name;
		this.country = country;
		this.establishedDate=establishedDate;
		this.courses = courses;
	}
	
	public String getName()
	{
		return name;
	}
	public String getCountry()
	{
		return country;
	}

	public String getEstablishedDate()
	{
		return establishedDate;
	}
	
	public ArrayList courses()
	{
		return courses;
	}
}
