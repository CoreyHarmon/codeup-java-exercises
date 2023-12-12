import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // todo 1. Loop Basics
        // todo a. While
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        // b. todo Do While
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int j = 100;
//
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while(j >= -10);
//    }
//}

// todo Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i; // Square the current number
//        } while (i < 1000000);
//    }
//}

//        // todo  c. Refactor the previous two exercises to use a for loop instead.
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//    }
//}

// 2. todo Fizzbuzz

//        for (int i = 1; i <= 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }
//        }
//    }
//}

        // todo 3. Display a table of powers

//        Scanner scanner = new Scanner(System.in);
//
//        boolean continueProgram = true;
//
//        while (continueProgram) {
//            System.out.print("Enter an integer: ");
//            int value = scanner.nextInt();
//
//            System.out.println("Table of Powers for " + value + ":");
//            System.out.println("-----------------------------");
//            System.out.println("Number | Square | Cube");
//            System.out.println("------ | ------ | -----");
//
//            for (int i = 1; i <= value; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.printf("%-7s|%-9s|%-6s\n", i, square, cube);
//            }
//
//            System.out.print("Do you want to continue? (yes/no): ");
//            String userResponse = scanner.next().toLowerCase();
//
//            continueProgram = userResponse.equals("yes");
//        }
//
//        System.out.println("Program ended. Thank you!");
//        scanner.close();
//    }
//}


        // todo 4. Convert given number grades into letter grades

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a numerical grade
        System.out.print("Enter the numerical grade (0-100): ");
        int numericalGrade = scanner.nextInt();

        // Validate that the input is within the valid range
        if (numericalGrade < 0 || numericalGrade > 100) {
            System.out.println("Invalid input. Please enter a grade between 0 and 100.");
        } else {
            // Convert numerical grade to letter grade
            char letterGrade = convertToLetterGrade(numericalGrade);

            // Display the result
            System.out.println("Letter grade: " + letterGrade);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to convert numerical grade to letter grade
    private static char convertToLetterGrade(int numericalGrade) {
        if (numericalGrade >= 90) {
            return 'A';
        } else if (numericalGrade >= 80) {
            return 'B';
        } else if (numericalGrade >= 70) {
            return 'C';
        } else if (numericalGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

