package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.MoneyTransEntity;

/**
 * Session Bean implementation class moneyTransEJB
 */
@Stateless
@LocalBean
public class moneyTransEJB {
	
	@PersistenceContext
	private EntityManager trns;
	
    public moneyTransEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void AddTransMoney (MoneyTransEntity moneytransEntity)
    {
    	
    	System.out.println("=========Add Transaction=========");
    	
    	trns.persist(moneytransEntity);
    	
    }
    

}
