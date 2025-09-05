package week2;

public class Ex394 {
    public static void printStars(int amount){
        int star = 1;
        while (star <= amount){
            System.out.print("*");
            star++;
        }
        System.out.println();
    }
    public static void printTriangle(int size){
        for(int i = 1; i <= size; i++){
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
    }
}
