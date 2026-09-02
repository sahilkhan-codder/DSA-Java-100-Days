package Strings;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the String :");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        
        for (int i = 0; i < sb.length()/2; i++) {
            int front=i;
            int back=sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }

        System.out.println(sb);
    }
}
