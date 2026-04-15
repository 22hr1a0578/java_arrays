import java.util.*;
class Main {
   public static int[] productArray(int[] arr){
         int p=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
            p=p*arr[i];//total product
            }
        }
           int[] res=new int[arr.length];
            for(int i=0;i<res.length;i++){
                if(arr[i]!=0){
                res[i]=p/arr[i];  //totalproduct by arr[i]
                }
            }
            return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=productArray(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");//store the res
        }
    }
}
