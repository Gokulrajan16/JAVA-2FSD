package GOkul;
class defaccess{
	void display() {
		System.out.println("default access modifier");
	}
}

public class defaultaccess {
	public static void main(String[] args) {
		defaccess obj= new defaccess();
		obj.display();
	}

}
