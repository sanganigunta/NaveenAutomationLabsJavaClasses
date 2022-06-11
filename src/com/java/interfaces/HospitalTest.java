package com.java.interfaces;

public class HospitalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We can not have any static abstract methods why because evry abstarct method need to be overriden.
		//But static method can not be overridden
		//By default all the variables inside the interface are static final
		//we can not have 2 or more parent class to child class of an interface why because agin dimond problem
		//An interface can not have any parent class. It can only have the parent interface
		
		
		ForthiHospital ft = new ForthiHospital();
		ft.physiyoServices();
		ft.padiServices();
		ft.arthoServices();
		ft.medicalCamp();
		ft.medicalTraining();
		ft.emergencyServices();
		ft.covid19Vaccination();
		ft.covidGuidelines();
		ft.dentalServices();
		ft.ENTServices();
		ft.gynicServices();
		ft.oncologyServices();
		ft.medicalPlanning();
		
		System.out.println("#################TopCasting###################");
		//TopCasting:
		USMedical us = new ForthiHospital();
		us.padiServices();
		us.physiyoServices();
		us.arthoServices();
		us.emergencyServices();
		us.covid19Vaccination();
		us.covidGuidelines();
		us.emergencyServices();
		
		//Down casting is not possible as we can not create the object for an interface.
		
		
		
			
	}

}
