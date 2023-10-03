/*Check Whether a given string is palindrome or not */
import java.util.*;
class palindrome{
    public static void main(String[]args){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Word:");
        s= sc.nextLine();
        boolean a=true;
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) !=s.charAt(s.length()-i-1)){
                a=false;
                break;
            }
        }
        if(a)
            System.out.println("Given Word is a Palindrome");
        else
            System.out.println("Given Word is not a Palindrome");
    }
}
