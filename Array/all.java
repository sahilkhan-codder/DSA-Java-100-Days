package Array;

public class all {
    public static void main(String[] args) {
        int[] arr = {23, 7, 45, 12, 89, 3, 56, 18, 34, 10};

    //Find the largest element in an array.
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the largest element in the array is :"+max);
    // Find the smallest element in an array.
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max){
                min=arr[i];
            }
        }
        System.out.println("the smallest element in the array is :"+min);    

    // Find the second largest element.
    int sec=0;
    int max2=0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max2) {
            sec=max2;
            max2=arr[i];
        }else if (arr[i]>sec && arr[i]<max2) {
            sec=arr[i];
        }
    }
    System.out.println("second largest element is "+sec);
    // Find the second smallest element.
    int se=Integer.MAX_VALUE;
    int min2=Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]<min2) {
            se=min2;
            min2=arr[i];
        }else if (arr[i]<se && arr[i]>min2) {
            se=arr[i];
        }
    }
    System.out.println("second smalles element is "+se);
    // Calculate the sum of all elements.
    // Calculate the average of array elements.
    // Count even and odd numbers.
    // Count positive, negative and zero.
    // Search for an element (Linear Search).
    // Check if an array is sorted.
    // Reverse an array.
    // Copy one array into another.
    // Count how many times a given number occurs.
    // Find the first occurrence of an element.
    // Find the last occurrence of an element.
    }
}
