import java.util.Scanner;

/**
 * startwithjava
 */
public class startwithjava {

    public static void main(String[] args) {
        System.out.println("hello word");

        //varibales

        int age=24;
        String name="Sahil khan";
        Double Money=24.54;
        boolean t=true; 
        // overwrite 
        name ="Sam Sahil khan";

        System.out.println(name);



        // Taking input 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name_person= sc.nextLine();
        System.out.println("Name of the person is "+name_person);
    }
}