// import java.util.*;
// class frequency{
//     public static void main(String[]args){
//         String s;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter Word:");
//         s=sc.nextLine();
//         int[] freq=new int[s.length()];
//         char a[]=s.toCharArray();
//         for(int i=0;i<s.length();i++){
//             freq[i]=1;
//             for(int j=i+1;j<s.length();j++){
//                 if(a[i] == a[j]){
//                     freq[i]++;
//             //Set a[j] to 0 to avoid printing visited character.
//                 a[j]='0';
//                 }
//             }
//         }
//         System.out.println("Frequency of the Characters");
//         for(int i=0;i<freq.length;i++){
//         if(a[i] != ' ' &&  a[i] !='0')
//             System.out.println(a[i]+" " + freq[i]);
//         }
//     }
// }

import java.util.Scanner;

public class LetterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        // Create an array to store the frequency of each letter (ignoring case)
        int[] letterFrequency = new int[26];
        // Convert the input string to lowercase for case-insensitive counting
        input = input.toLowerCase();
        // Iterate through the characters of the input string
        for (int i = 0; i < input.length(); i++) {
            /*This line retrieves the character at the current position (i) in the input string and stores it in the ch variable.*/
            char ch = input.charAt(i);
            // Check if the character is a lowercase letter 'a' to 'z'
            if (ch >= 'a' && ch <= 'z') {
                // Increment the frequency count for the corresponding letter
                letterFrequency[ch - 'a']++;
                /*If the character is a lowercase letter, this line increments the corresponding element in the letterFrequency array. It uses the ASCII value of the character minus the ASCII value of 'a' to determine the array index.*/
            }
        }
        // Print the frequency of each letter
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            int frequency = letterFrequency[i];
            if (frequency > 0) {
                System.out.println("Letter '" + letter + "' appears " + frequency + " times.");
            }
        }
    }
}
