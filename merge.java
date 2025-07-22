import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5};
      int[] arr1={2,3,4,5};
      int[] merged=new int[arr.length+arr1.length];
      int i=0,j=0,k=0;
      while(i<arr.length && j<arr1.length){
         while(i<arr.length) {
             merged[k++]=arr[i++];
         } 
         while(j<arr1.length) {
             merged[k++]=arr1[j++];
         }
      }
      Arrays.sort(merged);
      System.out.print(Arrays.toString(merged));
    }
}
