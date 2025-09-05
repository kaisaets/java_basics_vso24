package week2;

public class Ex392 {
    public static void printStars(int amount){
        int star = 1;
        while (star <= amount){
            System.out.print("*");
            star++;
        }
        System.out.println();
    }

    public static void printSquare (int sideSize){
        for (int i = 1; i <= sideSize; i++) {
            printStars(sideSize);
        }
    }

    public static void main(String[] args) {
        printSquare(4);
    }
}
