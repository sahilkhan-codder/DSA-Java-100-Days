package Array;

public class qa {
    static void printarr(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};

        // Print all elemets 
        printarr(arr);

        //find the sum of items
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        } 
        System.out.println(" \n the sum of the array is "+sum);


        // second largest 
        int max1=0;
        int max2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max1) {
                max2=max1;
                max1=arr[i];
            }
        }
        System.out.println("second largest is "+max2);
    }

}
