import java.io.*;
import java.util.*;

public class Solution  {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        //String[] splitted= s.split(" ");
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

  







  

