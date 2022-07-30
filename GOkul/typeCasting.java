package GOkul;

public class typeCasting {
	public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting");
		char a='A';
		char B='d';
		char D='g';
		System.out.println("Value of a: "+a);
		int b=a;
		System.out.println("Value of b: "+b);
		float c= B;
		System.out.println("Value of c: "+c);
		double d=D;
		System.out.println("Value of d: "+d);
		
		System.out.println("Explicit Type Casting");
		double G=55.55;
		int H=(int) G;
		System.out.println("Value of a: "+G);
		System.out.println("Value of a: "+H);
	}

}
