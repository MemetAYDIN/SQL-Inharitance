package com.godoro.pattern2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SchoolDbConnect {

	private String driver="com.mysql.cj.jdbc.Driver";
	//String url="jdbc:mysql://localhost:3306/madb"
	//+"?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
	private String url="jdbc:mysql://localhost:3306/madb"		
	+ "?allowPublicKeyRetrieval=true"			
	+ "&useSSL=false"			
	+ "&useUnicode=true"		
	+ "&useLegacyDatetimeCode=false"		
	+ "&serverTimezone=Turkey";
	
	private String user="root";
	
	
	private String password="2020*";


	public SchoolDbConnect() {
		
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean insert(School schl) throws Exception
	{
		Connection conn=DriverManager.getConnection(url,user,password);
		
		String sql="insert into School (SchoolName,SchoolPrice) values(?,?)";
		
		PreparedStatement statement=conn.prepareStatement(sql);
		statement.setString(1, schl.getSchlName());
		statement.setDouble(2, schl.getSchlNo());
		
		int affected=statement.executeUpdate();
		
		return affected>0;
	}
	
	public List<School> list() throws Exception
	{
		List<School> schoolList=new ArrayList();
		
		Connection conn=DriverManager.getConnection(url,user,password);
		
		String sql="select *from Product";
		PreparedStatement statement=conn.prepareStatement(sql);
		ResultSet resultSet=statement.executeQuery();
		while(resultSet.next())
		{
			
			int productId=resultSet.getInt("productId");
			String productName=resultSet.getString("productNam");
			double salesPrice=resultSet.getDouble("salesPrice");
			School school=new School(productId,productName,salesPrice);
			
			schoolList.add(school);
		}
		conn.close();
		
		return schoolList;
		
		
	}
	 
}
