package project4;
import java.util.*;
public class binarySearch {
	public static void main() {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr= new int[10];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int S=0;
		int E=arr.length-1;
		int mid;
		while(S<=E) {
			mid=S+E/2;
			if(arr[mid]==k) {
				System.out.println(arr[mid]);
			}
			else if(arr[mid]<k) {
				S=mid+1;
			}
			else {
				E=mid-1;
			}
			
		}
		System.out.println("the number is not found");
		
	}

}
