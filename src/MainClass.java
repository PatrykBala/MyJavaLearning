public class MainClass {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Patryk Bala", 75000, 1989, 12, 23);
        staff[1] = new Employee("Jan Kowalski", 50000, 1975, 10, 12);
        staff[2] = new Employee("Anna Kowalska", 40000, 1990, 3, 15);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHirreDay());
    }
}