package Thread;

public class Childthread extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Childthread mt = new  Childthread();
  		mt.start();
 	}


}
