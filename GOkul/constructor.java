package GOkul;
class Calc{
	int num1;
	float num2;
	int result;

public Calc() {
	num1=5;
}
public Calc(int n) {
	num1=10;
}
public Calc(int n,float f) {
	num1=n;
	num2=f;
	System.out.println(num1);
	System.out.println(num2);
}
}
public class constructor {
	public static void main(String[] args) {
		Calc obj= new Calc(110,220);
	}

}
