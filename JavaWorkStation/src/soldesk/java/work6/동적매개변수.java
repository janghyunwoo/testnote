package soldesk.java.work6;

public class �����Ű����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex(1,2,3,4,5,6,7);
	}

	//int�� �Ű������� ��� �͵� �������� �þ��.
	static void ex(int... a){
		//a�Ű������� �迭�� ó���� �ȴ�.
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		
	}
	
}
