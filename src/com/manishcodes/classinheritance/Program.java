package com.manishcodes.classinheritance;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Aasis Poudel", 24, "Tikathali", "CEO");
        employee.display();


        Student student = new Student("Manish Basnet", 22, "Bhaktapur", "2nd year", "BCA");
        student.display();
    }
}
