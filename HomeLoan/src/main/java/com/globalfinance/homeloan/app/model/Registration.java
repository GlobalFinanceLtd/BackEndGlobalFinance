package com.globalfinance.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Registration 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;	
	private String userFirstName;	
	private String userLastName;	
	private String userEmailId;	
	private Long userMobileNo;	
	private String userUserName;	
	private String userPassword;
	
//	@OneToOne
//	private Address address;	
//	
//	@OneToOne
//	private Documents documents;
//	
//	@OneToOne
//	private Profession profession;	
//	
//	@OneToOne
//	private Property property;	
//	
//	@OneToOne
//	private Ledger ledger;
//	
//	@OneToOne
//	private SanctionLetter sanctionLetter;
//	
//	@OneToOne
//	private LoanDisburse loanDisburse;
//	
//	@OneToOne
//	private UserBankDetails userBankDetails;
//	
//	@OneToOne
//	private Defaulter defaulter;
//	
//	@OneToOne
//	private Cibil cibil;
//	
//	@OneToOne
//	private Dealer dealer;
//	
//	@OneToOne
//	private GuarantorDetails guarantorDetails;
	
	
}
