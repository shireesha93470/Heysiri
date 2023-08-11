public class inttobinary{
   public static void main(String[] args)
   {
       System.out.println(binaryConvert(42,"",""));
   }
      public static String binaryConvert(int x,String bag1,String bag){
      //coverting given number into binary format
          while(x>0)
          {
            bag=bag+x%2;
            x=x/2;
          }
          for (int i = 0; i <bag.length(); i++)
          {
             bag1=bag.charAt(i) + bag1;
           }
           return bag1;
        }
    }
