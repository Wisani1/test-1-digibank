package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entity.MoneyTransEntity;

@ManagedBean(name="moneytransfr")
@SessionScoped

public class MoneyTransfr {
	
	private String name;
	private String sourcePassport;
	private String destinationPass;
	private String destinationBank;
	private String destCountry;
	private Integer accNumber;
	private Double amt;
	private Integer transRef;
	
	
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
	public void setAmt(Double amt)
	{
		this.amt = amt;
	}
	public Integer getTransRef() {
		return transRef;
	}
	public void setTransRef(Integer transRef) {
		this.transRef = transRef;
	}
	
	public MoneyTransEntity getEntity()
	{
		MoneyTransEntity moneyTransEntity = new MoneyTransEntity();
		moneyTransEntity.setName(name);
		moneyTransEntity.setSourcePassport(sourcePassport);
		moneyTransEntity.setDestinationPass(destinationPass);
		moneyTransEntity.setDestinationBank(destinationBank);
		moneyTransEntity.setAccNumber(accNumber);
		moneyTransEntity.setAmt(amt);
		moneyTransEntity.setTransRef(transRef);
		
		return moneyTransEntity;
		
		
	}
	
	
	
	

}
