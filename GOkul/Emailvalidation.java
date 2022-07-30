package GOkul;
import java.util.*;
public class Emailvalidation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 ArrayList<String> emails = new ArrayList<String>();  
		 emails.add("ngokulrajan16@gmail.com");  
		 emails.add("ashwin234@gmail.com");  
		 emails.add("ajeydev76@gmail.com");  
		 emails.add("mithra@gmail.com");  
		 emails.add("chandhru@gmail.com");  
		 emails.add( "john14@gmail.com");  
		 emails.add("barath333@gmail.com");  
		 emails.add("suriya@gmail.como");  
		 emails.add("gopi56@gmail.com");   
		 for(int i=0;i<2;i++) {	
		 System.out.println("Enter the EmailId to search");
		
	   String mail=sc.next();int op=1;
	   
	   //Validating email
	   for (String element : emails){
	         if (element.contains(mail)){
	        	 	op=0;
	               System.out.println("Valid mail id\n") ;
	         }
	      }
	      
	   if(op==1) {
		   System.out.println("invalid email id\n");
	   }
	    
	}

	
	}
}
