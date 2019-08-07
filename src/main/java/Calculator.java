public class Calculator {
    static final int MONTHS = 12;

    private Customer myCustomer;

    public Calculator(Customer aCustomer)
    {
        myCustomer = aCustomer;
    }

    public static void calculatePayslip(Customer myCustomer) {
        myCustomer.setGrossIncome(calcGrossIncome(myCustomer.getSalary()));
        myCustomer.setIncomeTax(calcIncomeTax(myCustomer.getSalary()));
        myCustomer.setNetIncome(calcNetIncome(myCustomer.getGrossIncome(), myCustomer.getIncomeTax()));
        myCustomer.setMySuper(calcSuper(myCustomer.getGrossIncome(), myCustomer.getSuperRate()));
    }

    private static int calcGrossIncome(int aSalary)
    {
        return (aSalary/MONTHS);
    }

    private static int calcIncomeTax(int aSalary)
    {
        if (aSalary <= 18200)
            return 0;
        if (aSalary >= 18201 && aSalary <= 37000)
            return (int) ( ((aSalary - 18200) * .19) / MONTHS );
        if (aSalary >= 37001 && aSalary <= 87000)
            return (int) ( (3572 + (aSalary - 37000) * .325) /MONTHS );
        if (aSalary >= 87001 && aSalary <= 180000)
            return (int) ( (19882 + (aSalary - 87000) * .37) /MONTHS );
        if (aSalary > 180001)
            return (int) ( (54232 + (aSalary - 180000) * .45) /MONTHS );
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
