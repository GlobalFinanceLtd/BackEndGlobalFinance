package com.globalfinance.homeloan.app.service;

import java.util.Optional;

import com.globalfinance.homeloan.app.model.Registration;

public interface RegistrationService 
{

	Registration post(Registration r);

	Iterable<Registration> get();
	
	Optional<Registration> search(Integer userId);

	String delete(int userId);

}
