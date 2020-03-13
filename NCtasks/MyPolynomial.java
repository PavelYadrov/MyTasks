package com.tasks.pavelyadrov;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\"");
        int n=coeffs.length-1;
        for(int i=0;i<coeffs.length-1;i++){
            stringBuilder.append(coeffs[n]).append("x^").append(n).append("+");
            n--;
        }
        stringBuilder.append(coeffs[0]);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }
    public int getDegree(){
        return coeffs.length-1;
    }
    public double evaluate(double x){
        double result=0.0;
        int degree=0;
        for (double coef:coeffs) {
            result+=coef*Math.pow(x,degree);
            degree++;
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right) {
        double[] newCoeffs;
        if (coeffs.length >= right.coeffs.length) {
            newCoeffs = new double[coeffs.length];
            int count=0;
            for (int i = 0; i < right.coeffs.length; i++) {
                newCoeffs[i] = coeffs[i] + right.coeffs[i];
                count++;
            }
            int label = count;
            for (int i = 0; i <coeffs.length-label ; i++) {
                newCoeffs[count]=coeffs[count];
                count++;
            }
        }

        else {
            newCoeffs = new double[right.coeffs.length];
            int count=0;
            for (int i = 0; i < coeffs.length; i++) {
                newCoeffs[i] = coeffs[i] + right.coeffs[i];
                count++;
            }
            int label = count;
            for (int i = 0; i <right.coeffs.length-label ; i++) {
                newCoeffs[count]=right.coeffs[count];
                count++;
            }
        }
        return new MyPolynomial(newCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right){
        double[] newCoeffs = new double[coeffs.length+right.coeffs.length-1];
        for (int i = 0; i <coeffs.length ; i++) {
            for (int j = 0; j <right.coeffs.length ; j++) {
                newCoeffs[i+j]+=coeffs[i]*right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPolynomial that = (MyPolynomial) o;

        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }

}
