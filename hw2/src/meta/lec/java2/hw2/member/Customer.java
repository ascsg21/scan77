/**
 * 
 */
package meta.lec.java2.hw2.member;

/**
 * @author scan77
 *
 */
public class Customer {
/*	private String premiumMember = "Premium";
	private String goldMember    = "Gold";
	private String silverMember  = "Silver";*/
	private String normalMember  = "Normal";
	
	private String  name;
	private boolean member = false;
	private String  memberType;
	
    /*Customer ��ü ������*/
	public Customer(String name, boolean member, String memberType)
	{
		this.name       = name;
		this.member     = member;
		this.memberType = memberType;
	}
	
	// ���� ����
	public String getName()
	{
		return this.name;
	}
	
	// ����� ������ ����
	public boolean isMember()
	{
		if(this.memberType.equals(normalMember))
			return false;
		else
			return true;
	}
	
	// ����� �� ����
	public void setMember(boolean member)
	{
		this.member = member;
	}
	
	// ����� ���� ����
	public String getMemberType()
	{
		return this.memberType;
	}
	
	// ����� ���� ����
	public void setMemberType(String memberType)
	{
		this.memberType = memberType;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(this.name);
		sb.append(this.member);
		sb.append(this.memberType);
		return sb.toString();
	}
}
