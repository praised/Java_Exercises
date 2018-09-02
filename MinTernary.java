
/**
  MinTernary
**/
import java.util.*;

public class MinTernary {

    // Method #2
    public static int findMin2(int n1, int n2) {
        return n1 < n2 ? n1 : n2;
    }

    public static int findMin3(int n1, int n2, int n3) {
        return n1 <= n2 ? findMin2(n1, n3) : findMin2(n2, n3);
    }

    public static int findMin4(int n1, int n2, int n3, int n4) {
        return n1 <= n2 ? findMin3(n1, n3, n4) : findMin3(n2, n3, n4);
    }

    public static void main(String[] args) {

        int x, y, z, a ;

        // Scanner class to read value

        Scanner sc = new Scanner(System.in);
        // Ask for user input and assign it to variables
        System.out.print("Enter 1st integer number: ");
        x = sc.nextInt();
        System.out.print("Enter 2nd integer number: ");
        y = sc.nextInt();
        System.out.print("Enter 3rd integer number: ");
        z = sc.nextInt();
        System.out.println();
        // Method #1
        int min = x < y ? (x < z ? x : z) : (y < z ? y : z);
        //if x<y then (if x<z -> min=x else min=z) otherwise if y<z -> min=y else min=z 
        System.out.println("1st Method: The smallest number is: " + min + "\n");

        // Method #2
        System.out.println("2nd Method: The smallest number is: " + findMin3(x, y, z)+"\n");

        // Extending Method #2
        System.out.print("Enter 4th integer number: ");
        a = sc.nextInt();
        System.out.println();
        System.out.println("Extending 2nd Method to compare four numbers: The smallest number is: " + findMin4(x, y, z, a));
        sc.close();

    }
}