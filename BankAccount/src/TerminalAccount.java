import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String branchNumber = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String customerName = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, customerName, branchNumber, balance);

        System.out.println("\nOlá " 
            + account.getCustomerName() 
            + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + account.getBranchNumber() 
            + ", conta " + account.getAccountNumber() 
            + " e seu saldo R$ " 
            + account.getBalance() 
            + " já está disponível para saque.");

        scanner.close();
    }
}
