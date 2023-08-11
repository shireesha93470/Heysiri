//Queue
//class Node 
// {
//     int data;
// 	Node next;
// }
// class Queue
// {
//     static Node first = null;
//     public static void queue(int data)
//     {
//         Node temp = new Node();
//     	temp.data = data;
//     	temp.next = null;
//     	if (first == null) 
//     	{
//         	first = temp;
//         	return;
//       }
//   	   Node traverse = first;
//       while(traverse.next != null)
//       {
//         	traverse = traverse.next;
//       }
//         traverse.next = temp;
// }
// public static void displayQueue()
// {
//     Node traverse = first;
//     while (traverse != null) 
//     {
//         	System.out.println(traverse.data);
//         	traverse = traverse.next;
//     }
// }
// public static void dequeue() 
// {
//     if (first == null) 
//     {
//         return;
//     }
//     	Node temp = first;
//     	while(temp.next != null)
//     	{
//   		    temp = temp.next;
//     	}
//     	temp.next = null;	
// }
// public static void main(String[] args) 
// {
//     	Queue.queue(10);
//     	Queue.queue(20);
//     	Queue.queue(30);
//     	Queue.queue(40);
//     	Queue.queue(50);
//     	Queue.queue(60);
//     	Queue.queue(70);
//   		Queue.queue(80);
//     	Queue.displayQueue();
// 	}
// }


//Stack
// class Node{
//     int data;
//     Node next;
// }
// class Stack{
//     static Node top=null;
//     public static Node push(int data){
//         Node temp=new Node();
//         temp.data=data;
//         if(top==null){
//             top=temp;
//         }else{
//             temp.next=top;
//             top=temp;
//         }
//         return top;
//     }
//     public static void printstack()
//     {
//         while(top!=null){
//             System.out.println(top.data);
//             top=top.next;
//         }
//     }
//      public static void pop(){
//   	 Node temp=top;
//   	 top=top.next;
//   	 temp.next=null;
//   	 System.out.print(temp.data);
//     }
//     public static void main(String[] args){
//         Stack.push(5);
//         Stack.push(10);
//         Stack.push(15);
//         Stack.push(30);
//         Stack.push(20);
//         Stack.pop();
//         Stack.pop();
        
//         Stack.printstack();
//     }
// }
