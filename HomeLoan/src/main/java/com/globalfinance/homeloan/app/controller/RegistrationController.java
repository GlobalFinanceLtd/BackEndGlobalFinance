package com.globalfinance.homeloan.app.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globalfinance.homeloan.app.exception.RegistrationNotFound;
import com.globalfinance.homeloan.app.model.Registration;
import com.globalfinance.homeloan.app.responce.BaseResponse;
import com.globalfinance.homeloan.app.service.RegistrationService;

@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class RegistrationController 
{
	@Autowired
	RegistrationService rs;
	
	@PostMapping("/postregistration")
	public ResponseEntity<BaseResponse<Registration>> post(@RequestBody Registration r)
	{
		Registration reg=rs.post(r);
		BaseResponse<Registration> bs=new BaseResponse<>(201, "Registration Details Saved Succesfully...!!", reg, new Date());
		ResponseEntity<BaseResponse<Registration>> re=new ResponseEntity<BaseResponse<Registration>>(bs,HttpStatus.OK);
		return re;
	}
//......................................................................................................................
	
	@GetMapping("/getregistration")
	public ResponseEntity<BaseResponse<Iterable<Registration>>> get()
	{
	   Iterable<Registration> reg=rs.get();
	   BaseResponse<Iterable<Registration>> bs=new BaseResponse<>(200, "Fetched All Registration Details !!", reg, new Date());
	   ResponseEntity<BaseResponse<Iterable<Registration>>> re=new ResponseEntity<BaseResponse<Iterable<Registration>>>(bs,HttpStatus.OK);
	   return re;
	}
//....................................................................................................................
	
	@GetMapping("/getregistration/{userId}")
	public ResponseEntity<BaseResponse<Registration>> search(@PathVariable Integer userId)
	{
		Optional<Registration> op=rs.search(userId);
		if(op.isEmpty())
		{
			RegistrationNotFound rnf=new RegistrationNotFound("Registration NOT found !!");
			throw rnf;
		}
		else {
			BaseResponse<Registration> bs=new BaseResponse<Registration>(200, "Fetched Registration Single Details !!", op, new Date());
			ResponseEntity<BaseResponse<Registration>> re=new ResponseEntity<BaseResponse<Registration>>(bs,HttpStatus.FOUND);
			return re;
		}
		
	}
//.....................................................................................................................

	@DeleteMapping("/deleteregistration/{userId}")
	public ResponseEntity<BaseResponse<String>> delete(@PathVariable int userId) 
	{	
		String s=rs.delete(userId);
		BaseResponse<String> bs=new BaseResponse<>(204,"Registration Deleted Succesfully...!!", s, new Date());
		ResponseEntity<BaseResponse<String>> re=new ResponseEntity<BaseResponse<String>>(bs,HttpStatus.NO_CONTENT);
		return re;
	}

}
