package org.hibernate.tutorial.domain;

public class Owner extends Person {
	
	private Long stocks;
    private Long partnershipStake;
    
  public Owner(String firstname, String lastname, Long stocks, Long partnershipStake) {
        
        super(firstname, lastname);
        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
    }
 
    public Long getStocks() {
		return stocks;
	}
	public void setStocks(Long stocks) {
		this.stocks = stocks;
	}
	public Long getPartnershipStake() {
		return partnershipStake;
	}
	public void setPartnershipStake(Long partnershipStake) {
		this.partnershipStake = partnershipStake;
	}
   
}