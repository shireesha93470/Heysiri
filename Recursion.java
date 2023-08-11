import java.util.*;
import java.util.ArrayList;
/*class Recursion {
    public static void main(String[] args) {
        String str = "ammaa";
        boolean isPalindrome = palindrome(str, 0, str.length() - 1);

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean palindrome(String str, int start, int end) {
        if (start >= end) {
            return true;  
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;  
        }

        // Recur with the next characters
        return palindrome(str, start + 1, end - 1);
    }
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		int num=5;
		int res=factorial(num);
		System.out.println(res);
	}
	public static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		return num*factorial(num-1);
	}
}*/
/*class Recursion
{
	public static void main(String[] args)
	{
		int[] x={1,2,3,4,5};
		arraySum(x,0,5,0);
	}
	public static void arraySum(int[] a,int i,int size,int sum)
	{
		if(i==size)
		{
			System.out.println("Total Sum of Array Elements: "+sum);
			return;
		}
		sum+=a[i];
		arraySum(a,++i,size,sum);
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		String str="Bhavana";
		reverseString(str,str.length()-1,"",7);
	}
	public static void reverseString(String str,int i,String bag,int size)
	{
		if(i<0)
		{
			System.out.println("Reverse String : "+bag);
			return;
		}
		bag+=str.charAt(i);
		reverseString(str,--i,bag,size);
	}
}*/

/*class Recursion 
{
	public static void main(String[] args)
	{
		       String str="mams";
		       String reverse=polindrome(str,"",str.length()-1);
		
		
			if(str.equals(reverse))
			{
				System.out.println("Polindrome");
			}
			else
			{
				System.out.println("Not A Polindrome");
			}
		
	}
	public static String polindrome(String str,String newStr,int i)
	{
		if(i<0)
		{
			
			return newStr;
		}
		newStr+=str.charAt(i);
		return polindrome(str,newStr,--i);
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		int number = 15;
		nthFebonacci(0,1,number,2);
	}
	public static void nthFebonacci(int n1,int n2,int num,int i)
	{
		if(n2>0)
		{
			if(num == 1)
			{
				System.out.println(0);
			}
			if(i == num)
			{
				
				System.out.println(i+" febonacci Number Is : "+n2);
			}
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
	
		        nthFebonacci(n1, n2, num, ++i);
		}
		
	}
}*/

/*class Recursion
{
	public static void main(String[] str)
	{
		int num=0;
		int res=factorial(num,1,1);
		System.out.println(num+" Factorial Number Is : "+res);
	}
	public static int factorial(int num,int i,int fact)
	{
		if(i==num+1)
		{
			return fact;
		}
		fact *= i;
		return factorial(num,++i,fact);
	}
}*/

/*class Recursion
{
	public static void main(String[] str)
	{
		int num=1234;
		String number=""+num;
		int res=digitSum(number,0,0);
		System.out.println(res);
	}
	public static int digitSum(String num,int sum,int i)
	{
		if(i==num.length())
		{
			return sum;
		}
		sum=sum+num.charAt(i)-'0';
		return digitSum(num,sum,++i);
		
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		GCD(10,120,0,1);
	}
	public static void GCD(int n1,int n2,int ans,int i)
	{
		
		int ans=0;
		for(int i=1;i<n1+n2;i++)
		{
			
			if(n1%i==0 && n2%i==0)
			{
				ans=i;
			}
		}
		System.out.println(ans);
		
		//Recursion..
		
		if(i<(n1+n2))
		{
			if(n1%i == 0 && n2%i == 0)
			{
				ans=i;
			}
			GCD(n1,n2,ans,++i);
			return;
		}
		System.out.println(ans);
		
		
		
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,5,4};
		int size = array.length-1;
		
		sortedArray(array,size,0);
	}
	public static void sortedArray(int[] arr, int size, int i)
	{
		if(arr[i] < arr[i+1])
		{
			if(i ==  size-1)
			{
				System.out.println("This Array is 'Sorted' in Assending order");
				return;
			}
			sortedArray(arr, size, ++i);
		}
		else
		{
			System.out.println("Array is in 'Un Sorted' formet");
			return;
		}	
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		int base=2;
		int power=5;
		powerOfANumber(base,power,1,1);
	}
	public static void powerOfANumber(int base, int power, int i, int product)
	{
		if(i > power)
		{
			System.out.println(product);
			return;
		}
		else
		{
			product *= base;
			powerOfANumber(base, power, ++i, product);
			return;
		}
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		stringLength("abcd",0,0);
	}
	public static void stringLength(String str,int count,int i)
	{
		if(i == str.length())
		{
			System.out.println("The Length Of The String is : "+count);
			return;
		}
		else if(str.charAt(i) == str.charAt(i))
		{
			count = count+1;
			stringLength(str, count, ++i);
		}
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};
		reverseArray(array, array.length-1, "");
	}
	public static void reverseArray(int[] arr, int size, String container)
	{
		if((size+1) == 0)
		{
			System.out.println("Reverse Array Is : " + "[" + container + "]");
			return;
		}
	
		container += arr[size] + " ";
		reverseArray(arr, --size, container);
		return;	
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8};
		evenSum(arr,arr.length,0,0);
	}
	public static void evenSum(int[] arr,int size,int i,int sum)
	{
		if(i==arr.length)
		{
			System.out.println("Sum of all even Numbers in Array : " + sum);
			return;
		}
		else if(i%2==1)
		{
			sum += arr[i];
		}
		evenSum(arr,size,++i,sum);
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,9,5,12};
		maxInArray(arr,0,0);
	}
	public static void maxInArray(int[] arr, int i, int max)
	{
		if(i==arr.length)
		{
			System.out.println("Maximum element in an array is : " + max);
			return;
		}
		else if(max<arr[i])
		{
			max=arr[i];
		}
		maxInArray(arr,++i,max);
	}
}*/

/*class Recursion
{
	public static void main(String[] args)
	{
		naturalNumberSum(5,1,0);
	}
	public static void naturalNumberSum(int num,int i,int sum)
	{
		if(i==num+1)
		{
			System.out.println("The sum of natural Numbers upto " + num + " Is : " + sum);
			return;
		}
		sum+=i;
		naturalNumberSum(num,++i,sum);
	}
}*/

// 15 nth Want to solve again answer is not perfect
class Recursion
{
	public static void main(String[] args)
	{
		int num=6;
		boolean res=powerOfANumber(6,0);
		if(res)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static boolean powerOfANumber(int num,int i)
	{
		int pow=(int)Math.pow(num,i);
		if(pow>num)
		{
			return false;
		}
		if(pow==num)
		{
			return true;
		}
		return powerOfANumber(num,++i);
	}
}


/*class Recursion 
{
	public static void main(String[] args)
	{
			int num=122;
		       String str=""+num;
		       String reverse=polindrome(str,"",str.length()-1);
		
		
			if(str.equals(reverse))
			{
				System.out.println("Polindromic Number");
			}
			else
			{
				System.out.println("Not A Polindromic Number");
			}
		
	}
	public static String polindrome(String str,String newStr,int i)
	{
		if(i<0)
		{
			
			return newStr;
		}
		newStr+=str.charAt(i);
		return polindrome(str,newStr,--i);
	}
}*/
