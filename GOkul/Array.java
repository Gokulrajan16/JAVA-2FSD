package GOkul;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[10];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			System.out.println("Entered array are");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	
}

}
