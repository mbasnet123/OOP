package com.manishcodes.MusicalInstruments;

public class InstrumentToSell extends Instrument{
    private double price;
    private String sellDate;
    private double discountPercent;
    private boolean isSold;

    public InstrumentToSell(String InstrumentName, double price){
        super(InstrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    public double getPrice(){
        return price;
    }

    public String getSellDate(){
        return sellDate;
    }

    public double getDiscountPercent(){
        return discountPercent;
    }

    public boolean getIsSold(){
        return isSold;
    }

    public void setPrice(double price){
        if(isSold == false) {
            this.price = price;
        }
        else{
            System.out.println("The instrument already sold. Cannot assign " +
                    "new value");
        }
    }

    public void setSellDate(String sellDate){
        this.sellDate = sellDate;
    }

    public void setDiscountPercent(double discountPercent){
        this.discountPercent = discountPercent;
    }

    public void setIsSold(boolean isSold){
        this.isSold = isSold;
    }

    public void sellInstruments(String customerName, String customerMobile,
                                int panNo, String sellDate, double discountPercent ){
        if(isSold==true){
            System.out.println("The customer name is " + super.getCustomerName());
            System.out.println("The customer mobile is " + super.customerMobile);
            System.out.println("The return date is " + dateOfReturn);
        }
    }
}
