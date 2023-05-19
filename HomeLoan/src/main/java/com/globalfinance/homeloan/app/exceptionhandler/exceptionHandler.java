package com.globalfinance.homeloan.app.exceptionhandler;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.globalfinance.homeloan.app.exception.EnquiryNotFound;
import com.globalfinance.homeloan.app.responce.ApiErrorResponse;

@RestControllerAdvice
public class exceptionHandler 
{
	@ExceptionHandler(EnquiryNotFound.class)
	public ResponseEntity<ApiErrorResponse> EnquiryNotFoundhandler(EnquiryNotFound e, HttpServletRequest request)
	{
		ApiErrorResponse aer=new ApiErrorResponse(404,e.getMessage(), new Date(), request.getRequestURI());;
		return new ResponseEntity<ApiErrorResponse>(aer, HttpStatus.NOT_FOUND);
	}
	

}
