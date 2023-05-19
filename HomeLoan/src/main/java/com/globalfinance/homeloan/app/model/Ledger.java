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
public class Ledger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ledgerId;		
	private Integer loanAmount;		
	private Integer paidEMIAmount;		
	private Integer totalEMIPaid;		
	private Integer remainingEMI;		
	private Integer tenure;		
	private String closeAccount;		

}
