package GOkul;

class privatedef{
	private void display()
	{
		
		System.out.println("Gokul");
	}
	
}

public class privateaccess{
	public static void main(String[] args) {
		privateaccess obj= new privateaccess();
		System.out.println("you cannot acces the private");
	}
}
