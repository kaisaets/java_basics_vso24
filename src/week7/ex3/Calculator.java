package week7.ex3;

public class Calculator {

    private Reader reader;
    private int operations;

    public Calculator(){
        this.reader = new Reader();
        this.operations = 0;
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();

        int result = value1 + value2;
        System.out.println("sum of two values: " + result);
        this.operations++;
    }

    private void difference(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();

        int result = value1 - value2;
        System.out.println("difference of two values: " + result);
        this.operations++;
    }

    private void product(){
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int result = value1 * value2;
        System.out.println("product of two values: " + result);
        this.operations++;
    }

    private void statistics(){
        System.out.print("Calculations done: " + this.operations);
    }

    public void start(){
        while(true){
            System.out.print("command: ");
            String command = reader.readString();
            if(command.equals("end")){
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")){
                difference();
            } else if (command.equals("product")){
                product();
            }
        }

        statistics();
    }
}
