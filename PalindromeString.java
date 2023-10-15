import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        String original,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        original=sc.nextLine();
        for(int i=original.length()-1;i>=0;i--)
        {
            char c=original.charAt(i);
            rev=rev+c;
        }
        if(original.equals(rev))
        {
            System.out.println("palindrome string");

        }
        else System.out.println("not a palindrome");
        sc.close();
    }
    
}