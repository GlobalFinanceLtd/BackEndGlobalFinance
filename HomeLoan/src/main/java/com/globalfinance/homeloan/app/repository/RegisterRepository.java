package com.globalfinance.homeloan.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.globalfinance.homeloan.app.model.Registration;

@Repository
public interface RegisterRepository extends JpaRepository<Registration, Integer>
{
	public Optional<Registration> findByUserId (Integer userId);

}
