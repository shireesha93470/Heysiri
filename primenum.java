class Main{
	public static void main(String[] args)
	{
  		System.out.println(findprime(4));
	}
	
	public static boolean findprime(int num)
 	{
  	   int count=0;
  	   int start=1;
 	      while(start<=num)
 	      {
 			
  		 if(num%start==0)
  		 {
 			  
 		    count++;
 		 }
 		     start++;
 	      }
 		  if(count==2)
  		  {
   		     return true;
  		  }
                      return false;
  	}
  
  
 }
 
  
 
 
 
