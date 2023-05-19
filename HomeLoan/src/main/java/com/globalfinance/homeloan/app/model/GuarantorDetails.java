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
public class GuarantorDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gurantorId;
	private String gurantorName;
	private String gurantorDOB;
	private String gurantorRelationWithUser;
	private Long gurantorMobileNo;
	private String gurantorAddress;
	private String gurantorOccupation;
	private Long gurantorAdharCardNo;
	

}
