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

    public Customer()
    {
    }

    //GET
    public String getName() { return name; }
    public String getSurname() {
        return surname;
    }
    public int getSalary() {
        return salary;
    }
    public double getSuperRate() { return superRate; }
    public String getStartDate() {
        return startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public int getMySuper() { return mySuper; }
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
    public boolean setName(String name) {
        if ( !(Pattern.matches("[a-zA-Z]+", name)) ) {
            System.out.println("Please enter a valid name, containing only alphabetic characters: ");
            return false;
        }
        this.name = name;
        return true;
    }

    public boolean setSurname(String surname) {
        if ( !(Pattern.matches("[a-zA-Z]+", surname)) ) {
            System.out.println("Please enter a valid surname, containing only alphabetic characters: ");
            return false;
        }
        this.surname = surname;
        return true;
    }

    public boolean setSalary(String salary) {
        try {
            this.salary = Integer.parseInt(salary);
        }
        catch (Exception e)
        {
            System.out.println("Please input a valid salary figure: ");
            return false;
        }
        return true;
    }

    public boolean setSuperRate(String superRate) {
        try {
            double result = Double.parseDouble(superRate);
            this.superRate = result;
        }
        catch (Exception e)
        {
            System.out.println("Please input a valid super rate: ");
            return false;
        }
        return true;
    }

    public boolean setStartDate(String startDate) {
        if ( !(checkValidDate(startDate)) )
            return false;
        else {
            this.startDate = startDate;
            return true;
        }
    }

    public boolean setEndDate(String endDate) {
        if ( !(checkValidDate(endDate)) )
            return false;
        else {
            this.endDate = endDate;
            return true;
        }
    }

    private boolean checkValidDate(String aDate) {
        boolean haveMatch = false;
        String[] splitDayAndMonth = aDate.split("\\s");
        if ( !(Pattern.matches("[ \t]+", aDate)) && splitDayAndMonth.length == 2
                && Pattern.matches("^[1-3]?[0-9]$", (splitDayAndMonth[0])) )
        {
            for (monthsInYear m : monthsInYear.values()) {
                if (Pattern.matches(String.valueOf(m), splitDayAndMonth[1].toUpperCase()))
                    haveMatch = true;
            }
        }
        if (!haveMatch)
            System.out.println("Please enter a valid date, format '(x)x Month': ");

        return haveMatch;
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