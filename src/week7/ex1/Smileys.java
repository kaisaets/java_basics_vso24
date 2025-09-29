package week7.ex1;

public class Smileys {
    public static void printWithSmileys (String characterString){
        if (characterString.length() % 2 != 0){
            characterString += " ";
        }

        int smileyCount = (characterString.length() + 6 ) / 2;

        printSmileys(smileyCount);
        System.out.println(":) " + characterString + " :)");
    }

    public static void printSmileys(int count){
        for (int i = 0; i < count; i++){
            System.out.print(":)");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
    }
}
