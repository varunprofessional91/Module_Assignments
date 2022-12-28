package lib;

public class asnOne {
    public static void main(String[] args) {
        //Que1: Write programs to use all the data types and given arithmetic operations.
        //Ans1:

        byte bte = 127;
        short ShortVar = 32767;
        int IntegerVar = 2147483647;
        long lng = 922337203685477808L;
        float flt = 3.4e+038F;
        double dble = 1.7e+308D;


        short ShortOne = (short) (ShortVar - 3200);
        int IntegerOne = IntegerVar + 2147483647;
        long lng1 = lng / 7203685477808L;
        float flt1 = flt % 3.4e+038F;
        double DoubleOne = dble--;
        boolean BooleanOne = true;
        boolean BooleanTwo = false;
        char chr = 'c';

        System.out.println("\nQue1: Write programs to use all the data types and given arithmetic operations.\nAns1:\n");
        System.out.println("Byte Arithmetic Ex 127 * 1 = " + bte);
        System.out.println("Short Arithmetic Ex 32767 - 3200 = " + ShortOne);
        System.out.println("Integer Arithmetic Ex 2147483647 + 2147483647 = " + IntegerOne);
        System.out.println("Long Arithmetic Ex 92233703655477808L / 7203685477808L = " + lng1);
        System.out.println("Float Arithmetic Ex 3.4e+038F % 3.4e+038F = " + flt1);
        System.out.println("Double Arithmetic Ex 1.7e+308D-- = " + DoubleOne);
        System.out.println("Byte Ex bte1 % ShortOne = " + BooleanOne);
        System.out.println("BooleanTwo = " + BooleanTwo);
        System.out.println("Byte Arithmetic Ex" + chr);

        //Que2: Write program to perform all the arithmetic operations given in the table.
        //Ans2:

        int x = 5;
        int y = 7;

        int z1 = x + y;
        int z2 = x - y;
        int z3 = x / y;
        int z4 = x * y;
        int z5 = ++x;
        int z6 = --x;

        System.out.println("\n\nQue2: Write program to perform all the arithmetic operations given in the table.\nAns2:\n");

        System.out.println("Arithmetic Operations List Below Where x = 5 | y = 7.\n");
        System.out.println("Addition Operation x+y= " + z1);
        System.out.println("Subtraction Operation x-y = " + z2);
        System.out.println("Division Operation x/y = " + z3);
        System.out.println("Multiplication Operation x*y = " + z4);
        System.out.println("Increment Operation ++x = " + z5);
        System.out.println("Decrement Operation --x = " + z6);

        //Que3: Write a program to check if a candidate is eligible for voting or not. (Hint: Check age).
        //Ans3:

        System.out.println("\n\nQue3: Write a program to check if a candidate is eligible for voting or not. (Hint: Check age).\nAns3:\n");

        int check_age = 18;

        if (check_age >= 18) {
            System.out.println("You Are Eligible(18 Year Old) For Voting");
        } else {
            System.out.println("You Are Not Eligible For Voting");
        }

        //Que4: Write a program to check if the number is positive or negative.
        //Ans4:

        System.out.println("\n\nQue4: Write a program to check if the number is positive or negative.\nAns4:\n");

        int check_no = 0;

        if (check_no > 0) {
            System.out.println("The Number is Positive");
        } else {
            System.out.println("The Number is Negative");
        }

        //Que5: Extend the previous program to check whether the given number is positive, zero or negative. (Hint: use if-else conditions).
        //Ans5:

        System.out.println("\n\nQue5: Extend the previous program to check whether the given number is positive, zero or negative. (Hint: use if-else conditions).\nAns5:\n");

        int check_no1 = -5;

        if (check_no1 == 0) {
            System.out.println("The Number is Zero");
        } else if (check_no1 > 0) {
            System.out.println("The Number is Positive");
        } else {
            System.out.println("The Number is Negative");
        }

        //Que6: Write a program to find largest of two numbers.
        //Ans6:

        System.out.println("\n\nQue6: Write a program to find largest of two numbers.\nAns6:\n");

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("no. a is Larger Than no. b");
        } else {
            System.out.println("no. b is Larger Than no. a");
        }

        //Que7: Write a program to check given number is even or odd. (Hint: use % operator).
        //Ans7:

        System.out.println("\n\nQue7: Write a program to check given number is even or odd. (Hint: use % operator).\nAns7:\n");

        int chk = 5;

        if ((chk % 2) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        //Que8: Write a program to print 10 even numbers and 10 odd numbers.
        //Ans8:

        System.out.println("\n\nQue8: Write a program to print 10 even numbers and 10 odd numbers. \nAns8:\n");

        for (x = 1; x < 21; x++) {
            if ((x % 2) == 0) {
                System.out.println("Even no. = " + x);
            } else {
                System.out.println(" Odd no. = " + x);
            }
        }

        //Que9: Write a program to find factorial of a number.
        //Ans9:

        System.out.println("\n\nQue9: Write a program to find factorial of a number.\nAns9:\n");

        int num = 6;
        int fctl = 1;
        for (int i = 1; i <= num; ++i) {
            fctl = fctl * i;
        }
        System.out.printf("Factorial of %d = %d", num, fctl);

        //Que10: Write a program to generate tables of 10.
        //Ans10:

        System.out.println("\n\n\nQue10: Write a program to generate tables of 10.\nAns10:\n");

        int tbl = 10;
        for (int t = 1; t < 11; t++) {
            int table = tbl * t;
            System.out.println(tbl + " x " + t + " = " + table);
        }

        //Que11: Write a program to add the digits of a number.
        //Ans11:

        System.out.println("\n\n\nQue11: Write a program to add the digits of a number.\nAns11:\n");

        long Number = 123458, Counter = 0;

        for (; Number > 0; Number = Number / 10) {
            Counter++;
        }
        System.out.format("Digits of Number = %d", Counter);

        //Que12: Write a program to reverse the digits of a number.
        //Ans12:

        System.out.println("\n\n\nQue12: Write a program to reverse the digits of a number.\nAns12:\n");

        int numbr = 123456789, reverse = 0;

        for (; numbr != 0; numbr = numbr / 10) {
            int digit = numbr % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reverse Number: " + reverse);

        //Que13: Write a program to generate 10 Fibonacci numbers.
        //Ans13:

        System.out.println("\n\n\nQue13: Write a program to generate 10 Fibonacci numbers.\nAns12:\n");

        int n = 10, t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series Upto " + n + " Numbers: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        //Que14: Write a program to print 10 even numbers and 10 odd numbers.
        //Ans14:

        System.out.println("\n\n\nQue14: Write a program to print 10 even numbers and 10 odd numbers.\nAns14:\n");

        int i = 0;
        while (i < 21) {
            if ((i % 2) == 0) {
                System.out.println("Even no. = " + i);
            } else {
                System.out.println(" Odd no. = " + i);
            }
            i++;
        }
    }
}