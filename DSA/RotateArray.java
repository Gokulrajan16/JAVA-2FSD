package DSA;
import java.util.Scanner;
public class RotateArray{
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			 arr[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("give the number of rotation");
		int r=sc.nextInt();
		for(int i = 1; i <= r; i++){    
            int j, last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            arr[0] = last;    
        } 
		System.out.println();  
		
		 for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        } 
		
	}
}
