//class Main{
//public static void main(String[] args){
//String x[]="The milk is white".split(" ");
//String bag="";
//for(int i=x.length-1;i>=0;i--){
 //bag+=x[i]+" ";
//}
//System.out.println("reverse:"+x);
//}
//}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online



//class HelloWorld {
    //public static String str="Shireesha is angry girl";
    //public static char[] arr=str.toCharArray();
    
    //public static void main(String[] args) {
   //     System.out.println(findWord(0,arr));
       // System.out.println(arr);
       // reverseString(0, arr.length - 1, arr);
       // System.out.println(arr);
   // }
    
   // public static int findWord(int start, char[] arr){
        //if(start>=arr.length){
           // return -1;
        //}
      //  int wordCount=0;
        //while(arr[wordCount]!=' '){
          //  wordCount++;
        //}
          // return wordCount;
    //}
    
    //public static void reverseString(int start,int end,char[] arr){
       // if(arr==null){
           // return;
        //}
        //while(start<=end){
            //char temp=arr[start];
            //arr[start]=arr[end];
           // arr[end]=temp;
           // start++;
            //end--;
       // }
    //}
    
//}
class HelloWorld {
    public static String str="Shireesha is angry girl";
    public static char[] arr=str.toCharArray();
    
    public static void main(String[] args) {
        int wordStart=0;
        int wordEnd=0;
        reverseString(0,arr.length-1,arr);
        
         System.out.println(arr);
         
        // reverseString(0,3,arr);
        // reverseString(5,9,arr);
        // reverseString(11,12,arr);
        // reverseString(14,22,arr);
         
         while((wordEnd=findWord(wordStart, arr))!=-1)
         {
          System.out.println(wordStart + " : " + wordEnd);
          reverseString(wordStart,wordEnd - 1,arr);
          wordStart = wordEnd + 1;
          System.out.println(arr);
         }
     }
    
    public static int findWord(int start, char[] arr){
        
        if(start >= arr.length){
            return -1;
        }
        int wordEnd = start;
        while(wordEnd < arr.length && arr[wordEnd] != ' ')
        {
            wordEnd++;
           // System.out.println("***" + wordEnd);
        }
        
        return wordEnd;
    }
    
    public static void reverseString(int start,int end,char[] arr){
        if(arr==null){
            return;
        }
        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
}

