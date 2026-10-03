package Array;

public class leanring {

    public static void threesum(int [] arr,int target){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    if (arr[i]+arr[j]+arr[j2]==target) {
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[j2]+"]");
                        ans++;
                    }
                }
            }
        }
        System.out.println("the total values are "+ ans);
    }
    public static int[] rotate(int[] arr, int k){
        int n=arr.length;
         k=k%n;
         int [] ans=new int[n];
        int j=0;
         for (int i = n-k; i <n; i++) {
            ans[j++]=arr[i];
         }
         for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];
         }
         return ans;
    }
    static void printarr(int[] arr){
        System.out.print("array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,10,20,30,40,69};
        int target =60;
        int rotate=2;
        threesum(arr, target);
         arr=rotate(arr, rotate);
         System.out.println("rotated array is : ");
         printarr(arr);
        }
}
