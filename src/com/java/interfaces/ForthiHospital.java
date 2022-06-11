package com.java.interfaces;

public class ForthiHospital extends Medical implements USMedical,UKMediacl,IndianMedical{
	
	@Override
	public void medicalPlanning()
	{
		System.out.println("ForthiHospital ------------medicalPlanning");
	}

	@Override
	public void physiyoServices() {
		System.out.println("ForthiHospital----- physiyoServices ");
		
	}

	@Override
	public void padiServices() {
		System.out.println("ForthiHospital----- padiServices ");
		
	}

	@Override
	public void arthoServices() {
		System.out.println("ForthiHospital----- arthoServices ");
		
	}

	public void medicalCamp()
	{
		System.out.println("ForthiHospital----- medicalCamp ");
	}
	
	public void medicalTraining()
	{
		System.out.println("ForthiHospital----- medicalTraining");
	}

	@Override
	public void emergencyServices() {
		System.out.println("ForthiHospital----- emergencyServices");
		
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("ForthiHospital----- covid19Vaccination");
	}

	@Override
	public void covidGuidelines() {
		System.out.println("ForthiHospital----- covidGuidelines");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("ForthiHospital----- dentalServices");
	}

	@Override
	public void ENTServices() {
		System.out.println("ForthiHospital----- ENTServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("ForthiHospital----- oncologyServices");
	}

	@Override
	public void gynicServices() {
		System.out.println("ForthiHospital----- gynicServices");
	}

}
