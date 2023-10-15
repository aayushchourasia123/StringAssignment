public class StringReverse {
    public static void main(String[] args) {
        String name =" hello world";
        String rev ="";
        for(int i=name.length()-1;i>=0;i--)
        {
            char c=name.charAt(i);
            rev=rev+c;
        }
        System.out.print(rev);
    }
}