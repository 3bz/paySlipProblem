import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {
    private String name;
    private String surname;
    private int salary;
    private double superRate;
    private String startDate;
    private String endDate;
    private int grossIncome;
    private int incomeTax;
    private int netIncome;
    private int mySuper;

    private static Scanner scn = new Scanner(System.in);

    public Customer()
    {
    }

    public void initCustomer()
    {
        System.out.println("Please input your name: ");
        setName(scn.nextLine());
        System.out.println("Please input your surname: ");
        setSurname(scn.nextLine());
        System.out.println("Please enter your annual salary: ");
        setSalary(scn.nextLine());
        System.out.println("Please enter your super rate: ");
        setSuperRate(scn.nextLine());
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

    public double getSuperRate() {
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
    public void setName(String name) {
        if ( !(Pattern.matches("[a-zA-Z]+", name)) ) {
            System.out.println("Please enter a valid name, containing only alphabetic characters: ");
            setName((scn.nextLine()));
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        if ( !(Pattern.matches("[a-zA-Z]+", surname)) ) {
            System.out.println("Please enter a valid surname, containing only alphabetic characters: ");
            setName((scn.nextLine()));
        }
        this.surname = surname;
    }

    public void setSalary(String salary) {
        try {
            this.salary = Integer.parseInt(salary);
        }
        catch (Exception e)
        {
            System.out.println("Please input a valid salary figure: ");
            setSalary((scn.nextLine()));
        }
    }

    public void setSuperRate(String superRate) {
        try {
            double result = Double.parseDouble(superRate);
            this.superRate = result;
        }
        catch (Exception e)
        {
            System.out.println("Please input a valid super rate: ");
            setSuperRate( (scn.nextLine()) );
        }
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