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
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;		
	private String localAreaName;		
	private String localStreetName;		
	private String localLandmark;		
	private Integer localPinCode;		
	private Integer localHouseNo;		
	private String localCityName;		
	private String localState;		
	private String permanentAreaName;		
	private String permanentStreetName;		
	private String permanentLandmark;		
	private Integer permanentPinCode;		
	private Integer permanentHouseNo;		
	private String permanentCityName;		
	private String permanentState;		

}
