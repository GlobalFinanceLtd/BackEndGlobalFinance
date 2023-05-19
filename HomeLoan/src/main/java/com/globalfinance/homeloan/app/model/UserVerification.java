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
public class UserVerification 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userverificationlId;
	private String userVerificationDate;
	private String userVerificationStatus;
	private String userVerificationRemark;


}
