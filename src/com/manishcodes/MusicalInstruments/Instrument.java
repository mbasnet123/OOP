package com.manishcodes.MusicalInstruments;

public class Instrument {
    private int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customerMobile;
    private int panNo;

    public Instrument(String instrumentName) {
        this.instrumentID = 0;
        this.customerName = "";
        this.customerMobile = "";
        this.panNo = 0;
    }

    public int getInstrumentID() {
        return instrumentID;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMoblie() {
        return customerMobile;
    }

    public int getPanNo() {
        return panNo;
    }

    public void setInstrumentID(int instrumentID) {
        this.instrumentID = instrumentID;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public void setPanNo(int panNo) {
        this.panNo = panNo;
    }


    public void display() {
        System.out.println("The ID of the instrument is " + instrumentID);
        System.out.println("The name of the instrument is " + instrumentName);
        if (customerName != "" && customerMobile != "" && panNo != 0) {
            System.out.println("The name of the customer is " + customerName);
            System.out.println("The mobile of the customer is " + customerMobile);
            System.out.println("The pan no of the customer is " + panNo);
        }
    }
}
