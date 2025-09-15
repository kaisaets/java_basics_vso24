package week1;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        String username1 = "alex";
        String username2 = "emily";
        String password1 = "mightyducks";
        String password2 = "cat";

        Scanner sc = new Scanner(System.in);
        System.out.println("Type your username: ");
        String username = sc.nextLine();
        System.out.println("Type your password: ");
        String password = sc.nextLine();

        if (((username.equals(username1) && password.equals(password1))) || ((username.equals(username2) && password.equals(password2)))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was incorrect!");
        }
    }
}
