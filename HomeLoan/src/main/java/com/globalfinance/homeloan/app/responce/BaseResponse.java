package com.globalfinance.homeloan.app.responce;

import java.util.Date;
import java.util.Optional;

import com.globalfinance.homeloan.app.model.Registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> 
{
	private Integer statusCode;
	private String message;
	private T ResponseBody;
	private Date date;
	private int check;
	

	 


	public BaseResponse(Integer statusCode, String message, T responseBody, Date date) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		ResponseBody = responseBody;
		this.date = date;
	}
	
}
