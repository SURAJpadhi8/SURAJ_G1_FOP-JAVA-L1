package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredServiceImpl implements CredService{

	@Override
	public String generateEmailId(String firstname, String lastname, String dept) {

		return firstname+lastname+"@"+dept+".gl.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";

		String combined=caps+lower+nums+splchars;


		String mypass="";  //p&C9
		Random random=new Random();

		for(int i=0;i<8;i++)
		{
		mypass=mypass+String.valueOf(combined.charAt(random.nextInt(combined.length())));	
		}

		return mypass;
	}

	@Override
	public void showDetails(Employee e1) {
		
		   System.out.println("Dear "+e1.getFirstname()+" Your generated credentials are as follows :- ");	
			System.out.println("Email  is :- " + e1.getEmail());
			System.out.println("Password is :- " + e1.getPassword());

	}

	public String generateEmailId(Employee e1, String dept) {
		String mypass=e1.getFirstname().toLowerCase() + e1.getLastname().toLowerCase()+"@"+dept+".gl.com";
		return mypass;
	}

}
