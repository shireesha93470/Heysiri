import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileWriter;
import java.nio.file.*;

public class Library2 {
   public static void main(String[] args) 
    {    
         
        String LibraryData = "";
        
        String librarayDirectory = "/home/jtbb/Desktop/library";
        
        File directoryPath = new File(librarayDirectory);
        
         String[] books = directoryPath.list();
        
         
        
         System.out.println(getAllBooks(books));
         
         System.out.println(compareBooks("2.pdf",books));
         
         moveFile("/home/jtbb/Desktop/Library/Books/2.pdf","/home/jtbb/Desktop/shireesha/durga/2.pdf");
     
    }
   public static String getAllBooks(String[] books){
   
        String totalBooks="";
        for(int i=0; i < books.length; i++)
        
        {
            totalBooks= totalBooks+ books[i]+"\n";
        	
        } 
        return totalBooks;
        
        
    }
    public static boolean compareBooks(String book,String[] books){
    
         for(int i=0;i<books.length;i++)
         {
         
             if(book.equals(books[i]))
             {
             
                 return true;
             }
            
        }
        return false;
   }
   public static boolean moveFile(String bookToMove, String targetPath) {

    	Path p = Paths.get(bookToMove);
  
	Path q = Paths.get(targetPath);

	try
	{
		Files.move(p, q);
	}
	catch(Exception e)
	{
	
		e.printStackTrace();
		
		return false;
		
	}
	
    	return true;
}
        
} 
    
    

    /*public static String ContentOfWebsite(String urlPath){
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
            while ((inputLine = br.readLine()) != null	) {
                outLine += inputLine;
            }
            br.close();

        } catch (MalformedURLException e) { 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outLine;
    }
    
    public static void writeDataToFile(String str)
    {
	try 
	{
		FileWriter myWriter = new FileWriter("conquorer.txt");
		myWriter.write(str);
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	} 
	catch (IOException e) 
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}

    }*/
