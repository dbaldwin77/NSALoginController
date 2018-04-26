package baldwin;

import java.util.Scanner;

/***************************************************
 *
 * Project: NSALoginController 
 *
 * Created by: davidbaldwin.toUpperCase() on 4/25/18 at 7:39 PM.
 *
 ***************************************************/
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String input = scanner.nextLine();

        User newUser = new User(input);
        System.out.printf("Password: %s%n", newUser.getPassword());
        System.out.printf("Salt: %s%n", newUser.getSalt());
        System.out.printf("Hashed Password: %s%n", newUser.getHashedPassword());
        try {
            NSALoginController.hashUserPassword(newUser);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        System.out.printf("Password: %s%n", newUser.getPassword());
        System.out.printf("Salt: %s%n", newUser.getSalt());
        System.out.printf("Hashed Password: %s%n", newUser.getHashedPassword());

        System.out.print("Enter password: ");
        input = scanner.next();
        newUser.setPassword(input);

        try {
            if(NSALoginController.verifyPassword(newUser))
                System.out.println("Login Successful!");
            else
                System.out.println("Login Failed!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }

}
