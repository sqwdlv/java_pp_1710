import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

while(true){

    System.out.println("Kādu matemātisko darbību vēlies izpildīt? (+ - * /  e-exit): ");
    String math_op = scan.next();

    if(math_op.equals("e")){

        break;
    }

    System.out.println("Ievadi skaitli x: ");
    int num_x = scan.nextInt();

    System.out.println("Ievadi skaitli y: ");
    int num_y = scan.nextInt();


        switch (math_op) {
            case "+":
                System.out.println("Jūsu rezultāts " + num_x + math_op + num_y + " = " + sum(num_x, num_y));
                break;
            case "-":
                System.out.println("Jūsu rezultāts " + num_x + math_op + num_y + " = " + sub(num_x, num_y));
                break;
            case "*":
                System.out.println("Jūsu rezultāts " + num_x + math_op + num_y + " = " + multiply(num_x, num_y));
                break;
            case "/":
                System.out.println("Jūsu rezultāts " + num_x + math_op + num_y + " = " + divide(num_x, num_y));
                break;
            case "e":

                break;
            default:
                System.out.println("Nepareizi izvēlēta darbība. Atpazītās zīmes + (saskaitīšana) -(atņemšana), *(reizināšana), /(dalīšana)");
                break;

        }
}

    }

    public static int sum(int x, int y) {
        return x + y;
    }
    public static int sub(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;

    }
    public static float divide(float x, float y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Ar nulli dalīt nevar!");
            return Float.NaN;
        }

    }

}
