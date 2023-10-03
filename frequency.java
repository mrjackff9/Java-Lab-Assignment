import java.util.*;
class frequency{
    public static void main(String[]args){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Word:");
        s=sc.nextLine();
        int[] freq=new int[s.length()];
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            freq[i]=1;
            for(int j=i+1;j<s.length();j++){
                if(a[i] == a[j]){
                    freq[i]++;
                    a[j] ='0';
                }
            }
        }
        System.out.println("Frequency of the Characters");
        for(int i=0;i<freq.length;i++){
        if(a[i] != ' ' &&  a[i] !='0')
            System.out.println(a[i]+"            " + freq[i]);
        }
    }
}
