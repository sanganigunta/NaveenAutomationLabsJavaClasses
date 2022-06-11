package javaBasics.assignment;

import java.util.ArrayList;

public class Assignmeny15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		al.add(0, 101);
		int len = al.size();
		
		al.add(len,20);
		System.out.println(al);
		
	}

}
