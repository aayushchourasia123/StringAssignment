import java .util.*;
public class UpperCaseToLowerCase {
    public static void main(String[] args) {
            String original,s1="";
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string");
            original=sc.nextLine();
            for(int i=0;i<original.length();i++)
            {
             if(original.charAt(i)>='a' && original.charAt(i)<='z')
             s1=s1+(char)(original.charAt(i)-32);
             else if(original.charAt(i)>='A' && original.charAt(i)<='Z')
             s1=s1+(char)(original.charAt(i)+32);  
            }
            System.out.println(s1);

            sc.close();
        }
    }