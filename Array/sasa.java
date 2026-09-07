public package Array;

import java.util.Scanner;

class sasa {

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70}

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value you want to search");
        int search=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (a[i]==search) {
                System.out.println("Value found at the index"+i);
            }
            else{
                System.out.println("value is not found");
            }
            
        }
    }
}