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
public class Dealer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dealerId;
	private String dealerName;
	private String dealerAddress;
	private Long dealerBankAccountNo;
	private String dealerBankName;
	private String dealerBankBranchName;
	private String dealerBankIfSCNo;


}
