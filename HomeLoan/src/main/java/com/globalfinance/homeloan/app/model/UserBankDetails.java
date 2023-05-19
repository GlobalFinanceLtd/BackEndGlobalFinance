package com.globalfinance.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserBankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userBankDetailsId;
	private Long userBankAccountNo;
	private String userBankName;
	private String userBankBranchName;
	private String userBankIfSCNo; 
}
