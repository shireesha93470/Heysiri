import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class Temp2 {
    public static void main(String[] args) 
    {
        String urlPathName = "http://jericho.htmlparser.net/docs/index.html";
        String resultant = ContentOfWebsite(urlPathName);
        System.out.println(resultant.length());
        int dStart=0;
        int dEnd=0;
        int count=1;
        dStart=findDivStart(0, resultant);
        dEnd=findDivEnd(0,resultant);
        while(dStart!=-1)
        {
           System.out.println(count++);
          
           printDivContent(dStart,dEnd,resultant);
           
            dStart=dStart+4;
            dEnd=dEnd+5;
          
            dStart=findDivStart(dStart,resultant);
            dEnd=findDivEnd(dEnd,resultant);
          
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
    
    public static int findDivStart(int start,String str)
    {
           
            while(start<str.length()-4)
            {
                 if(str.charAt(start)== '<' && str.charAt(start+1)== 'd'  && str.charAt(start+2)== 'i' && str.charAt(start+3)=='v' )
                 {
                   
                    return start+4;
                    
                 } 
                    start++;
            }
                    
                    return -1;
             
                    
           
     }
    public static int findDivEnd(int end,String str)
    {
          
         
          while(end<str.length()-5)
          {
                 if(str.charAt(end)== '<' && str.charAt(end+1)== '/'  && str.charAt(end+2)== 'd' && str.charAt(end+3)=='i' && str.charAt(end+4)=='v'&& str.charAt(end+5)=='>')
                 { 
                 
                    return end;
                    
                 } 
                    end++;
          }
                    return -1;
           
    }
        
     public static void printDivContent(int start,int end ,String str)
     {       
             
             for(int i=start;i<end;i++)
             {
             	     
             	 System.out.print(str.charAt(i));
             	     
             }
                 System.out.println("");
     }
        
        
        
       
   
}
