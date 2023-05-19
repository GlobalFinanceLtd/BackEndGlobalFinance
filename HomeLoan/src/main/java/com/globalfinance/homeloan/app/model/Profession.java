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
public class Profession 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;		
	private String userCompanyName;		
	private String userCompanyAddress;		
	private String userDesignation;		
	private Double userIncome;		

}
