import java .util.*;
public class ReverseStringWhilePreservingPosition {
    public static void main(String[] args) {
            String original,rev="";
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string");
            original=sc.nextLine();
            String original2[]=original.split(" "); //converting string to array
            for(String elem : original2)
            {
                for(int i=elem.length()-1;i>=0;i--)
                {
                    rev=rev+elem.charAt(i);
                }
                rev=rev+" ";
            }
            System.out.println(rev);
            sc.close();
        }
    }