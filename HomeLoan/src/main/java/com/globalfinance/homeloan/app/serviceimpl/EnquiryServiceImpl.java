package com.globalfinance.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.globalfinance.homeloan.app.model.Enquiry;
import com.globalfinance.homeloan.app.repository.EnquiryRepository;
import com.globalfinance.homeloan.app.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService
{
	@Autowired
	EnquiryRepository er;

	@Override
	public Enquiry post(Enquiry e) 
	{
		Enquiry enq=er.save(e);
		return enq;
	}
//......................................................................................................................


	@Override
	public List<Enquiry> get() 
	{
		List<Enquiry> enq=er.findAll();
		return enq;
	}
//......................................................................................................................


	@Override
	public Optional<Enquiry> search(Integer userId) 
	{
		Optional<Enquiry> enq=er.findByUserId(userId);
		return enq;
	}
//......................................................................................................................


	@Override
	public String delete(int userId) 
	{
		er.deleteById(userId);
		return "Enquiry ID deleted Succesfullty ...!!";
	}


	

}
