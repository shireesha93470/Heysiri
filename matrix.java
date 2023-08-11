 class Main{
public static void main(String[] args){
int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
      
    int  count=0;    
  for(int i=0;i<matrix.length;i++){
   for(int j=0;j<matrix.length;j++){
  if(i==0||j==0||i==matrix.length-1||j==matrix.length-1){
  count=count+matrix[i][j];
  }
  }
  
 }
  
   System.out.println(count);
   }
   }
   
   
   
   
   
   
   
   
    

   
   
   
