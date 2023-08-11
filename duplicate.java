//class duplicate{
   // public static void main(String[] args){
   //      int[] arr={1,3,3,4,4,5,2,4,5,3};
       // int count=0;
       // int i=0;
       // while(i<arr.length){
          //  int j=i+1;
           // while(j<arr.length){
             //   if(arr[i]==arr[j]){
                //    count++;
                    
                   
                //};
                // System.out.println("duplicate"+":"+count);
               
           // }
              //  j++;
       // }
        //i++;
        
  // }
   
   
 //Duck number  
// import java.util.Scanner;

//public class DuckNumber {
   // public static void main(String[] args) {
      //  Scanner input = new Scanner(System.in);
       // System.out.print("Enter a number: ");
       // int num = input.nextInt();

        //if (isDuckNumber(num)) {
           // System.out.println(num + " is a Duck Number.");
       // } else {
           // System.out.println(num + " is not a Duck Number.");
        //}
   // }

   // public static boolean isDuckNumber(int num) {
        // Convert the number to a string to check for '0'
       // String numStr = Integer.toString(num);

        // Check if '0' is present in the number and it's not the first digit
       // for (int i = 1; i < numStr.length(); i++) {
           // if (numStr.charAt(i) == '0') {
               // return true;
            //}
        //}

       // return false;
    //}
//}





class duplicate{
    public static void main(String[] args){
        String number = "10504";
        if(isDuckNumber(number))
        {
            System.out.println(number + "is a duck number");
        }
        else{
            System.out.println(number + "is not a duck number");
        }
    }
    public static boolean isDuckNumber(String numstr)
    {
        if(numstr.charAt(0) != '0')
        {
		//System.out.println("Here");
		for(int i = 1 ; i < numstr.length() ; i++)
		{
		    if(numstr.charAt(i) == '0')
		    {
		        return true;
		    }
		}
	}
	
        return false;
    }
}




// class duplicate{
//     public static void main(String[] args){
//          int[] arr={1,3,3,4,4,5,2,4,5,3};
//          int i=0;
//          while(i<arr.length)
//          {
//              int j=i+1;
//              while(j<arr.length)
//              {
//                 if(arr[i]==arr[j]&&arr[i]>1)
//                 {
//                     System.out.println("duplicate"+arr[i]);
//                 }  
//                  j++;
                
//              }
//         i++;
        
//   }
// }
// }
   
// class Main{
//     public static void main(String[] args){
//         int number = 015;
//         if(isDuckNumber(number))
//         {
//             System.out.println(number + "is a duck number");
//         }
//         else{
//             System.out.println(number + "is not a duck number");
//         }
//     }
//     public static boolean isDuckNumber(int num)
//     {
//         String numstr = " " + num;
//         for(int i = 1 ; i < numstr.length() ; i++)
//         {
//             if(numstr.charAt(i) == '0')
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Main {
    public static void main(String[] args) {
        NumberWithLeadingZero number = new NumberWithLeadingZero(015);
        if (isDuckNumber(number)) {
            System.out.println(number + " is a duck number");
        } else {
            System.out.println(number + " is not a duck number");
        }
    }

    public static boolean isDuckNumber(NumberWithLeadingZero num) {
        String numstr = num.toString();
        for (int i = 1; i < numstr.length(); i++) {
            if (numstr.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }
}

class NumberWithLeadingZero {
    private int value;
    
    public NumberWithLeadingZero(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return String.format("%03d", value);
    }
}







import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        if(str.charAt(0) == '0'){
            System.out.println("not Duck number");
        }
        else{
            System.out.println("  Duck number");
        }
        
    }
}



//Count Duplicates


// class HelloWorld {
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 8,9,9};
//         int count = countDuplicates(arr);
//         System.out.println(count);
//     }

//     public static int countDuplicates(int[] arr) {
//         int count = 0;

//         for (int i = 0; i < arr.length - 1; i++) {
//             int j = i + 1;
//             while (j < arr.length && arr[i] == arr[j]) {
//                 j++;
//             }
//             if (j > i + 1) {
//                 count++;
//             }
//             i = j - 1; // Update i to the last index of the repeating element.
//         }

//         return count;
//     }
// }


//Integer to binary

// public class Main{
//     public static void main(String[] args){
//         int num=4;
//         String binary="";
//         while(num>0){
//             int rem=num%2;
//             binary=rem+binary;
//             num=num/2;
//         }
//         System.out.println(binary);
//     }
// }



//Duck number


// class duplicate{
//     public static void main(String[] args){
//         String number = "10504";
//         if(isDuckNumber(number))
//         {
//             System.out.println(number + "is a duck number");
//         }
//         else{
//             System.out.println(number + "is not a duck number");
//         }
//     }
//     public static boolean isDuckNumber(String numstr)
//     {
//         if(numstr.charAt(0) != '0')
//         {
// 		//System.out.println("Here");
// 		for(int i = 1 ; i < numstr.length() ; i++)
// 		{
// 		    if(numstr.charAt(i) == '0')
// 		    {
// 		        return true;
// 		    }
// 		}
// 	}
	
//         return false;
//     }
// }



