import java.util.*;
class number{
  int num;
  int sum=0;
  void input(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter The Number:");
    num=sc.nextInt();
  }
  int checkodd(){
    if((num%2)==0){
      return 0;
  
    }
    else{
      return 1;
      
    }
  }
int sumofdigit(){
while(num!=0){
sum=sum+num%10;
num=num/10;
}
return sum;
}
    public static void main(String[]args){
      number x=new number();
      x.input();
    int a=x.checkodd();
	int b=x.sumofdigit();
	System.out.println(a);
	System.out.println(b);
    }
}
