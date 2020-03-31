package com.godoro.pattern2;

public class SchoolTest {
	
	public static void main(String[] args) throws Exception {
		
		School schl=new School(2,"Student 2",1000);
		SchoolRepository schRp=new SchoolRepository();
				boolean inserted=schRp.insert(schl);
		System.out.println("Eklenmiş: "+inserted);
	}

}
