
import java.util.*;
import java.io.*;

class Matrix{
    
     void interchange(int a[][],int r, int c){
        int temp,i,j;
            
           
            for(i=0;i<r;i++)
            
            {
                
                temp=a[i][0];
                a[i][0]=a[i][c-1];
                a[i][c-1]=temp;
               }
        
        
        for( i = 0;i<r;i++){
            for(j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}


// { Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int rows = sc.nextInt();
            int cols = sc.nextInt();
		    int a[][] = new int[rows][cols];
		    
		    for(int i = 0;i<rows;i++){
		        for(int j = 0;j<cols;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    Matrix obj = new Matrix();
		    obj.interchange(a, rows, cols);
		}
	}
}