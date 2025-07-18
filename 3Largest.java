
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int largest=arr[n-1];
        System.out.println("First Element:"+largest);
        int second=-1;
        int third=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
            second=arr[i];
            System.out.print("Second Element:"+second);
            break;
            }
        }
        for(int i=n-2;i>=0;i--){
        if(arr[i]!=second){
                third=arr[i];
                 System.out.print("Third Element:"+third);
                break;
        }
        }
    }
}
