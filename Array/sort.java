package Array;

public class sort {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 7, 45, 12, 89, 3, 56, 18, 34, 10 };
        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // System.out.println("sorrting using bubble sort");
        // printarray(arr);


        // selection sort takes smallest vlaue 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int smallest=arr[i];
                if(arr[j]<arr[i]){
                    smallest=arr[j];
                }
                int temp=arr[i];
                arr[i]=smallest;
                smallest=temp;
            }
        }
        System.out.println("sorting using selection sort");
        printarray(arr);


    }
}
