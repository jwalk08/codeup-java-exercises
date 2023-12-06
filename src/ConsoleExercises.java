import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[]args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("You entered: %s, %s, %s%n", firstWord, secondWord, thirdWord);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("You entered: %s%n", sentence);

        System.out.print("Enter the length and width of the classroom: ");
        String length = scanner.nextLine();
        String width = scanner.nextLine();
        int area = Integer.parseInt(length) * Integer.parseInt(width);
        int perimeter = (Integer.parseInt(length) * 2) + (Integer.parseInt(width) * 2);
        System.out.printf("The area of the classroom is %d%n", area);
        System.out.printf("The perimeter of the classroom is %d%n", perimeter);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %2f%n",pi);
        System.out.println("Enter a length and width as numbers only seperated by a space");



    }
}

