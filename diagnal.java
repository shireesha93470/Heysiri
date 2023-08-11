class Main{
public static void main(String[] args){
int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
      
    int  count=0;    
  for(int i=0;i<matrix.length;i++){
  count=count+matrix[i][i];
  }
  int j=0;
   for(int k=0;k<matrix.length;k++){
  count=count+matrix[j][k];
  count++;
  
  }
 
  
   System.out.println(count);
   }
   }
   
   
   
   
   
   
   
   
   
   
    

   
   
   
