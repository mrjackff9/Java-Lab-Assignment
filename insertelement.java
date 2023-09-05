import java.io.*;
import java.lang.*;
import java.util.*;

class insertelement{
public static int []insertX(int n,int array[],int x,int pos){
	int i;
	int newarr[]=new int [n+1];
	for(i=0;i<n+1;i++){
	if (i<pos-1)
		newarr[i]=array[i];
	else if (i==pos-1)
		newarr[i]=x;
	else
		newarr[i]=array[i-1];
	}
	return newarr;
}
	public static void main(String[]args){
		int n=10;
		int i;
		int array[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array is "+Arrays.toString(array));
		int x=50;
		int pos=5;
		array=insertX(n,array,x,pos);
		System.out.println("\nArray With "+x+" inserted position is "+pos+"\n"+Arrays.toString(array));
		}
	}
