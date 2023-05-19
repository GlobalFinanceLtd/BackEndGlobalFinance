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
public class SanctionLetter 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sanctionId;		
	private String sanctionDate;		
	private String userUserName;		
	private Integer loanAmount;		
	private float rateOfInterest;		
	private Integer tenure;		
	private Integer monthlyEMI;		
	private String termsAndCondition;		
	private String sanctionLetter;		

}
