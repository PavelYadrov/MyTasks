package com.task9.pavelyadrov;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius,int speed,int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta=(float) (speed*Math.cos(direction*Math.PI/180));
        yDelta=(float) (-speed*Math.sin(direction*Math.PI/180));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;
    }
    public void reflectHorizontal(){
        xDelta=-xDelta;
    }
    public void reflectVertical(){
        yDelta=-yDelta;
    }

    @Override
    public String toString() {
        return "\"Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]\"";
    }

    //I decided to compare balls like real objects
    //so it means that I only compare their areas omitting their position in space and movement
    //I think from a physical point of view, this is the most accurate comparison of two objects

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;
        return Double.compare(radius*Math.PI,ball.radius*Math.PI)==0 ;
    }

    @Override
    public int hashCode() {
        int result = (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31 * result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        result = 31 * result + (xDelta != +0.0f ? Float.floatToIntBits(xDelta) : 0);
        result = 31 * result + (yDelta != +0.0f ? Float.floatToIntBits(yDelta) : 0);
        result = 31 * result + radius;
        return result;
    }
}
