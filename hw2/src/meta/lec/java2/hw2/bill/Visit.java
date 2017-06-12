package meta.lec.java2.hw2.bill;

import meta.lec.java2.hw2.member.Customer;
import java.util.Date;

public class Visit {
	private String premiumMember = "Premium";
	private String goldMember    = "Gold";
	private String silverMember  = "Silver";
	private String normalMember  = "Normal";
	
	private Customer customer;
	private DiscountRate disRate;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	private double accumulateServiceExpense;
	private double accumulateProductExpense;
	
	private double conditionPremium = 300;
	private double conditionGold    = 200;
	private double conditionSilver  = 100;
	
	/*Customer 객체 생성자*/
	public Visit(String name, Date date)
	{
		customer = new Customer(name, false, normalMember);
		disRate  = new DiscountRate();
		this.date = date;
	}
	
	// 고객명 리턴
	public String getName()
	{
		return customer.getName();
	}
	
	// 고객의 멤버쉽 종류 리턴
	public String getMemberType()
	{
		return customer.getMemberType();
	}
	
	// 현재 지불해야 하는 미용실 서비스 비용 리턴
	public double getServiceExpense()
	{
		return this.serviceExpense;
	}
	
	// 현재 지불해야 하는 미용실 서비스 비용 설정
	public void setServiceExpense(double ex)
	{
		this.serviceExpense = ex;
		// 현재 미용실 서비스 비용 설정 후 누적 비용 설정
		this.setAccumulateServiceExpense(ex);
	}
	
	// 현재 지불해야 하는 상품 비용 리턴
	public double getProductExpense()
	{
		return this.productExpense;
	}
	
	// 현재 지불해야 하는 상품 비용 설정
	public void setProductExpense(double ex)
	{
		this.productExpense = ex;
		// 현재 상품 비용 설정 후 누적 비용 설정
		this.setAccumulateProductExpense(ex);
	}

	// 현재까지의 누적 미용실 서비스 비용 리턴
	public double getAccumulateServiceExpense()
	{
		return this.accumulateServiceExpense;
	}
	
	// 현재까지의 누적 미용실 서비스 비용 설정
	private void setAccumulateServiceExpense(double ex)
	{
		this.accumulateServiceExpense = this.accumulateServiceExpense + ex;
	}
	
	// 현재까지의 누적 상품 비용 리턴
	public double getAccumulateProductExpense()
	{
		return this.accumulateProductExpense;
	}
	
	// 현재까지의 누적 상품 비용 설정
	private void setAccumulateProductExpense(double ex)
	{
		this.accumulateProductExpense = this.accumulateProductExpense + ex;
	}
	
	// 현재 지불해야 하는 전체 비용 리턴
	public double getTotalExpense()
	{
		double sd;
		double pd;
		
		double fsd;
		double fpd;
		
		double acc;
		
		// 현재 고객의 멤버쉽 종류에 따른 각각의 할인율 결정
		sd = disRate.getServiceDiscountRate(customer.getMemberType());
		pd = disRate.getProductDiscountRate(customer.getMemberType());
		
		// 할인율이 존재하면 현재 비용에서 할인금액을 차감
		if(sd != 0)
			fsd = this.serviceExpense - ( this.serviceExpense * sd );
		else
			fsd = this.serviceExpense;

		if(pd != 0)
			fpd = this.productExpense - ( this.productExpense * pd );
		else
			fpd = this.productExpense;

		// 전체 누적 비용을 계산
		acc = this.accumulateServiceExpense + this.accumulateProductExpense;
		
		// 전체 누적 비용에 따라 고객의 멤버쉽 및 종류 설정
		if(acc >= conditionPremium)
		{
			customer.setMember(true);
			customer.setMemberType(premiumMember);
		}
		else if(acc >= conditionGold)
		{
			customer.setMember(true);
			customer.setMemberType(goldMember);
		}
		else if(acc >= conditionSilver)
		{
			customer.setMember(true);
			customer.setMemberType(silverMember);
		}
		else
		{
			customer.setMember(false);
			customer.setMemberType(normalMember);
		}
		
		// 위에서 다른 계산이 끝났으면 현재 금액을 클리어
		this.serviceExpense = 0;
		this.productExpense = 0;
		
		return fsd + fpd;
	}
	
	// 현재까지의 전체 누적 비용 리턴
	public double getAccumulateTotalExpense()
	{	
		return this.accumulateServiceExpense + this.accumulateProductExpense;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(this.customer.toString());
		sb.append(this.date);
		return sb.toString();
	}
}
