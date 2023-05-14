import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Basically everytime you go to a different variable you have hit enter, and the computer reads that as '\n' and puts that in the buffer, and when you go for double to string, that \n gets put on the string and doesnt record anything you write, this extra nextline is to 'waste' the \n you did when changing from double to string.
        String s = scan.nextLine();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}