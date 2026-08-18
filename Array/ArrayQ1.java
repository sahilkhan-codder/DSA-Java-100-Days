import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value which u want to search");
        int find=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==find) {
                System.out.println("element found at "+i);
            } else{
                System.out.println("Element not found");
            }
        }
    }
}
