import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        init();
    }

    private static void init()
    {
        Scanner scn = new Scanner(System.in);
        Customer myCustomer = new Customer();

        System.out.println("Welcome to the payslip generator!\n");
        System.out.println("Please input your name: ");
        do {
            if (myCustomer.setName(scn.nextLine()))
                break;
        } while( !(myCustomer.setName(scn.nextLine())) );

        System.out.println("Please input your surname: ");
        do {
            if (myCustomer.setSurname(scn.nextLine()))
                break;
        }
        while ( !(myCustomer.setSurname(scn.nextLine())) );

        System.out.println("Please enter your annual salary: ");
        do {
            if ( myCustomer.setSalary(scn.nextLine()) )
                break;
        } while ( !(myCustomer.setSalary(scn.nextLine())) );

        System.out.println("Please enter your super rate: ");
        do {
            if (myCustomer.setSuperRate(scn.nextLine()) )
                break;
        }
        while( !(myCustomer.setSuperRate(scn.nextLine())) );

        System.out.println("Please enter your payment start date: ");
        do {
            if ( myCustomer.setStartDate(scn.nextLine()) )
                break;
        } while ( !(myCustomer.setStartDate(scn.nextLine())) );

        System.out.println("Please enter your payment end date: ");
        do {
            if ( myCustomer.setEndDate(scn.nextLine()) )
                break;
        } while ( !(myCustomer.setEndDate(scn.nextLine())) );

        Calculator myCalc = new Calculator(myCustomer);
        myCalc.calculatePayslip();
        Payslip myPayslip = new Payslip(myCustomer);
        myPayslip.printSlip();
    }
}
