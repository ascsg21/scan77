package meta.lec.java2.hw2;

import java.util.*;
import java.io.*;

import meta.lec.java2.hw2.bill.Visit;

public class Main {
	private static Visit visit1;
	private static Visit visit2;
	private static Visit visit3;
	private static Visit visit4;
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("미용실 할인 시스템이 오픈되었습니다.");
		
		// 4명의 고객 방문을 위해서 Visit 객체 생성
		Date d = new Date();
		visit1 = new Visit("고객1", d);
		visit2 = new Visit("고객2", d);
		visit3 = new Visit("고객3", d);
		visit4 = new Visit("고객4", d);
		
		// 각각의 테스트 케이스 수행
		performTestCase01();
		performTestCase02();
		performTestCase03();
		performTestCase04();
		performTestCase05();
		performTestCase06();
	}
	
	private static void performTestCase01()
	{		
		System.out.println("테스트 케이스 1을  수행합니다.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
		
		visit2.setServiceExpense(30);
		visit2.setProductExpense(20);
		
		visit3.setServiceExpense(30);
		visit3.setProductExpense(20);
		
		visit4.setServiceExpense(30);
		visit4.setProductExpense(20);
		
		displayVisitorInfo();
	}
	
	private static void performTestCase02()
	{		
		System.out.println("테스트 케이스 2을  수행합니다.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
		
		visit2.setServiceExpense(30);
		visit2.setProductExpense(20);
		
		visit3.setServiceExpense(30);
		visit3.setProductExpense(20);
		
		displayVisitorInfo();
	}

	private static void performTestCase03()
	{
		System.out.println("테스트 케이스 3을  수행합니다.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
		
		visit2.setServiceExpense(30);
		visit2.setProductExpense(20);
				
		displayVisitorInfo();
	}
	
	private static void performTestCase04()
	{
		System.out.println("테스트 케이스 4을  수행합니다.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
		
		visit2.setServiceExpense(30);
		visit2.setProductExpense(20);
				
		displayVisitorInfo();
	}
	
	private static void performTestCase05()
	{
		System.out.println("테스트 케이스 5을  수행합니다.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
						
		displayVisitorInfo();
	}
	
	private static void performTestCase06()
	{
		System.out.println("테스트 케이스 6을  수행합니다.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
						
		displayVisitorInfo();
	}
	
	private static void displayVisitorInfo()
	{
		String str;
		
		str = visit1.getName() + "의 미용서비스 금액 : " + visit1.getServiceExpense() + " - 누적 : " + visit1.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit1.getName() + "의 상품 금액 : " + visit1.getProductExpense() + " - 누적 : " + visit1.getAccumulateProductExpense();
		System.out.println(str);
		str = visit1.getName() + "의 총비용 : " + visit1.getTotalExpense() + " - 누적 : " + visit1.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit1.getName() + "의 누적 비용에 따른 회원듬급음 " + visit1.getMemberType();
		System.out.println(str);
		
		str = visit2.getName() + "의 미용서비스 금액 : " + visit2.getServiceExpense() + " - 누적 : " + visit2.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit2.getName() + "의 상품 금액 : " + visit2.getProductExpense() + " - 누적 : " + visit2.getAccumulateProductExpense();
		System.out.println(str);
		str = visit2.getName() + "의 총비용 : " + visit2.getTotalExpense() + " - 누적 : " + visit2.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit2.getName() + "의 누적 비용에 따른 회원듬급음 " + visit2.getMemberType();
		System.out.println(str);
		
		str = visit3.getName() + "의 미용서비스 금액 : " + visit3.getServiceExpense() + " - 누적 : " + visit3.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit3.getName() + "의 상품 금액 : " + visit3.getProductExpense() + " - 누적 : " + visit3.getAccumulateProductExpense();
		System.out.println(str);
		str = visit3.getName() + "의 총비용 : " + visit3.getTotalExpense() + " - 누적 : " + visit3.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit3.getName() + "의 누적 비용에 따른 회원듬급음 " + visit3.getMemberType();
		System.out.println(str);
		
		str = visit4.getName() + "의 미용서비스 금액 : " + visit4.getServiceExpense() + " - 누적 : " + visit4.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit4.getName() + "의 상품 금액 : " + visit4.getProductExpense() + " - 누적 : " + visit4.getAccumulateProductExpense();
		System.out.println(str);
		str = visit4.getName() + "의 총비용 : " + visit4.getTotalExpense() + " - 누적 : " + visit4.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit4.getName() + "의 누적 비용에 따른 회원듬급음 " + visit4.getMemberType();
		System.out.println(str);
	}
}
