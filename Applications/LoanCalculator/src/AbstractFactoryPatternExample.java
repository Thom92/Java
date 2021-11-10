import java.io.*;

public class AbstractFactoryPatternExample
{
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the bank where you want to take a loan amount: " );

        String bankName = br.readLine();

        System.out.println("\n");
        System.out.println("Enter the type of loan. E.g.: Home loan, Business loan, or Education loan: ");

        String loanName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("\n");
        System.out.println("Enter the interest rate for " + b.getBankName() + ":" );

        Double rate = Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.println("Enter the loan amount: ");

        double loanAmount = Double.parseDouble(br.readLine());

        System.out.println("\n");
        System.out.println("Enter the number of years you want to pay your entire loan amount");

        int years = Integer.parseInt(br.readLine());

        System.out.println("\n");
        System.out.println("You are taking a loan from: " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);

    }
}
