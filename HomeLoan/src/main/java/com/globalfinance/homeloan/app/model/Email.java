package com.globalfinance.homeloan.app.model;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Email 
{
	private String to;	
	private String subject;	
	private String text;	
	private byte[] attachment;	


}
