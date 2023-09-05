import java.util.*;
class averageofarray{
public static void main(String[]args){
	int []arr=new int[]{10,20,30,40,50};
	int sum=0;
	int avg=0;
	for (int i=0;i<arr.length;i++){
		sum=sum+arr[i];
		
		}
	avg=sum/arr.length;
	System.out.println("Average of Array is "+avg);
	}
}
