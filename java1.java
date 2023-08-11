class HelloWorld {
    public static void main(String[] args) {
        int arr[][]={{3,7,8},{4,6,7},{1,8,12}}; 
        String bag="";
        for(int i=0;i<arr.length;i++){
            bag=bag+arr[0][i]+" ";
        }
        int i=1;
        int j=arr.length-2;
        while(i<=j && j>=0)
        {
            bag=bag+arr[i][j]+" ";
            i++;
            j--;
        }
        for(int k=1;k<arr.length;k++){
            bag=bag+arr[arr.length-1][k]+" ";
        }
        System.out.println(bag);
    }
        
        
}
