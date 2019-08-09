import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    Customer myCustomer = new Customer();

    @Test
    public void testCalculatePayslip()
    {
        myCustomer.setSalary("60050");
        myCustomer.setSuperRate("9");
        Calculator myCalc = new Calculator(myCustomer);

        myCalc.calculatePayslip();
        Customer testCustomer = myCalc.getMyCustomer();

        Assert.assertEquals(testCustomer.getGrossIncome(), 5004 );
        Assert.assertEquals(testCustomer.getIncomeTax(), 922);
        Assert.assertEquals(testCustomer.getNetIncome(), 4082);
        Assert.assertEquals(testCustomer.getMySuper(), 450);
    }

    @Test
    public void testCalcGrossIncome()
    {
        String sample = String.valueOf(12);

        myCustomer.setSalary(sample);
        Calculator myCalc = new Calculator(myCustomer);

        myCalc.calculatePayslip();

        Assert.assertEquals(1, myCustomer.getGrossIncome());
    }

    @Test
    public void calcIncomeTax()
    {
        //BOUNDARY TESTING
        Calculator myCalc = new Calculator(myCustomer);
        Customer testCustomer = myCalc.getMyCustomer();

        myCustomer.setSalary("18000");
        myCalc.calculatePayslip();
        Assert.assertEquals(0, testCustomer.getIncomeTax());

        myCustomer.setSalary("18280");      //(80 * .19) /12 = ~1.2 (rounded down)
        myCalc.calculatePayslip();
        Assert.assertEquals(1, testCustomer.getIncomeTax());

        myCustomer.setSalary("37001");
        myCalc.calculatePayslip();
        Assert.assertEquals(298, testCustomer.getIncomeTax());

        myCustomer.setSalary("87001");
        myCalc.calculatePayslip();
        Assert.assertEquals(1652, testCustomer.getIncomeTax());

        myCustomer.setSalary("180001");
        myCalc.calculatePayslip();
        Assert.assertEquals(4519, testCustomer.getIncomeTax());
    }
}