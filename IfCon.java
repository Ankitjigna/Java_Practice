import java.util.*;
public class IfCon {
    public static void main(String args[]){

// if else condition

        int a = 5;
        int b = 2;
        int c = 9;
        if(a>b){
            System.out.println("a is the largest of 2");
        } else{
            System.out.println("b is the largest of 2");
        }

// else if condition
        if(a>b && a>c){
            System.out.println("a is the largest of 3");
        }else if(b>c){
            System.out.println("b is the largest of 3");
        }else{
            System.out.println("c is the largest of 3");
        }

// Ternary condition
        int marks = 70;
        String result = (marks>=33)?"Pass":"Better luck Next Time";
        System.out.println(result);

// Even Or odd
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("The given number is Even : " + number);
        }else{
            System.out.println("The given number is odd : " + number);
        }
    }
}