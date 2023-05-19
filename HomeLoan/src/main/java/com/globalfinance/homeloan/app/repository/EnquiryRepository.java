package com.globalfinance.homeloan.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.globalfinance.homeloan.app.model.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>
{
	public Optional<Enquiry> findByUserId (Integer userId);

}
