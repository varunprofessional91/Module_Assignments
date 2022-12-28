package lib;

import java.util.Scanner;

public class asnTwo {
    //Ans1: Part 2

    public void display(int id, String name, int salary) {
        System.out.println(id + " | " + name + " | " + salary);
    }

    //Ans2: Part 2

    public void display(int id, String name) {
        System.out.println(id + " | " + name);
    }

    //Ans3: Part 2

    public void display(String name, int regNo, String empName, int salary) {
        System.out.println("\nId | Names | Salary");
        System.out.println(name + " | " + regNo + " | " + empName + " | " + salary);
    }

    public static void main(String[] args) {

        //Ans1: Part 1

        Scanner Id = new Scanner(System.in);

        int[] id = new int[5];

        System.out.println("Enter 5 Ids : \n");

        for (int i = 0; i < 5; i++) {
            id[i] = Id.nextInt();
        }


        Scanner Name = new Scanner(System.in);

        String[] name = new String[5];

        System.out.println("\nEnter 5 Names : \n");

        for (int n = 0; n < 5; n++) {
            name[n] = Name.next();
        }


        Scanner Salary = new Scanner(System.in);

        int[] salary = new int[5];

        System.out.println("\nEnter 5 Salary : \n");

        for (int s = 0; s < 5; s++) {
            salary[s] = Salary.nextInt();
        }

        System.out.println("\n\nId | Names | Salary");

        for (int v = 0; v < 5; v++) {
            asnTwo a = new asnTwo();
            a.display(id[v], name[v], salary[v]);
        }

        //Ans2: Part 1

        System.out.println("\n\nId | Names");

        for (int k = 0; k < 5; k++) {
            asnTwo a = new asnTwo();
            a.display(id[k], name[k]);
        }

        //Ans3: Part 1

        Scanner search = new Scanner(System.in);

        System.out.println("\n\nType Name For Details Search : \n");

        String search1 = search.next();

        for (int i = 0; i < 5; i++) {
            if (search1.equals(name[i])) {
                asnTwo classTwo = new asnTwo();
                classTwo.display(search1, id[i], name[i], salary[i]);
            }
        }
    }
}

