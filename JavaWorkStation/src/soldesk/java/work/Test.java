package soldesk.java.work;

import java.lang.reflect.Method;

public class Test {
	public  void abcd(){
		
	}
	
	public  void abcd1(){
		
	}
	public  void abcd2(){
		
	}
	public  void abcd3(){
		
	}
	public  void abcd4(){
		
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Test a = new Test();
		
		// Ŭ���� �̸����� Ŭ������ �������� �θ���.forName�� Ŭ���� �δ���Ȱ�� �Ѵ�. 
		// �׷���  forName�� �Ű������� �ܺο��� Ŭ���� �̸��� �Է��ϸ� �ڵ带 �������� �ʰ� �������� �Է��� Ŭ������ �ҷ��� �� �ִ�.
		Class classs = Class.forName("soldesk.java.work.Test");
		Method[] a1 = classs.getMethods(); //Test�� ������ �ִ� ��� �޼ҵ�(public)�� ��ȯ�Ѵ�.
		Test test = (Test) classs.newInstance();//new Test�� ����.
		
		//�������� ������ �Ͱ� ����� ����� �Ѵ�.(aaa�� test�� ��� ����)
		Class class1 = Class.forName("soldesk.java.work.aaa");
		Test test1 = (Test) class1.newInstance();
		
		
		for (int i = 0; i < a.getClass().getMethods().length; i++) {
			
			System.out.println(a1[i].getName());
			//System.out.println(a.getClass().getMethods()[i].getName());
//			Method m = a.getClass().getMethod("a");
//			System.out.println(m.invoke(a));
		}
		/*
		for (int i = 0; i < 5; i++) {
			for (int i1 = 0; i1 < 5; i1++) {
				if(i1<i)
					System.out.print("*");
				if(i1==i){
					System.out.println("*");
					break;
				}
				
			}	
			System.out.println();
		}
	System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			for (int i1 = 0; i1 < 5; i1++) {
				if(i1<=i&& i1%2==0 )
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}
	
		
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			for (int i1 = 0; i1 < 5; i1++) {
				if(i1==i )
					System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			for (int i1 = 0; i1 < 5; i1++) {

				if(i1<=i&&i%2==0){
					if(i1==0){
						System.out.print("��");
					}
					
					System.out.print("����");
				}else if(i1<=i&&i%2==1){
					if(i==1){
						System.out.print("������");
						break;
					}
					System.out.print("����");
				}
					
			}	
			System.out.println();
		}
		System.out.println("--------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j==0){	
					System.out.print("��");
				}
				
				if(j<i){
					System.out.print("����");
				}
					
			}	
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				
				if(i<=j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
					
			}	
			System.out.println();
		}
		*/
	}
		

}

class aaa extends Test{
	
	int a(){
		return 11;
	}
	int a12121(){
		return 11;
	}
	int a13131(){
		return 11;
	}
	
	int a124124(){
		return 11;
	}
}

class bbb{
	void b(){
		
	}
}











