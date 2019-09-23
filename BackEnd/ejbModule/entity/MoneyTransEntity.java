package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="transaction_tbl")
public class MoneyTransEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	
	private String name;
	private String sourcePassport;
	private String destinationPass;
	private String destinationBank;
	private String destCountry;
	private Integer accNumber;
	private Double amt;
	private Integer transRef;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPass() {
		return destinationPass;
	}
	public void setDestinationPass(String destinationPass) {
		this.destinationPass = destinationPass;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public Integer getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(Integer accNumber) {
		this.accNumber = accNumber;
	}
	public Double getAmt() {
		return amt;
	}
	public void setAmt(Double amt) {
		this.amt = amt;
	}
	public Integer getTransRef() {
		return transRef;
	}
	public void setTransRef(Integer transRef) {
		this.transRef = transRef;
	}
	
	
	
	
	

}
