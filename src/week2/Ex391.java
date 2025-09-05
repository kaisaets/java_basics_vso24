package week2;

public class Ex391 {
    public static void printStars(int amount){
        int star = 1;
        while (star <= amount){
            System.out.print("*");
            star++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
