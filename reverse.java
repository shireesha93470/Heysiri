//reverse string

/*class Main
{
	public static void reverse(String str,String bag,int size)
	{
		if(size<0)
		{
			System.out.println(bag);
			return;
		}
		bag+=str.charAt(size);
		reverse(str,bag,--size);
	}

	public static void main(String[] args)
	{
		String str="siri";
		reverse(str,"",str.length()-1);
		
	}
}*/
//palindrome

/*class Main
{
	public static String palindrome(String str,String bag,int i)
	{
		if(i<0)
		{
			return bag;
		}
		bag+=str.charAt(i);
		return palindrome(str,bag,--i);
	}
	public static void main(String[] args)
	{
		String str="ammai";
		String newStr=palindrome(str,"",str.length()-1);
		if(str==newStr)
		{
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
	}
	
}*/

//Fibinacci series

/*class Main
{
	public static void main(String[] args)
	{
		int num=5;
		System.out.println(fibinacci(num,0,1));
		
	}
	public static int fibinacci(int num,int n1,int n2)
	{
		if(num<=0)
		{
			return n1;
			
		}
		int sum=n1+n2;
		n1=n2;
		n2=sum;
		return fibinacci(num-1,n1,n2);
	}
}*/


//factorial
/*class Main
{
	public static void main(String[] args)
	{
		int num=5;
		int result = factorial(num, 1);
		System.out.println(result);
	}
	public static int factorial(int num,int i)
	{
	    if (i > num) {
            return 1; 
        }
        int result = i * factorial(num, i + 1);
        return result;
    }
}*/


//Sum of digits in a positive integer

/*class Main
{
	public static void main(String[] args)
	{
		int num=123456;
		int sum=0;
		System.out.println(positive(num,sum));	
	}
	public static int positive(int num,int sum)
	{
		if(num>0)
		{
		int add = num % 10;
            	sum += add; 
            	num /= 10; 
            	return positive(num, sum);
        }
		return sum;
		
		
	}
}*/

//Find the length of a string

/*class Main
{
	public static void main(String[] args)
	{
		String str="shireesha";
		System.out.println(stringlength(str,0));
	}
	public static String stringlength(String str,int size)
	{
		if(size==str.length())
		{
			return Integer.toString(size);
		}
		return stringlength(str, size + 1);
	}
}*/

//Find the sum of even numbers in an array

/*class Main
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7};
		evenarray(arr,0);
	}
	public static void evenarray(int[] arr,int i)
	{
		if (i < arr.length)
		{
		    if (arr[i] % 2 == 0)
		    {
		        System.out.print(arr[i] + " ");
		    }
		    evenarray(arr, i + 1);
		}
    }
}*/







