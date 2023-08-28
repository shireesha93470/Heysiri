/*class Node
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
    public static void reverse(Node first)
    {
    	if(first==null||first.next==null)
    	{
    		return;
    	}
    	while(current!=null)
    	{
    		Node temp=current;
    		current=current.next;
    		temp.next=previous;
    		previous=current;
	}
    }
    
    public static void main(String[] args)
    {
    	 System.out.println("----------insert---------------");
   	 linkedList.insert(1);
   	 linkedList.insert(4);
   	 linkedList.insert(6);
   	 linkedList.insert(2);
   	 linkedList.insert(8);
   	 linkedList.insert(7);
   	 linkedList.insert(3);
   	 
   	 
   	 linkedList.display();
   	
   	 System.out.println("----------remove---------------");
   	 linkedList.remove(1);
   	 linkedList.remove(4);
   	 linkedList.remove(6);
   	 linkedList.remove(2);
   	 linkedList.remove(8);
   	 linkedList.remove(7);
   	 
   	 
   	 linkedList.display();
   	 
   	 
   	 System.out.println("---------reverse---------------");
   	 linkedList.reverse(1);
   	 linkedList.reverse(4);
   	 linkedList.reverse(6);
   	 linkedList.reverse(2);
   	 linkedList.reverse(8);
   	 linkedList.reverse(7);
   	 
   	 
   	 linkedList.display();
   	 
   }	
 }*/
 
class Node {
    int data;
    Node next;
}

public class LinkedList {
    static Node previous = null;
    static Node current = null;
    static Node first = null;

    public static void insert(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        if (first == null) {
            first = temp;
            return;
        } else {
            current = first;
            while (current != null && current.data < temp.data) {
                previous = current;
                current = current.next;
            }
        }

        // insert first
        if (current == null && previous == null && first != null) {
            temp.next = first;
            first = temp;
            return;
        }

        if (current != null && previous == null) {
            temp.next = current;
            first = temp;
        }

        // insert middle
        if (previous != null && current != null) {
            previous.next = temp;
            temp.next = current;
            return;
        }

        // insert end
        if (current == null && previous != null) {
            previous.next = temp;
            temp.next = current;
            return;
        }
    }

    public static void display() {
        Node traverse = first;
        while (traverse != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
        System.out.println("null");
    }

    // remove function
    public static void remove(int data) {
        previous = null;
        current = first;

        // traverse until you find data
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null && previous == null) {
            System.out.println("no nodes");
            return;
        }

        if (previous != null && current == null) {
            System.out.println("not found");
            return;
        }

        // node to be deleted is the first node
        if (previous == null && current != null) {
            first = current.next;
            current.next = null;
            current = null;
        }

        // node to be deleted is the middle or last node
        if (previous != null && current != null) {
            previous.next = current.next;
            current.next = null;
            current = null;
        }
    }

    public static Node reverse(Node first) {
        if (first == null || first.next == null) {
            return first;
        }

        Node previous = first;
        Node current = previous.next;
        previous.next=null;
        while (current != null) {
            Node temp = current;                                                                                
            current = current.next;
            temp.next = previous;
            previous = temp;
        }

        return previous;
    }
    public static void findMiddle(Node start)
    {
    	if(start==null)
    	{
    		System.out.println("Empty");
    		return;
    	}
    	Node traverse=start;
    	int length=0;
    	while(traverse!=null)
    	{
    		length++;
    		traverse=traverse.next;
    	}
    	int mid=length/2;
    	int position=0;
    	 traverse=start;
    	while(position!=mid)
    	{
    		position++;
    		traverse=traverse.next;
    	}
    	System.out.println(traverse.data);    	
    	
    
    }
    public static void main(String[] args) {
        System.out.println("----------insert---------------");
        LinkedList.insert(1);
        LinkedList.insert(4);
        LinkedList.insert(6);
        LinkedList.insert(2);
        LinkedList.insert(8);
        LinkedList.insert(7);
        LinkedList.insert(3);

        LinkedList.display();

        System.out.println("----------remove---------------");
        LinkedList.remove(1);
       /* remove(4);
        remove(6);
        remove(2);
        remove(8);
        remove(7);*/

        LinkedList.display();

        System.out.println("---------reverse---------------");
        first=LinkedList.reverse(first);

        LinkedList.display();
        
        System.out.println("----------------middle-----------");
       LinkedList.findMiddle(first);
    }
}

