import java.util.Arrays;
class demo{
  static int result(int[] arr){
    int maxMul=Integer.MIN_VALUE;
    for(int i=0;i<arr.length-2;i++){
      for(int j=i+1;j<arr.length-1;j++){
        for(int k=j+1;k<arr.length;k++){
          int mul=arr[i]*arr[j]*arr[k];
          maxMul=Math.max(maxMul, mul);
    }
      	}
      		}
    return maxMul;
  }
  
public static void main(String args[]){
    int[] arr={10, 3, 5, 6, 20};
  System.out.println(Arrays.toString(arr));
  int result1=result(arr);
  System.out.println(result1);
}
}
