import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
       int n=arr.length;
       int k=2;
       //k=k%n;
       reverse(arr,0,n-1);
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);
       for(int num:arr){
           System.out.print(num);
       }
    }
       static void reverse(int[] arr,int i,int j){
           while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
       }
    }
    }
