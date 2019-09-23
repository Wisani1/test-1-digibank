package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


import model.MoneyTransfr;
import service.moneyTransEJB;

@ManagedBean(name="moneytranscontroller")
@SessionScoped
public class moneyTransController {
	
	@EJB
	moneyTransEJB moneytransService;
	
	@ManagedProperty(value="#{moneytransfr}")
	
	private MoneyTransfr moneytransfr;
	
	
	public void AddTransaction()
	{
		System.out.println("test function");
		
		moneytransService.AddTransMoney(moneytransfr.getEntity());
	}

	public MoneyTransfr getMoneytransfr() {
		return moneytransfr;
	}


	public void setMoneytransfr(MoneyTransfr moneytransfr) {
		this.moneytransfr = moneytransfr;
	}
	
	
	
	
	
	

}
