package com.manishcodes.developer;

public class JuniorDeveloper extends Developer {
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;

    public JuniorDeveloper(String platform, String interviewerName, int workingHours,
                           double Salary, String appointedBy, String terminationDate) {
        super(platform, interviewerName, workingHours);
        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        this.appointedDate = "";
        this.evaluationPeriod = "";
        this.specialization = "";
        this.joined = false;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (joined == false) {
            this.salary = salary;
        } else {
            System.out.println("Developer already appointed, so can't change the salary");
        }
    }

    public String getAppointedDate() {
        return appointedDate;
    }

    public String getEvaluationPeriod() {
        return evaluationPeriod;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public boolean getJoined() {
        return joined;
    }

    public void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization){
        if(joined==false){
            super.getDeveloperName(developerName);
            this.joined = true;
        }
        else{
            System.out.println("The developer appointed on"+appointedDate);
        }
    }
    public void displayDetails(){
        super.display();
        if(joined==true){
            System.out.println("The appointed date is "+appointedDate);
            System.out.println("The developer name is "+super.getDeveloperName());
            System.out.println("The evaluation period is "+evaluationPeriod);
            System.out.println("The termination date is "+ terminationDate);
            System.out.println("The developer salary is "+salary);
            System.out.println("The specialization is "+specialization);
            System.out.println("The developer is appointed by "+appointedBy);
        }
    }

}
