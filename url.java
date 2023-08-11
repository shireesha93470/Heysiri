import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class Temp1 {
    public static void main(String[] args) 
    {
        String urlPathName = "http://jericho.htmlparser.net/docs/index.html";
        String resultant = ContentOfWebsite(urlPathName);
        int startTag=0;
        int endTag=0;
        int count=1;
         startTag=findAnchorTagStart(0,resultant);
         endTag=findAnchorTagEnd(0,resultant);
         System.out.println(startTag + " : " + endTag);
           
           while(startTag!=-1&&endTag!=-1)
           {
            	System.out.println(count++);
          
          	System.out.println(startTag + " : " + endTag);
          	
            	printAnchorTagContent(startTag,endTag,resultant);
          
            	startTag=startTag+9;
            	endTag=endTag+5;
          
            	startTag=findAnchorTagStart(startTag,resultant);
            	endTag=findAnchorTagEnd(endTag,resultant);
          
           }
        
        
        
          
    }
    public static String ContentOfWebsite(String urlPath){
        String outLine = "";
        try {
            // get URL content
            
            String a = urlPath;
            URL url = new URL(a);
            URLConnection conn = url.openConnection();
 
            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
 
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                outLine += inputLine.trim();
            }
            br.close();

        } catch (MalformedURLException e) { 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outLine;
    }
    public static int findAnchorTagStart(int start,String str)
    {
       
       while(start<str.length()-9)
       {
          if(str.charAt(start)=='<' && str.charAt(start+1)=='a')
          {
             return start + 3;
          } 
             start++;
       }
          return -1;
    }
    public static int findAnchorTagEnd(int end,String str)
    {
        while(end<str.length()-6)
        {
        
       	    if(str.charAt(end)=='<' && str.charAt(end+1)=='/' && str.charAt(end+2)=='a'&& str.charAt(end+3)=='>')
            {
            
                 return end;
            
            }
                  end++;
        }
               return -1;
    }
    public static void printAnchorTagContent(int start,int end,String str)
    {
      int i = 0;
      for(i=start;i<end;i++)
      {
      	if(str.charAt(i) == '"')
      	{
      		i++;
      		break;
      	}
      }
      
      boolean endQuoteFound = false;
      
      while(endQuoteFound != true)
      {
        if(str.charAt(i) == '"')
        {
        	endQuoteFound = true;
	}
	else
	{
        	System.out.print(str.charAt(i));
        }
        
        i++;
      }
      System.out.println("");
    }
 }
    
    
