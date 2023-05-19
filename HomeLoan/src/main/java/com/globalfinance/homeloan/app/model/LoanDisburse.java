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
public class LoanDisburse 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer disbursalId;		
	private Integer totalSanctionLoan;		
	private Integer totalAmountPaid;		
	private String emiDate;		
	private String paymentStatus;		
	private String userTransactionNo;		
	private String userBankName;		
	private String userIFSCCode;		
	private String userBranchName;		

}
