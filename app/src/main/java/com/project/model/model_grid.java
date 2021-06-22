package com.project.model;

public class model_grid {

    private String loaction;
    private String amount;


    public model_grid(String loaction, String amount) {
        this.loaction = loaction;
        this.amount = amount;
    }

    public String getLoaction() {
        return loaction;
    }

    public void setLoaction(String loaction) {
        this.loaction = loaction;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
