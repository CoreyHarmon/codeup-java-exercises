import java.util.Scanner;

public class ControlStatementsLoops {
    public static void main(String[] args) {
// ---------- Boolean Expressions -------------
//        System.out.println(10 > 5); // true
//        System.out.println(5 == 5); // true
//        System.out.println(true == false); // false
//        System.out.println(); // creates a space, or a "line"
//        System.out.println(2 <= 2); // true
//
//        // ---------- Logical Operators -------------
//        boolean isLoggedIn = true;
//        boolean isAdmin = true;
//
//        if(isLoggedIn && isAdmin){
//            System.out.println("admin Page"); // true because both sides are true
//        }
//        System.out.println((true == true) || true == false);  // true
//
//        // ---------- Logical Operators -------------
//        Scanner sc = new Scanner(System.in); // prompt to get the request started
//        System.out.print("Continue? [y/N]");
//        String userInput = sc.next();
//
//        System.out.println(userInput);
//
//        // the "new" operator makes a string pool that makes different objects
//
//        String firstName = "John";
//        String lastName = "John";  // because these are not connected to "new", they are in the same string pool

        // ------------- Control Structure ----------------

        boolean lectureTime = true; // if true, prints first line, if false, prints else statement
        if(lectureTime) {
            System.out.println("learning something");
        } else {
            System.out.println("this will always run");
        }

        boolean learningJava = true;
        boolean learningJavaScript = true;
        boolean learningHTML = true;

        // make sure this is on top, so that all can print if true
        if(learningJava && learningJavaScript && learningHTML){
            System.out.println("Learning Java, JavaScript, and HTML");
        }else if(learningJava) {
            System.out.println("Learning Java");
        }else if(learningJavaScript){
            System.out.println("Learning JavaScript");
        }else if (learningHTML){
            System.out.println("learning HTML");
        }else {
            System.out.println("Learning something else");
        }
        // --------------- Switch Statement ---------------
        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1 -> System.out.println("Case 1");
                // Fall through! - Need the keyword, "break" to only get case 1 printed
            case 2 -> System.out.println("Case 2");
            default -> System.out.println("Default case");
        }
        // ----------------- For Loop -------------------

        for(int i = 0; i < 20; i++){

            if(i == 7){
                System.out.println("Woah - that's a lucky number");
                continue;
            }

            if(i == 9){
                System.out.println("Break the loop");
                break;
            }
            System.out.println("i = " + i);
        }
    }
}

