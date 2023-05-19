package com.globalfinance.homeloan.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Admin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;	
	private String adminUserName;	
	private String adminPassword;	
	private String adminEmailId;	
	private String adminDesignation;	

}
