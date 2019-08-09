import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    Customer myCustomer = new Customer();

    @Test
    public void testAllSettersFail()
    {
        Assert.assertEquals(myCustomer.setName("123"), false);
        Assert.assertEquals(myCustomer.setSurname("456"), false);
        Assert.assertEquals(myCustomer.setSalary("ABC"), false);
        Assert.assertEquals(myCustomer.setSuperRate("DEF"), false);
        Assert.assertEquals(myCustomer.setStartDate("a May"), false);
        Assert.assertEquals(myCustomer.setEndDate("1 Joon"), false);
    }
}
