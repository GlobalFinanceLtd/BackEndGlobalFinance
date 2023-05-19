package com.globalfinance.homeloan.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Documents 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer documentId;
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] panCard;	
	@Lob
	private byte[] addressProof;
	@Lob
	private byte[] photo;	
	@Lob
	private byte[] signature;	


}
