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
	
	/*Customer ��ü ������*/
	public Visit(String name, Date date)
	{
		customer = new Customer(name, false, normalMember);
		disRate  = new DiscountRate();
		this.date = date;
	}
	
	// ���� ����
	public String getName()
	{
		return customer.getName();
	}
	
	// ���� ����� ���� ����
	public String getMemberType()
	{
		return customer.getMemberType();
	}
	
	// ���� �����ؾ� �ϴ� �̿�� ���� ��� ����
	public double getServiceExpense()
	{
		return this.serviceExpense;
	}
	
	// ���� �����ؾ� �ϴ� �̿�� ���� ��� ����
	public void setServiceExpense(double ex)
	{
		this.serviceExpense = ex;
		// ���� �̿�� ���� ��� ���� �� ���� ��� ����
		this.setAccumulateServiceExpense(ex);
	}
	
	// ���� �����ؾ� �ϴ� ��ǰ ��� ����
	public double getProductExpense()
	{
		return this.productExpense;
	}
	
	// ���� �����ؾ� �ϴ� ��ǰ ��� ����
	public void setProductExpense(double ex)
	{
		this.productExpense = ex;
		// ���� ��ǰ ��� ���� �� ���� ��� ����
		this.setAccumulateProductExpense(ex);
	}

	// ��������� ���� �̿�� ���� ��� ����
	public double getAccumulateServiceExpense()
	{
		return this.accumulateServiceExpense;
	}
	
	// ��������� ���� �̿�� ���� ��� ����
	private void setAccumulateServiceExpense(double ex)
	{
		this.accumulateServiceExpense = this.accumulateServiceExpense + ex;
	}
	
	// ��������� ���� ��ǰ ��� ����
	public double getAccumulateProductExpense()
	{
		return this.accumulateProductExpense;
	}
	
	// ��������� ���� ��ǰ ��� ����
	private void setAccumulateProductExpense(double ex)
	{
		this.accumulateProductExpense = this.accumulateProductExpense + ex;
	}
	
	// ���� �����ؾ� �ϴ� ��ü ��� ����
	public double getTotalExpense()
	{
		double sd;
		double pd;
		
		double fsd;
		double fpd;
		
		double acc;
		
		// ���� ���� ����� ������ ���� ������ ������ ����
		sd = disRate.getServiceDiscountRate(customer.getMemberType());
		pd = disRate.getProductDiscountRate(customer.getMemberType());
		
		// �������� �����ϸ� ���� ��뿡�� ���αݾ��� ����
		if(sd != 0)
			fsd = this.serviceExpense - ( this.serviceExpense * sd );
		else
			fsd = this.serviceExpense;

		if(pd != 0)
			fpd = this.productExpense - ( this.productExpense * pd );
		else
			fpd = this.productExpense;

		// ��ü ���� ����� ���
		acc = this.accumulateServiceExpense + this.accumulateProductExpense;
		
		// ��ü ���� ��뿡 ���� ���� ����� �� ���� ����
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
		
		// ������ �ٸ� ����� �������� ���� �ݾ��� Ŭ����
		this.serviceExpense = 0;
		this.productExpense = 0;
		
		return fsd + fpd;
	}
	
	// ��������� ��ü ���� ��� ����
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
