
public class Program {
    public static void main(String[] args) {
        init();
    }

    private static void init()
    {
        Customer myCustomer = new Customer();

        System.out.println("Welcome to the payslip generator!\n");
        myCustomer.initCustomer();
        //Calculator myCalc = new Calculator(myCustomer);
        //myCalc.calculatePayslip();
        Calculator.calculatePayslip(myCustomer);
        Payslip.printSlip(myCustomer);
    }
}
