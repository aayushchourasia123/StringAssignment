public class SortingStringAlphabatecally {
    public static void main(String[] args) {
        String st1="aJgdkj";
        st1=st1.toLowerCase();
        char arr[]=st1.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        for(char k : arr)
        System.out.print(k);
    }
}