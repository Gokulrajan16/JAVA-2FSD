package DSA;

import java.util.Scanner;

public class smallestElement {
	public static void main(String[] args) {
	int[] arr= new int[20];
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int k=0;k<n-1;k++) {
		for(int j=0;j<n-k-1;j++){
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
	}
	System.out.println(arr[3]);

}
}