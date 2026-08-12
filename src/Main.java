import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.
//          Write a program that checks the role of the user
//          If the role is admin print "welcome admin"
//          If the role is superuser print "welcome superuser"
//          If the role is user print "welcome user" (tip:
//          use if else)
        System.out.println("---------------------------------------------------------------");
        System.out.println("Enter your role (user, superuser, or admin): ");
        String role = scanner.nextLine();
        role = role.toLowerCase();
        if (role.equals("user"))
            System.out.println("welcome user");
        else if (role.equals("superuser")) {
            System.out.println("welcome superuser");
        }
        else if (role.equals("admin")) {
            System.out.println("welcome admin");
        }
        else
            System.out.println("enter a valid role from these only: user, superuser, or admin.");

        System.out.println("---------------------------------------------------------------");

//        2.
//          Take three numbers from the user and print the greatest number.
//          Test Data
//          Input the 1st number: 25
//          Input the 2nd number: 78
//          Input the 3rd number: 87
//          Expected Output : The
//          greatest: 87

        int firstNum, secondNum, thirdNum;
        System.out.println("--largest number collector from three numbers--");
        System.out.println("Enter first number:");
        firstNum = scanner.nextInt();
        System.out.println("Enter second number:");
        secondNum = scanner.nextInt();
        System.out.println("Enter third number:");
        thirdNum = scanner.nextInt();
        if (firstNum > secondNum){
            if (firstNum > thirdNum)
                System.out.println("The greatest: " + firstNum);
            else
                System.out.println("The greatest: " + thirdNum);
        }
        else {
            if (secondNum > thirdNum)
                System.out.println("The greatest: " + secondNum);
            else
                System.out.println("The greatest: " + thirdNum);
        }

        System.out.println("---------------------------------------------------------------");

//        3.
//          Write a Java program that generates an integer between 1 and 7
//          and displays the name of the weekday.
//          Test Data
//          number: 4
//          Expected Output:
//          Wednesday

        System.out.println("--get the day name from random integer number--");

        System.out.println("Enter the number of the day from 1 to 7: ");
        int dayNumber = (int) (Math.random()* 7 + 1);
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

        }

        System.out.println("---------------------------------------------------------------");

//        4.
//          Write a program that takes a numeric score as input and prints
//          the corresponding letter grade using the following grading scale:
//          A: 90-100
//          B: 80-89
//          C: 70-79
//          D: 60-69
//          F: 0-59
//          Enter your numeric score: 85
//          Numeric Score: 85
//          Letter Grade: B

        System.out.println("--Grade calculator--");
        System.out.println("Enter your numeric score: ");
        int score = scanner.nextInt();
        System.out.println("Numeric Score: " + score);
        if (score >= 90 && score <= 100)
            System.out.println("Letter Grade: A");
        else if (score >= 80 && score < 90) {
            System.out.println("Letter Grade: B");
        }
        else if (score >= 70 && score < 80) {
            System.out.println("Letter Grade: C");
        }
        else if (score >= 60 && score < 70) {
            System.out.println("Letter Grade: D");
        }
        else if (score >= 0 && score < 60) {
            System.out.println("Letter Grade: F");
        }
        else
            System.out.println("Score should be between 0 and 100");


        System.out.println("---------------------------------------------------------------");

//        5.
//          Write a Java program that takes a person's age as input and
//          categorizes them into one of three age categories: "Child,"
//          "Teenager," or "Adult" using an if statement.
//          use an if statement to categorize the age based on the following criteria:
//            • If the age is less than 13, categorize them as a "Child."
//            • If the age is between 13 and 19 (inclusive), categorize them as a
//                    "Teenager."
//            • If the age is 20 or older, categorize them as an "Adult."
//          Sample Output:
//          Enter your age: 25
//          You are an Adult.
        System.out.println("--age categorization--");
        System.out.println("Enter you age: ");
        int age = scanner.nextInt();
        if (age >= 1 && age < 13)
            System.out.println("You are a child");
        else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager");
        }
        else if (age >= 20) {
            System.out.println("You are an adult");
        }
        else
            System.out.println("Age should be greater than 0");

        System.out.println("---------------------------------------------------------------");


    }
}