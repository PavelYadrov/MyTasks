package com.exersices.ex6;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(double price, double discount) {
        super(price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (obj.getClass() == Item.class) {
           return super.equals(obj);
        }
        if (obj instanceof DiscountedItem){
            DiscountedItem ds = (DiscountedItem) obj;
            return super.equals(obj) && Double.compare(this.discount,ds.discount)==0;
        }

        return false;
    }
}
