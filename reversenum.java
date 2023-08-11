class HelloWorld {
    public static void main(String[] args) {
        int num=768;
        int r;
        int sum=0;
        int temp=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else {
             System.out.println("not a palindrome");
        }
    }
}
