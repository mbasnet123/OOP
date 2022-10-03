//package com.manishcodes.MusicalInstruments;
//
//
//public class InstrumentToRent extends Instrument{
//    private double chargePerDay;
//    private String dateOfRent;
//    private String dateOfReturn;
//    private int noOfDays;
//    private boolean isRented;
//
//    public InstrumentToRent(String instrumentName, double chargePerDay) {
//        super(instrumentName);
//        this.chargePerDay = chargePerDay;
//        this.dateOfRent = "";
//        this.dateOfReturn = "";
//        this.noOfDays = 0;
//        this.isRented = false;
//    }
//
//    public double getChargePerDay() {
//        return chargePerDay;
//    }
//
//    public void setChargePerDay(double chargePerDay) {
//        this.chargePerDay = chargePerDay;
//    }
//
//    public String getDateOfRent() {
//        return dateOfRent;
//    }
//
//    public void setDateOfRent(String dateOfRent) {
//        this.dateOfRent = dateOfRent;
//    }
//
//    public String getDateOfReturn() {
//        return dateOfReturn;
//    }
//
//    public void setDateOfReturn(String dateOfReturn) {
//        this.dateOfReturn = dateOfReturn;
//    }
//
//    public int getNoOfDays() {
//        return noOfDays;
//    }
//
//    public void setNoOfDays(int noOfDays) {
//        this.noOfDays = noOfDays;
//    }
//
//    public boolean getIsRented() {
//        return isRented;
//    }
//
//    public void setIsRented(boolean isRented) {
//        this.isRented = isRented;
//    }
//
//    public void rentToCustomer(String customerName, String customerMobile,
//                               String dateOfRent, String dateOfReturn, int noOfDays) {
//        if (isRented == true) {
//            System.out.println("The customer name is " + super.getCustomerName());
//            System.out.println("The customer mobile is " + super.customerMobile);
//            System.out.println("The return date is " + dateOfReturn);
//        } else {
//            super.setCustomerName(customerName);
//            super.setCustomerMobile(CustomerMobile);
//            super.setPanNo(panNo);
//        }
//        this.dateOfRent = dateOfRent;
//        this.dateOfReturn = dateOfReturn;
//        this.noOfDays = noOfDays;
//        this.isRented = true;
//        if(isRented = true){
//            System.out.println("The date of return  is "+dateOfReturn);
//            System.out.println("The date of renting is "+dateOfRent);
//            System.out.println("The no of days "+ noOfDays);
//            double totalCharge = noOfDays * chargePerDay;
//            System.out.println("The total charge is "+totalCharge);
//        }
//    }
//    public void returnInstruments(){
//        if(isRented == false){
//            System.out.println("The instrument is available");
//        }
//        else{
//            super.setCustomerName("");
//            super.setCustomerMobile("");
//            super.setPanNo(0);
//            super.setDateOfRent("");
//            super.setDateOfReturn("");
//            super.setNoOfDays(0);
//            this.isRented = false;
//        }
//    }
//
//    public void display(){
//        super.display();
//
//    }
//}
