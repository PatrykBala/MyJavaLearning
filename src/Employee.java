import java.util.*;

public class Employee {
    public Employee(String n, double s, int year, int month, int day1)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month -1, day1);
        hirreDay = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHirreDay()
    {
        return hirreDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary *byPercent / 100;
        salary += raise;
    }

    private String name;
    private double salary;
    private Date hirreDay;
}
