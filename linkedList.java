class Node
{
    int data;
    Node next;
}

public class linkedList
{
    static Node previous = null;
    static Node current = null;
    static Node first = null;
    
    public static void insert ( int data )
    {
   	 Node temp = new Node();
   	 temp.data = data;
   	 temp.next = null;
   	 if( first == null )
   	 {
   		 first = temp;
   		 return;
   	 }
   	 else{
   		 current = first;
   		 while ( current != null && current.data < temp.data )
   		 {
   		      previous = current;
   		      current = current.next;
   		  }
   	 }
   	 
   	 //insert first
   	 
   	 if( current == null && previous == null && first != null )
   	 {
   		 temp.next = first;
   		 first = temp;
   		 return;
   	 }
   	 
   	 if( current != null && previous == null )
   	 {
   		 temp.next = current;
   		 first =temp;
   	 }
   	 
   	 //insert middle
   	 
   	 if( previous != null && current != null )
   	 {
   	      previous.next = temp;
   	      temp.next = current;
   	      return;
   	 }
   	 
   	 //insert end
   	 
   	 if( current == null && previous != null )
   	 {
   		 previous.next = temp;
   		 temp = current;
   		 return;
   	 }
    
    }
    
    public static void display()
    {
   	 Node traverse = first;
   	 while ( traverse != null )
   	 {
   		 System.out.println( traverse.data );
   		 traverse = traverse.next;
   	 }
    
    }
    public static void remove(int data)
    {
    	previous=null;
    	current=first;
    	while(current != null && current.data != data)
    	{
    		previous=current;
    		current=current.next;
    	}
    	if(current == null && previous==null)
    	{
    		System.out.println("no nodes");
    		return;
    	}
    	if(previous!=null && current==null)
    	{
    		System.out.println("not found");
    		return;
    	}
    	if(previous == null && current!=null)
    	{	
    		first=current.next;
    		current.next=null;
    		current=null;
    	}
    	if(previous!=null && current!=null)
    	{
    		previous.next=current.next;
    		current.next=null;
    		current=null;
    	}
    	
    	
    }
    
    public static void main(String[] args)
    {
   	 linkedList.insert(1);
   	 linkedList.insert(4);
   	 linkedList.insert(6);
   	 linkedList.insert(2);
   	 linkedList.insert(8);
   	 linkedList.insert(7);
   	 linkedList.insert(9);
   	 
   	 linkedList.display();
   	 
   	 linkedList.remove(1);
   	 linkedList.remove(2);
   	 
   }	
 }
 
 
 

    
    
    
    
    
    

