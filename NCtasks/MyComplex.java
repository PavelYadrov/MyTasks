package com.tasks.pavelyadrov;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double real,double imag) {
        this.imag=imag;
        this.real=real;
    }

    @Override
    public String toString() {
        if (imag<0) return "\"(real+imagi)\", e.g., \"("+real+""+imag+"i)\"";
        return "\"(real+imagi)\", e.g., \"("+real+"+"+imag+"i)\"";
    }
    public boolean isReal(){
        return (this.real!=0);
    }
    public boolean isImaginary(){
        return (this.imag!=0);
    }

    public boolean equals(double real,double imag) {
        return (Double.compare(this.real,real)==0 && Double.compare(this.imag,imag)==0);
    }
    public boolean equals(MyComplex another){
        return (Double.compare(another.getReal(),real)==0 && Double.compare(another.getImag(),imag)==0);
    }
    public double magnitude(){
        return Math.sqrt(real*real+imag*imag);
    }
    public double argument(){
        return Math.atan(imag/real);
    }
    public MyComplex add(MyComplex right){
        real+=right.getReal();
        imag+=right.getImag();
        return this;
    }
    public MyComplex subtract(MyComplex right){
        real-=right.getReal();
        imag-=right.getImag();
        return this;
    }
    public MyComplex multiply(MyComplex right){
        double first = (real*right.getReal()-imag*right.getImag());
        double second = (real*right.getImag()+imag*right.getReal());
        real=first;
        imag=second;
        return this;
    }
    public MyComplex divide(MyComplex right){
        double first = ((real*right.getReal()+imag*right.getImag())/(Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2)));
        double second = ((right.getReal()*imag-real*right.getImag())/(Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2)));
        real = first;
        imag = second;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        double first = real+right.getReal();
        double second = imag+right.getImag();
        return new MyComplex(first,second);
    }
    public MyComplex subtractNew(MyComplex right){
        double first = real-right.getReal();
        double second = imag-right.getImag();
        return new MyComplex(first,second);
    }
    public MyComplex conjugate(){
        return new MyComplex(real,-imag);
    }
}
