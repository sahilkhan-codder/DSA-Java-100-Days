package Array;

import org.w3c.dom.traversal.TreeWalker;

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
    static void swap(int[] arr, int left , int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
   public static int [] twopointers(int[] arr){
    int left=0, right=arr.length-1;
    while(left<right){
        if (arr[left] %2==1 && arr[right] %2==0) {
            swap(arr,left,right);
        }
        if(arr[left]%2==0){
            left++;
        }
        if(arr[right]%2!=0){
            right--;
        }
    }
    return arr;
   } 
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,10,20,30,40,69};
        int target =60;
        int rotate=2;
        // threesum(arr, target);
        //  arr=rotate(arr, rotate);
        //  System.out.println("rotated array is : ");
        //  printarr(arr);
        // }

        // two pointers
        twopointers(arr); 
        printarr(arr);
    }
}