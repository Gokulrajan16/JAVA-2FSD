package DSA;

public class Multiply {
	public static void main(String[] args) {
		int a[][]={{1,1},{2,2}};    
		int b[][]={{1,1},{2,2}};
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++){    
			for(int j=0;j<2;j++){    
			c[i][j]=0;      
			for(int k=0;k<2;k++)      
			{      
			c[i][j]+=a[i][k]*b[k][j];      
			}//end of k loop  
			System.out.print(c[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//new line    
			}
	}

}
