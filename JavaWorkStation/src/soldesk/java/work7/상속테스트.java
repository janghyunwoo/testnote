package soldesk.java.work7;


public class 惑加抛胶飘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c1 = new c(10,20,30);
		
		d d1 = new d(){};
		d1.dd();
		System.out.println(c1.a+" "+c1.b+" "+c1.c);
	}

}
class Scanner{
	
}

class a{
	int a=0;
	public a() {
		// TODO Auto-generated constructor stub
		System.out.println("a积己磊");
	}
	
}

class b extends a{
	int b=1;
	public b() {
		// TODO Auto-generated constructor stub
		System.out.println("b积己磊");
	}
}

class c extends b{
	int c=2;
	public c(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		System.out.println("c积己磊");
		this.a = a;
		this.b = b;
		this.c = c;
	}
}


abstract class d{
	void dd(){
		System.out.println("ddd");
	}
}