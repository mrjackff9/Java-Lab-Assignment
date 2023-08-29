class sumofarrays{
    static int arr[]={12,15,17,13,3};
    static int sum(){
        int sum=0;
        int i;
        for (i =0 ; i< arr.length ; i++)
        sum +=arr[i];
        return sum;
        
    } 
    public static void main(String[]args){
    System.out.println("Sum of Array is "+sum());
}}
