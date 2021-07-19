/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.*/
import java.io.*;
import java.util.*;

public class Solution  {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
     
        int countWords=s.split(" ").length;

        String[] splitted =new String [countWords];
        
        for(int i=0;i<countWords;i++){
            splitted=s.trim().split("[ !,?.\\_'@]+");;
        }
        System.out.println(splitted.length);
       for(String i : splitted){
            
        System.out.println(i.toString());
    }
        scan.close();
    }
}

  







  

