package com.task9.pavelyadrov;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x+width;
        this.y2 = y+height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2-x1);
    }

    public int getHeight() {
        return Math.abs(y2-y1);
    }

    @Override
    public String toString() {
        return "\"Container[("+x1+","+y1+"),("+x2+","+y2+")]\"";
    }
    public boolean collidesWidth(Ball ball){
        boolean collidesWidth=false;
        boolean collidesHeight=false;
         if (((ball.getY()+ball.getRadius())<y2)&&((ball.getY()-ball.getRadius())>y1)) collidesWidth=true;
         if (((ball.getX()+ball.getRadius())<x2)&&((ball.getX()-ball.getRadius())>x1)) collidesHeight=true;
         return collidesWidth&&collidesHeight;
    }
    //Compare containers by area omitting their position
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Container container = (Container) o;

        return Double.compare(this.getHeight()*this.getWidth(), container.getHeight()*container.getWidth())==0;
    }

    @Override
    public int hashCode() {
        int result = x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }
}
