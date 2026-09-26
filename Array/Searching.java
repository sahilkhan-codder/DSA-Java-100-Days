package Array;

import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        int [] arr={10,22,45,67,99,105,130}

        int search;
        System.out.println("Enter the value you want to search");
        Scanner sc=new Scanner(System.in);
        search=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (a[i]==search) {
                System.out.println("value found at "+i);
            }
        }
    }
}