class HelloWorld {
    public static void main(String[] args) {
        int num = 153;
        int armstrongNum = 0;
        
        String numString = "" + num;
        
        for (int i =0;i < numString.length(); i++ )
        {
            int chNum = numString.charAt(i) - '0';
            armstrongNum +=  java.lang.Math.pow(chNum,numString.length()); 
        }
        
        if(num == armstrongNum)
        {
            System.out.println("Armstrong Number" + ":" + armstrongNum);
        }
        else 
        {
            System.out.println("Not an Armstrong Number"  +  ":" + armstrongNum);
        }
    }
}

