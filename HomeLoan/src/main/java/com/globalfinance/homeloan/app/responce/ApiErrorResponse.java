package com.globalfinance.homeloan.app.responce;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiErrorResponse {
	private Integer statusCode;
	private String errorMsg;
	private Date date;
	private String urlpath;

}
