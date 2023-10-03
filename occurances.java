    /*calculate the number of occurances of a 
      given letter in a given string;*/
class occurances{
    public static void main(String[]args){
        String a="oooooo";
        char b='o';
        int count=0;
        for(int i=0;i<a.length();i++){
            if (a.charAt(i) ==b)
                count++;
        }
        System.out.print("Occurances of a given Letter "+count);
    }
}
