package com.globalfinance.homeloan.app.serviceimpl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.globalfinance.homeloan.app.model.Registration;
import com.globalfinance.homeloan.app.repository.RegisterRepository;
import com.globalfinance.homeloan.app.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService
{
	@Autowired
	RegisterRepository rr;

	@Override
	public Registration post(Registration r) 
	{
		Registration reg=rr.save(r);
		return reg;
	}
//....................................................................................................................

	@Override
	public Iterable<Registration> get() 
	{
		Iterable<Registration> reg=rr.findAll();
		return reg;
	}
//....................................................................................................................
	
	@Override
	public Optional<Registration> search(Integer userId) 
	{
		Optional<Registration> r=rr.findByUserId(userId);
		return r;
	}
//....................................................................................................................

	@Override
	public String delete(int userId) 
	{
		Optional<Registration> op = rr.findById(userId);
		if (op.isPresent())
		{
			rr.deleteById(userId);
			return "Registration ID deleted Succesfully ....!!";
		} 
		else {
			return "Registration ID NOT found....";
		}
	}

	

}
