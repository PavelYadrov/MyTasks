package com.exersices.ex6;

public class Item {
    protected double price;

    public Item(double price) {
        this.price = price;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item item = (Item) obj;

        return Double.compare(this.price,item.price)==0;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        return Double.compare(item.price, price) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(price);
        return (int) (temp ^ (temp >>> 32));
    }
}


