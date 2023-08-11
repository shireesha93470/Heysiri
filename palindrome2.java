class HelloWorld {
    public static String str=she is a madam;
    
    
    public static char[] strArray=str.toCharArray();
    
    
    public static void main(String[] args) {
        
      
       int count = 0;
       if(functionReverseString(0, strArray.length-1, strArray)){
           count += 1;
       }
        
        //System.out.println(count);
        
        int wordStart = 0;
        int wordEnd = 0;
        
        while((wordEnd=functionWordEnd(wordStart, strArray)) != -1)
        
        {
                if(functionReverseString(wordStart, wordEnd-1, strArray)){
                    count += 1;
                }
                
                wordStart = wordEnd + 1;
        }
       
        System.out.println(count);
        
        

        
    }
    public static int functionWordEnd(int start,char[] strArray)
    {
        if(start >= strArray.length)
        {
            return -1;
            
        }
        
        int wordEnd = start;
        
        while(wordEnd < strArray.length && strArray[wordEnd]!= ' '){
            wordEnd++;
        }
       
        return wordEnd;
    }
    
     public static boolean functionReverseString(int start,int end, char[] strArray)
    {
        
        if(strArray==null)
        {
            return false;
        }
        boolean flag = true;
        while(start<=end){
            if(strArray[start] != strArray[end]){
                flag = false;
                break;
            }
            start++;
            end--;
        }
       
        return flag;
    }
}
