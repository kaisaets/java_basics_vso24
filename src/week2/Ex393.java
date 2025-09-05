package week2;

public class Ex393 {
    public static void printStars(int amount){
        int star = 1;
        while (star <= amount){
            System.out.print("*");
            star++;
        }
        System.out.println();
    }
    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    public static void main(String[] args) {
        printRectangle(17, 3);
    }
}
