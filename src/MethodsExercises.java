import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addingNums(5, 7));
//        System.out.println(subtractingNums(5, 2));
//        System.out.println(multiplyingNums(6, 3));
//        System.out.println(dividingNums(8, 2));
//        System.out.println(modulusNums(9, 3));
//
//        System.out.println(getInteger(1, 10));
//
//
//    }
//
//
//    public static int addingNums(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtractingNums(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiplyingNums(int a, int b) {
//        return a * b;
//    }
//
//    public static double dividingNums(double a, double b) {
//        return a / b;
//    }
//
//    public static int modulusNums(int a, int b) {
//        return a % b;

        do{
            long result = factorial();
            System.out.println("Factorial result: " + result);
        }while(confirm());

        System.out.println(dice());
    }

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max);
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getInteger(min, max);
        }
    }

        public static long factorial() {
            int numToFactorialize = getInteger(1, 10);

            long currentSum = 1;
            for(int counter = 1; counter <= numToFactorialize; counter++) {
                currentSum *= counter;
            }
            return currentSum;
        }

        public static boolean confirm(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to go again? (y/N)");
            String answer = scanner.nextLine();
            return answer.equalsIgnoreCase("y");
        }

        public static String dice (){
        Scanner scanner = new Scanner(System.in);
            System.out.println("How many sides does your dice have?");
            int sides = scanner.nextInt();
            int dice1 = (int) ((Math.random() * sides) + 1);
            int dice2 = (int) ((Math.random () * sides) + 1);

            return "dice #1 = " + dice1 + " dice #2 = " + dice2;
        }
    }





