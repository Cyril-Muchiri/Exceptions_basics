package chief_main;

import java.util.Scanner;

public class ErrorHandling {
    public static void main(String [] args){
//simple program to divide 2 numbers and generate an exception
        Scanner scan=new Scanner(System.in);
    try{


        System.out.println("The program follows the method a/b");
        System.out.println("Enter  a: ");

        int a=scan.nextInt();

        System.out.println("Enter  b: ");
        int b= scan.nextInt();

        System.out.println("\nThe result is "+divide(a,b));
    }
catch (Exception a){
    System.out.println("oops !! something went wrong !!");
}

    //other exceptions in java
        //ArithmeticException
        //InputMismatchException
        finally {
        scan.close();
    }
    }static int divide(int a,int b){
        return a/b;
    }
}
