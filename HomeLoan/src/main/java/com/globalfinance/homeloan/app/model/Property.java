package com.globalfinance.homeloan.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Property 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer propertyId;	
	private String propertyType;	
	private String propertyLocation;	
	private Integer propertyValue;	

}
