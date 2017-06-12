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
	
    /*Customer 객체 생성자*/
	public Customer(String name, boolean member, String memberType)
	{
		this.name       = name;
		this.member     = member;
		this.memberType = memberType;
	}
	
	// 고객명 리턴
	public String getName()
	{
		return this.name;
	}
	
	// 멤버쉽 고객인지 여부
	public boolean isMember()
	{
		if(this.memberType.equals(normalMember))
			return false;
		else
			return true;
	}
	
	// 멤버쉽 고객 설정
	public void setMember(boolean member)
	{
		this.member = member;
	}
	
	// 멤버쉽 종류 리턴
	public String getMemberType()
	{
		return this.memberType;
	}
	
	// 멤버쉽 종류 설정
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
