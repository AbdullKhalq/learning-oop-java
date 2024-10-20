public class Employee {
    private int ID;
    private String name, email, phoneNumber, address;
    private char gender;
    private double salary;

    public Employee() {
    }

    public Employee(int iD, String name, String email, 
                    String phoneNumber, String address,
                    char gender, double salary) {
        this.ID = iD;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        this.ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayAllInformation() {
        System.out.printf("ID: %d\nName: %s\nGender: %s\n"      + 
                          "Email: %s\nPhone: %s\nAddress: %s\n"   +
                          "Salary: %f\n", 
        getID(), getName(), getGender(), 
        getEmail(), getPhoneNumber(), getAddress(), 
        getSalary());
    }
    
}
