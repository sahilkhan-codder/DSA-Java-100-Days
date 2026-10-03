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
    public static void main(String[] args) {
        int [] arr ={10,2,50,6,69,4,5,3,1,20,30,40};
        int target =60;
        threesum(arr, target);
    }
}
