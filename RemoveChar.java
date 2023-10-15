import java .util.*;
public class RemoveChar {
    public static void main(String[] args) {
            String original;
            int index;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string");
            original=sc.nextLine();
            System.out.println("enter the index char to be removed");
            index=sc.nextInt();
            System.out.println(original.substring(0,index)+original.substring(index+1));
            sc.close();
    }   
}
