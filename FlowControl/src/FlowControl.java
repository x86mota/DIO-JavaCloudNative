import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o primeiro número: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        try {
            checkNumbers(number1, number2);
            
            count(number1, number2);

        } catch (InvalidParameters e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkNumbers(int number1, int number2) throws InvalidParameters {
        if (number1 > number2){
            throw new InvalidParameters();
        }
    }

    public static void count(int number1, int number2) {
        int counter = number2 - number1;

        for (int i = 0; i < counter; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
