package Task;

class Teacher {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Teacher(int employeeId, String firstName, String lastName, String gender, int age) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String toCSV() {
        return "teacher," + employeeId + "," + firstName + "," + lastName + "," + gender + "," + age;
    }
}