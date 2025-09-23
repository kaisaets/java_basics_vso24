package week4;

import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;
    private Random random;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
            this.passwordLength = length;
            this.random = new Random();
        }

    public String createPassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int index = this.random.nextInt(alphabet.length());
            char symbol = alphabet.charAt(index);
            password.append(symbol);
        }
        return password.toString();
    }
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
