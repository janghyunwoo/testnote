package soldesk.java.work6;

public class 동적매개변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex(1,2,3,4,5,6,7);
	}

	//int형 매개변수는 몇개가 와도 동적으로 늘어난다.
	static void ex(int... a){
		//a매개변수는 배열로 처리가 된다.
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		
	}
	
}
