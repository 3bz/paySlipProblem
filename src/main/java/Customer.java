import java.util.Scanner;

public class Customer {
    private String name;
    private String surname;
    private int salary;
    private int superRate;
    private String startDate;
    private String endDate;
    private int grossIncome;
    private int incomeTax;
    private int netIncome;
    private int mySuper;


    public Customer()
    {
    }

    public void initCustomer()
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please input your name: ");
        setName(scn.nextLine());
        System.out.println("Please input your surname: ");
        setSurname(scn.nextLine());
        System.out.println("Please enter your annual salary: ");
        setSalary(Integer.parseInt(scn.nextLine()));
        System.out.println("Please enter your super rate: ");
        setSuperRate(Integer.parseInt(scn.nextLine()));
        System.out.println("Please enter your payment start date: ");
        setStartDate(scn.nextLine());
        System.out.println("Please enter your payment end date: ");
        setEndDate(scn.nextLine());
    }

    //GET
    public String getName() { return name; }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public int getSuperRate() {
        return superRate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getMySuper() {
        return mySuper;
    }

    public int getNetIncome() {
        return netIncome;
    }

    public int getGrossIncome() {
        return grossIncome;
    }

    public int getIncomeTax() {
        return incomeTax;
    }

    //SET
    public void setName(String name) { this.name = name; }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSuperRate(int superRate) {
        this.superRate = superRate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setMySuper(int mySuper) {
        this.mySuper = mySuper;
    }

    public void setNetIncome(int netIncome) {
        this.netIncome = netIncome;
    }

    public void setGrossIncome(int grossIncome) { this.grossIncome = grossIncome;
    }
    public void setIncomeTax(int incomeTax) {
        this.incomeTax = incomeTax;
    }

}
