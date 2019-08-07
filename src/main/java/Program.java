import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        init();
    }

    private static void init()
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome to the payslip generator!\n");
        System.out.println("Please input your name: ");
        String name = scn.nextLine();
        System.out.println("Please input your surname: ");
        String surname = scn.nextLine();
        System.out.println("Please enter your annual salary: ");
        int salary = Integer.parseInt(scn.nextLine());
        System.out.println("Please enter your super rate: ");
        int superRate = Integer.parseInt(scn.nextLine());
        System.out.println("Please enter your payment start date: ");
        String startDate = scn.nextLine();
        System.out.println("Please enter your payment end date: ");
        String endDate = scn.nextLine();

        calculatePayslip(salary, superRate, name, surname, startDate, endDate);
    }

    private static void calculatePayslip(int aSalary, int aSuperRate, String name, String surname, String startDate, String endDate)
    {
        int grossIncome = calcGrossIncome(aSalary);
        int incomeTax = calcIncomeTax(aSalary);
        int netIncome = calcNetIncome(grossIncome, incomeTax);
        int mySuper = calcSuper(grossIncome, aSuperRate);

        printSlip(name, surname, startDate, endDate, grossIncome, incomeTax, netIncome, mySuper);
    }

    private static void printSlip(String aName, String aSurname, String aStartDate, String aEndDate, int grossIncome,
                                  int incomeTax, int netIncome, int mySuper)
    {
        System.out.println("Your payslip has been generated:\n");
        System.out.println("Name: " + aName + " " + aSurname);
        System.out.println("Pay Period: " + aStartDate + " - " + aEndDate);
        System.out.println("Gross Income: " + grossIncome);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Net Income: " + netIncome);
        System.out.println("Super: " + mySuper);
        System.out.println("Thank you for using MYOB!");
    }

    private static int calcGrossIncome(int aSalary)
    {
        return (aSalary/12);
    }

    private static int calcIncomeTax(int aSalary)
    {
        if (aSalary <= 18200)
            return 0;
        if (aSalary >= 18201 && aSalary <= 37000)
            return (int) ( ((aSalary - 18200) * .19) / 12 );
        if (aSalary >= 37001 && aSalary <= 87000)
            return (int) ( (3572 + (aSalary - 37000) * .325) /12 );
        if (aSalary >= 87001 && aSalary <= 180000)
            return (int) ( (19882 + (aSalary - 87000) * .37) /12 );
        if (aSalary > 180001)
            return (int) ( (54232 + (aSalary - 180000) * .45) /12 );
        else
            return 0;
    }

    private static int calcNetIncome(int aGross, int aTax)
    {
        return ( aGross - aTax );
    }

    private static int calcSuper(int aGross, int aSuper)
    {
        return ( (aGross * (aSuper) /100) );
    }
}
