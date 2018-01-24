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
		
		// 클래스 이름으로 클래스를 동적으로 부른다.forName이 클래스 로더역활을 한다. 
		// 그래서  forName의 매개변수로 외부에서 클래스 이름을 입력하면 코드를 변경하지 않고 동적으로 입력한 클래스를 불러올 수 있다.
		Class classs = Class.forName("soldesk.java.work.Test");
		Method[] a1 = classs.getMethods(); //Test가 가지고 있는 모든 메소드(public)을 반환한다.
		Test test = (Test) classs.newInstance();//new Test와 같다.
		
		//다형성을 구현한 것과 비슷한 기능을 한다.(aaa는 test를 상속 받음)
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
						System.out.print("ㅋ");
					}
					
					System.out.print("ㅋㅋ");
				}else if(i1<=i&&i%2==1){
					if(i==1){
						System.out.print("ㅎㅎㅎ");
						break;
					}
					System.out.print("ㅎㅎ");
				}
					
			}	
			System.out.println();
		}
		System.out.println("--------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j==0){	
					System.out.print("ㅋ");
				}
				
				if(j<i){
					System.out.print("ㅎㅋ");
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











