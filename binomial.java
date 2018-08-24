   import java.util.Scanner;
   import java.io.*;
   class binomial
   {
   static int binCoeff(int n, int k) 
    {
     
     
        if (k == 0 || k == n)
            return 1;
         
      
        return binCoeff(n - 1, k - 1) + 
                    binCoeff(n - 1, k);
    }
     
  
    public static void main(String[] args) 
   {
        int n=5 , k=2 ;
		
	 
	 
        System.out.printf("Value of C(%d, %d) is %d ",
                        n, k, binCoeff(n, k));
    }
}
 


   
   
   
   
   
   
   
  
   
   