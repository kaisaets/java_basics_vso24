package week2;

public class Ex40 {
    public static void printStars(int amount){
        int star = 1;
        while (star <= amount){
            System.out.print("*");
            star++;
        }
        System.out.println();
    }
    public static void printWhitespaces(int size){
        int whitespaces = 0;
        while (whitespaces < size){
            System.out.print(" ");
            whitespaces++;
        }
    }

    public static void printTriangle (int size){
        int row = 1;
        while (row <= size){
            printWhitespaces(size - row);
            printStars(row);
            row++;
        }
    }

    public static void xmasTree(int height){
        int row = 1;

        while (row <= height){
            printWhitespaces(height - row);
            printStars(2 * row - 1);
            row++;

        }
        int stand = 0;
        while (stand < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            stand++;
        }
    }

    public static void main(String[] args) {
       printTriangle(4);
       xmasTree(5);
    }

}
