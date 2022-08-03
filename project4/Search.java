package project4;
import java.util.*;
public class Search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element :");
		int n=sc.nextInt();
		int [] arr=new int[10];
		System.out.println("Enter the Array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Search elements");
		int S= sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==S) {
				System.out.println("the searched element in the index:"+i);
			}
		}
	}

}
