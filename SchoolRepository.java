package com.godoro.pattern2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class SchoolRepository extends SchoolDbConnect{
	
	SchoolDbConnect sdc=null;

	

	public SchoolRepository() {
		sdc=new SchoolDbConnect();
	
	}
	
	public boolean insert(School schl) throws Exception
	{
		sdc=new SchoolDbConnect();
		
		return sdc.insert(schl);
	}
	
	public List<School> list() throws Exception
	{
		sdc=new SchoolDbConnect();
		
		return sdc.list();
		
	}

}
