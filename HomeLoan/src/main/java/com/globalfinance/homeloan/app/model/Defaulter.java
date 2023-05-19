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
public class Defaulter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer defaulterId;
	private String firstName;
	private String lastName;
	private String EmailId;
	private Long MobileNo;
}
