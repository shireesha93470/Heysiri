

class HelloWorld 
{
	public static int findEndOfSentence(int sentenceStart,String str){
	    
		if( sentenceStart >= str.length())
		{
		     return -1;
		}
		      
		int sentenceEnd=sentenceStart;
		
		while(str.charAt(sentenceEnd)!='.')
		{
		
		   sentenceEnd++;
		}
		
		return sentenceEnd;
	}

	public static int findWordsCountInASentence(int sentenceStart,int sentenceEnd,String str)
	        
	        {
	        int wordCount=0;
	        
	        for(int i=sentenceStart;i<sentenceEnd;i++){
	        
	        if(str.charAt(i)==' ')
	        {
	             wordCount++;
	             
	        }
	        }
	        return wordCount;
         
         }
	        

	public static void main(String[] args) 
	{
	    String str="The class has many doubts however a few ask them. They look scared. They just found a red bus and came to banglore. Shireesha.";
	    
	    int sentencesWithWordCount=0;
	    
	    int sentenceStart=0;
	    
	    int sentenceEnd=findEndOfSentence(0,str);
	    System.out.println(sentenceStart + " : " + sentenceEnd);
	    
	    while(sentenceEnd!=-1)
	    {
	    int wordCount=findWordsCountInASentence( sentenceStart,  sentenceEnd, str);
	    
	    if(wordCount>6)
	    {
	       sentencesWithWordCount++;
	    }
	    
	    sentenceStart=sentenceEnd+1;
	    
	    sentenceEnd=findEndOfSentence(sentenceStart,str);
	     System.out.println(sentenceStart + " : " + sentenceEnd);
	    
	    }
	    System.out.println(sentencesWithWordCount);
	    
	    //System.out.println(HelloWorld.findEndOfSentence(10,str));
	    //int endSentence = findEndOfSentence(49,str); 
	    //System.out.println(HelloWorld.findWordsCountInASentence(49,endSentence,str));
	}

}

