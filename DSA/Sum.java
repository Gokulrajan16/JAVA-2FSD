package DSA;
import java.util.*;
public class Sum {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[10];
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
			System.out.println("Sum of the array ="+sum);
	}

}
