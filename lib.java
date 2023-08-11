import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileWriter;
import java.nio.file.*;


class Main{
	 
	public static String[] str;
	 
	public static void main(String[] args)
	{
	        str = getAllBooks("/home/jtbb/Desktop/shireesha/harshitha"); 
		System.out.println(isBookAvailable("3.pdf"));
		//moveBook("3.pdf","/home/jtbb/Desktop/shireesha/harshitha","/home/jtbb/Desktop/Library/Books");
		borrow("3.pdf", "harshitha");
		returnBook("3.pdf","/home/jtbb/Desktop/shireesha/harshitha","/home/jtbb/Desktop/Library/Books");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		
	}
	
	public static String[] getAllBooks(String directory)
	{ 
	        
	        
		File directorPath=new File(directory);
		return directorPath.list();
	}
	
	
	public static boolean isBookAvailable(String book)
	{
	 	String[] books = getAllBooks("/home/jtbb/Desktop/shireesha/harshitha"); 
		for(int i=0;i<books.length;i++)
		{
			if(books[i].equals(book))
			{
				return true;
			}
			
				
		}
		  return false;	
	}
	
	public static boolean moveBook(String bookName,String sourceDir,String destDir)
	{
		String bookFile=sourceDir+"/"+bookName;
		String destFile=destDir+"/"+bookName;
		
		try
		{
			Path source=Paths.get(bookFile);
			Path dest=Paths.get(destFile);
			Files.move(dest,source);
		}
		catch(Exception e)
		{
			return false;
		}
	
	       return true;
	 }
	 
	 
         public static boolean borrow(String bookName,String borrowerName)
         {
	    	String borrowerDirName = "/home/jtbb/Desktop/Library/" + borrowerName;
	    	
	    	if(isBookAvailable(bookName))
	    	{
	    		moveBook(bookName,"/home/jtbb/Desktop/Library/books/", borrowerDirName);
	  		System.out.println("borrowed");
	  		return true;
	    	}
	    	else
	    	{
	    		System.out.println(bookName + " not available in the library");
	    		return false;
	    	}
         }
         
         
         public static boolean returnBook(String bookName,String sourceDir,String destDir)
         {
         	String bookFile=sourceDir+"/"+bookName;
		String destFile=destDir+"/"+bookName;
		
		try{
		Path source=Paths.get(bookFile);
		Path dest=Paths.get(destFile);
		Files.move(source,dest);
		}
		catch(Exception e)
		{
		return false;
		}
	
	       return true;
	  	
		
		
         
         }
			
	
	
	
}
	
	
