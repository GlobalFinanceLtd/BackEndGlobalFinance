package com.globalfinance.homeloan.app.controller;

import java.util.Date;
import java.util.List;
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
import com.globalfinance.homeloan.app.exception.EnquiryNotFound;
import com.globalfinance.homeloan.app.model.Enquiry;
import com.globalfinance.homeloan.app.responce.BaseResponse;
import com.globalfinance.homeloan.app.service.EnquiryService;

@RestController
@RequestMapping("/enquiry")
@CrossOrigin("*")
public class EnquiryController 
{
	
	
	
	@Autowired
	EnquiryService es;
	
	@PostMapping(value = "/postenquiry")
	public ResponseEntity<BaseResponse<Enquiry>> post(@RequestBody Enquiry e)
	{
		Enquiry enquiry=es.post(e);
		BaseResponse bs=new BaseResponse<>(201,"Enquiry Details Saved Succesfully ...!!",enquiry, new Date());
		ResponseEntity<BaseResponse<Enquiry>> re=new ResponseEntity<BaseResponse<Enquiry>>(bs, HttpStatus.OK);
		return re;
	}
//......................................................................................................................

	@GetMapping("/getenquiry")
	public ResponseEntity<BaseResponse<List<Enquiry>>> get()
	{
		List<Enquiry> e=es.get();
		BaseResponse bs=new BaseResponse<>(200,"All Enquiry Details ...",e, new Date());
		ResponseEntity<BaseResponse<List<Enquiry>>> re=new ResponseEntity<BaseResponse<List<Enquiry>>>(bs,HttpStatus.OK);
		return re;
	}
//......................................................................................................................

	@GetMapping("/getenquiry/{userId}")
	public ResponseEntity<BaseResponse<Enquiry>> search(@PathVariable Integer userId)
	{
		Optional<Enquiry> op=es.search(userId);
		if(!op.isPresent())
		{
			EnquiryNotFound enf=new EnquiryNotFound("Enquiry NOT found !!");
			throw enf;
		}
		else {
			BaseResponse bs= new BaseResponse<>(200,"All data Ok",op, new Date());
			ResponseEntity<BaseResponse<Enquiry>> re=new ResponseEntity<BaseResponse<Enquiry>>(bs,HttpStatus.OK);
			return re;
		}
	}
//.....................................................................................................................

	@DeleteMapping("/deleteenquiry/{userId}")
	public ResponseEntity<BaseResponse<String>> delete(@PathVariable int userId) 
	{
		String s = es.delete(userId);
		BaseResponse<String> bs=new BaseResponse<>(204,"Enquiry Details Deleted Succesfully !!",s,new Date());
		ResponseEntity<BaseResponse<String>> re=new ResponseEntity<BaseResponse<String>>(bs,HttpStatus.OK);
		return re;
	}
	
	

}
