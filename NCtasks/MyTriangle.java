package com.tasks.pavelyadrov;

import java.util.Arrays;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);

    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + Arrays.toString(v1.getXY()) + ", v2=" + Arrays.toString(v2.getXY()) + ", v3=" + Arrays.toString(v3.getXY()) + '}';
    }

    public double getPerimeter() {
        double firstSide = v1.distance(v2);
        double secondSide = v2.distance(v3);
        double thirdSide = v3.distance(v1);
        return firstSide + secondSide + thirdSide;
    }
    public String getType(){
        String type = null;
        double firstSide = v1.distance(v2);
        double secondSide = v2.distance(v3);
        double thirdSide = v3.distance(v1);
        if (firstSide==secondSide && secondSide==thirdSide) {
            type = "Equilateral";
        }
        else if (firstSide==secondSide || secondSide==thirdSide || thirdSide==firstSide) {
            type = "Isosceles";
        }
        else type = "Scalene";
        return type;
    }
    //Check of the 3rd sign of quality of triangles
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyTriangle that = (MyTriangle) o;
        if (this.getType()!=that.getType()) return false;
        boolean answer = false;
        double[] firstTriangle= new double[]{v1.distance(v2),v2.distance(v3),v3.distance(v1)};
        double[] secondTriangle= new double[]{that.v1.distance(that.v2),that.v2.distance(that.v3),that.v3.distance(that.v1)};
        int count =0;
        for (int k = 0; k < 3; k++) {
            for (int j=0;j<firstTriangle.length;j++) {
                if (secondTriangle[k]==firstTriangle[j]) {
                    firstTriangle[j]=0.0;
                    count++;
                    break;
                }
            }
            if (count==3) answer=true;
        }

        return answer;
    }

    @Override
    public int hashCode() {
        int result = v1 != null ? v1.hashCode() : 0;
        result = 31 * result + (v2 != null ? v2.hashCode() : 0);
        result = 31 * result + (v3 != null ? v3.hashCode() : 0);
        return result;
    }
}
