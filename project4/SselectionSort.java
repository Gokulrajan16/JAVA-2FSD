package project4;

import java.util.Scanner;

public class SselectionSort {
	public static void main(String[] args) {
		int[] arr= new int[20];
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
}
	
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(arr[i]>arr[j]){
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }    
		}

		System.out.println("SortedArray is:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		}
		}