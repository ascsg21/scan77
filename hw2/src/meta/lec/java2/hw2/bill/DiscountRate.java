package meta.lec.java2.hw2.bill;

public class DiscountRate {
	private String premiumMember = "Premium";
	private String goldMember    = "Gold";
	private String silverMember  = "Silver";
/*	private String normalMember  = "Normal";*/
	
	private double serviceDiscountPremium = 0.2;
	private double serviceDiscountGold    = 0.15;
	private double serviceDiscountSilver  = 0.1;
	
	private double productDiscountPremium = 0.1;
	private double productDiscountGold    = 0.1;
	private double productDiscountSilver  = 0.1;
	
	// 멤버쉽 종류에 따라 미용실 서비스 할인율 결정
	public double getServiceDiscountRate(String type)
	{
		if(type.equals(premiumMember))
			return serviceDiscountPremium;
		else if (type.equals(goldMember))
			return serviceDiscountGold;
		else if (type.equals(silverMember))
			return serviceDiscountSilver;
		else
			return 0;
	}
	
	// 멤버쉽 종류에 따라 상품 가격 할인율 결정
	public double getProductDiscountRate(String type)
	{
		if(type.equals(premiumMember))
			return productDiscountPremium;
		else if (type.equals(goldMember))
			return productDiscountGold;
		else if (type.equals(silverMember))
			return productDiscountSilver;
		else
			return 0;
	}
}
