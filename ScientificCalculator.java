import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");

        while (true) {
            System.out.println("\nEnter the operation you want to perform:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Sine (sin)");
            System.out.println("6. Cosine (cos)");
            System.out.println("7. Tangent (tan)");
            System.out.println("8. Natural Logarithm (ln)");
            System.out.println("9. Base-10 Logarithm (log)");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            } else if (choice >= 1 && choice <= 4) {
                System.out.println("Enter two numbers:");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();

                double result = 0;
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        result = num1 / num2;
                        break;
                }
                System.out.println("Result: " + result);
            } else if (choice >= 5 && choice <= 9) {
                System.out.println("Enter the number:");
                double num = scanner.nextDouble();

                double result = 0;
                switch (choice) {
                    case 5:
                        result = Math.sin(num);
                        break;
                    case 6:
                        result = Math.cos(num);
                        break;
                    case 7:
                        result = Math.tan(num);
                        break;
                    case 8:
                        result = Math.log(num);
                        break;
                    case 9:
                        result = Math.log10(num);
                        break;
                }
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

