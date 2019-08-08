public class Payslip {
    private static Customer myCustomer;

    public Payslip(Customer aCustomer)
    {
        myCustomer = aCustomer;
    }

    public static void printSlip()
    {
        System.out.println("Your payslip has been generated:\n");
        System.out.println("Name: " + myCustomer.getName() + " " + myCustomer.getSurname());
        System.out.println("Pay Period: " + myCustomer.getStartDate() + " - " + myCustomer.getEndDate());
        System.out.println("Gross Income: " + myCustomer.getGrossIncome());
        System.out.println("Income Tax: " + myCustomer.getIncomeTax());
        System.out.println("Net Income: " + myCustomer.getNetIncome());
        System.out.println("Super: " + myCustomer.getMySuper());
        System.out.println("Thank you for using MYOB!");
    }
}
