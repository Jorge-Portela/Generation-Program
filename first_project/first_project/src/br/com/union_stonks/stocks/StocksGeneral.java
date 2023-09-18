package br.com.union_stonks.stocks;

public abstract class StocksGeneral {
	String companyName;
	String companyTitle;
	double valuation;
	double stockPrice;
	
	
	public  StocksGeneral() {}
	
	public StocksGeneral(String companyName, String companyTitle, double valuation, double stockPrice) {
		this.companyName = companyName;
		this.companyTitle = companyTitle;
		this.valuation = valuation;
		this.stockPrice = stockPrice;
	}
	
	
	public abstract void buyStock();
	
	
	public abstract void sellStock();
	
	
	

	
	

	

}
