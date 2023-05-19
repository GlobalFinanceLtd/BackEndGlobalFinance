package com.globalfinance.homeloan.app.service;

import java.util.List;
import java.util.Optional;

import com.globalfinance.homeloan.app.model.Enquiry;

public interface EnquiryService
{

	Enquiry post(Enquiry e);

	List<Enquiry> get();

	Optional<Enquiry> search(Integer userId);

	String delete(int userId);

}
