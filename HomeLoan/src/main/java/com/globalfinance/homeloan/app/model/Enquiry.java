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
public class Enquiry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String userFirstName;	
	private String userLastName;	
	private String userEmailId;	
	private Long userMobileNo;
	private String userPanCardNo;
	private String remark;
}
