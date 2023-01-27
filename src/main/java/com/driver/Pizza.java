package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int toppings;

    boolean isExtracheeseAdded;
    boolean isExtratoppingsAdded;
    boolean isTakeawayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtracheeseAdded=false;
        this.isExtratoppingsAdded=false;
        this.isTakeawayAdded=false;
        this.isBillGenerated=false;
        this.bill="";
        // your code goes here
        if(isVeg)
        {
            this.price=300;
            this.toppings=70;
        }
        else {
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";


    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtracheeseAdded)
        {
            this.price=this.price+cheese;
            isExtracheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtratoppingsAdded)
        {
            this.price = this.price + toppings;
            isExtratoppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded)
        {
            this.price=this.price+20;
            isTakeawayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated)
        {
            if(isExtracheeseAdded)
            {
                this.bill+="Extra Cheese Added: "+ this.cheese+"\n";
                isExtracheeseAdded=true;
            }
            if(isExtratoppingsAdded)
            {
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            }
            if(isTakeawayAdded)
            {
                this.bill += "Paperbag Added: "+"20"+"\n";
            }

            this.bill +="Total Price: "+this.price + "\n";

        }
        return this.bill;
    }
}
