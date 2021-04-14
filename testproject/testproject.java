package sample;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("select choice from:\n");
        System.out.println("1.Addition 2.subtraction 3.division 4.multiplication\n");
        int choice = kb.nextInt();
        System.out.println();
        System.out.println("enter two numbers");
        int a,b;
        a=kb.nextInt();
        b=kb.nextInt();
        
        if (choice == 1){
            addition(a,b);
        }
        else if (choice == 2){
            subtraction(a,b);
        }
        else if (choice == 3){
            division(a,b);
        }
        else if (choice == 4){
            multiplication(a,b);
        }
        else
        	System.out.println("Invalid");
          
    }