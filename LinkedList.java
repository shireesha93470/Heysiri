class Node
{
    int data;
    Node next;
}

public class LinkedList
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
   	 System.out.println("null");
    
    }
    //remove function
    public static void remove(int data)
    {
    	previous=null;
    	current=first;
    	 //traverse until you find data in the last
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
    	//we went untli the end and couldn't find data
    	if(previous != null && current==null)
    	{
    		System.out.println("not found");
    		return;
    	}
    	//node to be deleted is the fisrtnode
    	if(previous == null && current!=null)
    	{	
    		first=current.next;
    		current.next=null;
    		current=null;
    	}
    	//node to be deleted is the middle or last node
    	if(previous != null && current !=null)
    	{
    		previous.next=current.next;
    		current.next=null;
    		current=null;
    	}
    	
    	
    }
    
    public static void main(String[] args)
    {
   	 LinkedList.insert(1);
   	 LinkedList.insert(4);
   	 LinkedList.insert(6);
   	 LinkedList.insert(2);
   	 LinkedList.insert(8);
   	 LinkedList.insert(7);
   	 LinkedList.insert(3);
   	 
   	 LinkedList.display();
   	 
   	 LinkedList.remove(1);
   	 LinkedList.remove(4);
   	 LinkedList.remove(6);
   	 LinkedList.remove(2);
   	 LinkedList.remove(8);
   	 LinkedList.remove(7);
   	 
   	 
   	 LinkedList.display();
   	 
   }	
 }
 
 
 

    
    
    
    
    
    

