package week7.ex7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("  add - adds a word pair to the dictionary\n  translate - asks a word and prints its translation\n  quit - to quit the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("translate")) {
                translate();
            } else if(command.equals("add")) {
                add();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add(){
        System.out.print("In Finnish: ");
        String word = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        this.dictionary.add(word, translation);
    }

    public void translate(){
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }
}
