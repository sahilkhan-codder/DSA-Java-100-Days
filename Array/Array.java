import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        // delcaring the Array
        int[] arr= new int[20];
        int[] arr2={20,30,40};

        // intizilling the array
        arr[0]=10;
        arr[1]=30;
        arr[2]=40;

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of size of array :");
        size=sc.nextInt();

        int[] arr3 = new int[size];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Please enter the "+i+" element");
            arr3[i]=sc.nextInt();
        }
        for (int i = 0; i < arr3.length; i++) {
            
            System.out.print(arr3[i]);
        }
    }
}
