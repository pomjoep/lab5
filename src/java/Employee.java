/*
 * Employee.java - Abstract
 * This is the superclass of all workers in this company.
 * All employees must have a name and social security number.
 */

// Notice the abstract keyword? That prevents us from making objects of this type!
public abstract class Employee {
    private String name;
    private int social;

    public Employee() {
    }

    public Employee(String name, int social) {
        this.name = name;
        this.social = social;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public abstract double calculateWeeklyPay();
}
/**
 *      Answer to question 1:
 *      Polymorphic methods in the Employee hierarchy include calculateWeeklyPay, toString, and possibly equals.
 *
 *      Answer to question 2:
 *      We could build a method like getRandShape for use with Employees by creating a static method in a separate class
 *      that randomly selects and returns an instance of a subclass of Employee. This method would use polymorphism to
 *      determine the type of Employee object to return.
 *
 *      Answer to question 3:
 *      If we built a getRandomEmployee method that returns various Employee subclass objects, late binding could be
 *      demonstrated as follows:
 *
 *
 *     public static Employee getRandomEmployee() {
 *         // Randomly choose an Employee subclass
 *         int randomNum = new Random().nextInt(3); // Assuming 3 subclasses: HourlyWorker, SalariedWorker, and Consultant
 *         switch(randomNum) {
 *             case 0:
 *                 return new HourlyWorker("John", 10.00);
 *             case 1:
 *                 return new SalariedWorker("Alice", 2000.00);
 *             case 2:
 *                 return new Consultant("Mike");
 *             default:
 *                 return null;
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         Employee employee = getRandomEmployee();
 *         // Late binding will occur here, as the method to be invoked depends on the actual type of the object
 *         employee.calculateWeeklyPay(); // Calls the calculateWeeklyPay method of the specific subclass
 *     }
 */