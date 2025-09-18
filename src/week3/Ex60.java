package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        while (true){
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if (name.isEmpty()){
                break;
            }
            names.add(name);
        }

        Collections.sort(names);
        System.out.println("You entered the following names: ");
        for (String n : names) {
            System.out.println(n);

        }
    }
}
