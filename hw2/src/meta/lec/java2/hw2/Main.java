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
		System.out.println("�̿�� ���� �ý����� ���µǾ����ϴ�.");
		
		// 4���� �� �湮�� ���ؼ� Visit ��ü ����
		Date d = new Date();
		visit1 = new Visit("��1", d);
		visit2 = new Visit("��2", d);
		visit3 = new Visit("��3", d);
		visit4 = new Visit("��4", d);
		
		// ������ �׽�Ʈ ���̽� ����
		performTestCase01();
		performTestCase02();
		performTestCase03();
		performTestCase04();
		performTestCase05();
		performTestCase06();
	}
	
	private static void performTestCase01()
	{		
		System.out.println("�׽�Ʈ ���̽� 1��  �����մϴ�.");
		
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
		System.out.println("�׽�Ʈ ���̽� 2��  �����մϴ�.");
		
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
		System.out.println("�׽�Ʈ ���̽� 3��  �����մϴ�.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
		
		visit2.setServiceExpense(30);
		visit2.setProductExpense(20);
				
		displayVisitorInfo();
	}
	
	private static void performTestCase04()
	{
		System.out.println("�׽�Ʈ ���̽� 4��  �����մϴ�.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
		
		visit2.setServiceExpense(30);
		visit2.setProductExpense(20);
				
		displayVisitorInfo();
	}
	
	private static void performTestCase05()
	{
		System.out.println("�׽�Ʈ ���̽� 5��  �����մϴ�.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
						
		displayVisitorInfo();
	}
	
	private static void performTestCase06()
	{
		System.out.println("�׽�Ʈ ���̽� 6��  �����մϴ�.");
		
		visit1.setServiceExpense(30);
		visit1.setProductExpense(20);
						
		displayVisitorInfo();
	}
	
	private static void displayVisitorInfo()
	{
		String str;
		
		str = visit1.getName() + "�� �̿뼭�� �ݾ� : " + visit1.getServiceExpense() + " - ���� : " + visit1.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit1.getName() + "�� ��ǰ �ݾ� : " + visit1.getProductExpense() + " - ���� : " + visit1.getAccumulateProductExpense();
		System.out.println(str);
		str = visit1.getName() + "�� �Ѻ�� : " + visit1.getTotalExpense() + " - ���� : " + visit1.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit1.getName() + "�� ���� ��뿡 ���� ȸ������� " + visit1.getMemberType();
		System.out.println(str);
		
		str = visit2.getName() + "�� �̿뼭�� �ݾ� : " + visit2.getServiceExpense() + " - ���� : " + visit2.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit2.getName() + "�� ��ǰ �ݾ� : " + visit2.getProductExpense() + " - ���� : " + visit2.getAccumulateProductExpense();
		System.out.println(str);
		str = visit2.getName() + "�� �Ѻ�� : " + visit2.getTotalExpense() + " - ���� : " + visit2.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit2.getName() + "�� ���� ��뿡 ���� ȸ������� " + visit2.getMemberType();
		System.out.println(str);
		
		str = visit3.getName() + "�� �̿뼭�� �ݾ� : " + visit3.getServiceExpense() + " - ���� : " + visit3.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit3.getName() + "�� ��ǰ �ݾ� : " + visit3.getProductExpense() + " - ���� : " + visit3.getAccumulateProductExpense();
		System.out.println(str);
		str = visit3.getName() + "�� �Ѻ�� : " + visit3.getTotalExpense() + " - ���� : " + visit3.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit3.getName() + "�� ���� ��뿡 ���� ȸ������� " + visit3.getMemberType();
		System.out.println(str);
		
		str = visit4.getName() + "�� �̿뼭�� �ݾ� : " + visit4.getServiceExpense() + " - ���� : " + visit4.getAccumulateServiceExpense();
		System.out.println(str);
		str = visit4.getName() + "�� ��ǰ �ݾ� : " + visit4.getProductExpense() + " - ���� : " + visit4.getAccumulateProductExpense();
		System.out.println(str);
		str = visit4.getName() + "�� �Ѻ�� : " + visit4.getTotalExpense() + " - ���� : " + visit4.getAccumulateTotalExpense();
		System.out.println(str);
		str = visit4.getName() + "�� ���� ��뿡 ���� ȸ������� " + visit4.getMemberType();
		System.out.println(str);
	}
}
