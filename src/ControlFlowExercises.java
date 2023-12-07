import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        while
//        int i = 5;
//        while(i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
        //Do While
//        int start = 0;
//        do {
//            System.out.println(start);
//            start += 2;
//        } while (start <= 100);

//        int start = 100;
//      do {
//          System.out.println(start);
//          start -= 5;
//      } while (start >= -10);
//      }

//       long start = 2;
//
//        do {
//            System.out.println(start);
//            start *= start;
//        } while (start < 1000000);

            //for loop
//        for(int i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//        }

//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//
//         for (int i = 100; i >= -10; i -= 5) {
//             System.out.println(i);
//         }

//         for (long i = 2; i < 1000000; i *= i) {
//                System.out.println(i);
//            }


//        FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if(i % 15 == 0) {
//                System.out.println("FizzBuzz" + i
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        for (int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz" + i);
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz" + i);
//            } else if(i % 3 == 0) {
//                System.out.println("FizzBuzz" + i );
//            } else {
//                System.out.println(i);
//            }
//
//        }


//       Table of Powers
//            Scanner sc = new Scanner(System.in);
//        System.out.println("what number would you like to go up to? ");
//        int userInput = sc.nextInt();
//
//        for (int i = 1; i <= userInput; i++) {
//            System.out.println(i + " " + i * i + " " + i * i * i);
//            System.out.println("Would you like to continue? [y/n]");
//            String userChoice = sc.next();
//            boolean confirmation = userChoice.equals("y");
//            if (!confirmation) {
//                break;
//            }
//
//        }

//        Convert given number grades into letter grades
       do {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter a numerical grade from 0 to 100");
              int grade = sc.nextInt();
              if (grade >= 88) {
                System.out.println("A");
              } else if (grade >= 80) {
                System.out.println("B");
              } else if (grade >= 67) {
                System.out.println("C");
              } else if (grade >= 60) {
                System.out.println("D");
              } else {
                System.out.println("F");
              }
              System.out.println("Would you like to continue? [y/n]");
              String userChoice = sc.next();
              boolean confirmation = userChoice.equals("y");
              if (!confirmation) {
                break;
              }
         } while(true);


    }
}


