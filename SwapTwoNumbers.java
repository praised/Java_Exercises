import java.util.*;

class SwapTwoNumbers {

        public static void main(String[] s) {

                int a, b, c;

                // Scanner class to read value

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter value of a: ");

                a = sc.nextInt();

                System.out.print("Enter value of b: ");

                b = sc.nextInt();

                System.out.print("Enter value of c: ");

                c = sc.nextInt();

                System.out.println("Before swapping - a: " + a + ", b: " + b + ",c:" + c);

                // without using thrid variable

                a = a + b + c;//

                // b=a-b-c before c=a-b-c means a->b,b->c,c->a c = a - b -c; //a->c

                b = a - b - c; // c->b

                a = a - b - c; // b->a

                String m = "\nb -> a, c -> b,  a -> c";
                System.out.println("After swapping  - a: " + a + ", b: " + b + ",c:" + c + m + "\n");

                System.out.println("second try: ");

                System.out.print("Enter value of a: ");

                a = sc.nextInt();

                System.out.print("Enter value of b: ");

                b = sc.nextInt();

                System.out.print("Enter value of c: ");

                c = sc.nextInt();

                System.out.println("Before swapping - a: " + a + ", b: " + b + ",c:" + c);

                // without using thrid variable

                a = a + b + c;

                // b=a-b-c before c=a-b-c means a->b,b->c,c->a b = a - b -c; //c->b

                c = a - b - c;

                // a->c

                a = a - b - c;

                // b->a

                String m1 = "\na -> b, b -> c,  c -> a";
                System.out.println("After swapping  - a: " + a + ", b: " + b + ",c:" + c + m1 + "\n");

                int num;

                // Scanner class to read value

                Scanner sc1 = new Scanner(System.in);

                System.out.print("Enter any integer number: ");

                num = sc1.nextInt();

                while (num != 123) {

                        // check condition for +ve, -ve and Zero

                        String m2 = num > 0 ? " is a POSITIVE NUMBER."
                                        : num < 0 ? " is a NEGATIVE NUMBER." : "IT's ZERO.";

                        System.out.println(num + ":\t" + m2);

                        System.out.print("Enter any integer number: ");

                        num = sc1.nextInt();
                }

                sc.close();
                sc1.close();
        }
}