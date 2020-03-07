package com.tasks.pavelyadrov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //control check for the Circle class
            System.out.println("Circle class");
            Circle circle1 = new Circle();
            Circle circle2 = new Circle(3);
            Circle circle3 = new Circle(10,"blue");
            System.out.println("Area = "+circle1.getArea()+ "  "+circle1.toString());
            System.out.println("Area = "+circle2.getArea()+ "  "+circle2.toString());
            System.out.println("Area = "+circle3.getArea()+ "  "+circle3.toString());

        //control check for the Rectangle class
            System.out.println("Rectangle class");
            Rectangle rectangle1 = new Rectangle();
            Rectangle rectangle2 = new Rectangle(3,4);
            System.out.println("Area= "+ rectangle1.getArea()+" Perimeter = "+rectangle1.getPerimeter()+" "+rectangle1.toString());
            System.out.println("Area= "+ rectangle2.getArea()+" Perimeter = "+rectangle2.getPerimeter()+" "+rectangle2.toString());

        //control check for the Employee class
            System.out.println("Employee class");
            Employee employee = new Employee(3,"Alexander","White",100000);
            employee.setSalary(140000);
            System.out.println(employee.getName()+" salary ="+employee.getSalary()+" AnnualSalary= "+employee.getAnnualSalary()+" RaisedSalary= " +employee.raiseSalary(15));
            System.out.println(employee);

        //control check for the Book class
            System.out.println("Book class");
            Book book1 = new Book("Odyssey",new Author[]{new Author("Homer"),new Author("Homer's Brother (for example)")},1313,32);
            System.out.println(book1);
            System.out.println(book1.getAuthorsName());
            System.out.println(Arrays.toString(book1.getAuthors())); //check for authors
            System.out.println(book1.getAuthors()[0]);
            System.out.println(book1.getAuthors()[1]);

        //control check for the MyPoint class
            System.out.println("MyPoint class");
            MyPoint myPoint1 = new MyPoint(3,4);
            MyPoint myPoint2 = new MyPoint(2,2);
            System.out.println(Arrays.toString(myPoint1.getXY()));
            System.out.println(myPoint1.distance(6,6));
            System.out.println(myPoint1.distance(myPoint2));
            System.out.println(myPoint1.distance());
            myPoint1.setXY(2,2);
            System.out.println(myPoint1.distance(myPoint2));

        //control check for the MyTriangle class
            System.out.println("MyTriangle class");
            MyTriangle myTriangle1 = new MyTriangle(-1,0,1,0,0,2);
            System.out.println(myTriangle1);
            System.out.println(myTriangle1.getPerimeter());
            System.out.println(myTriangle1.getType());

        //control check for the MyComplex class
            System.out.println("MyComplex class");
            MyComplex myComplex1 = new MyComplex(2,4);
            MyComplex myComplex2 = new MyComplex(-2,-4);
            System.out.println(myComplex1);
            System.out.println(myComplex2);
            System.out.println(myComplex1.isReal());
            System.out.println(myComplex1.equals(-3,4));
            System.out.println(myComplex1.equals(myComplex2));
            System.out.println(myComplex1.magnitude());
            System.out.println(myComplex1.argument());
            System.out.println("complex1 + complex2= "+myComplex1.add(myComplex2));
            System.out.println("complex1 + complex2= "+myComplex1.subtract(myComplex2));
            System.out.println("complex1 * complex2= "+myComplex1.multiply(myComplex2));
            System.out.println("complex1 / complex2= "+myComplex1.divide(myComplex2));
            System.out.println("addNew with complex1: new complex ="+myComplex1.addNew(myComplex2)+"   complex1="+myComplex1);
            System.out.println("subtractNew with complex1: new complex ="+myComplex1.subtractNew(myComplex2)+"   complex1="+myComplex1);
            System.out.println("conjugate ="+myComplex1.conjugate()+"   complex1="+myComplex1);

        //control check for the MyPolynomial class
            System.out.println("MyPolynomial class");
            MyPolynomial myPolynomial1 = new MyPolynomial(new double[]{2.2,3.3,4,5});
            MyPolynomial myPolynomial2 = new MyPolynomial(new double[]{2,3,4.4,5.5});
            MyPolynomial myPolynomial3 = new MyPolynomial(new double[]{2,3,4.4,5.5,4,3,2});
            MyPolynomial myPolynomial4 = new MyPolynomial(new double[]{2,3});
            System.out.println("polynomial degree " +myPolynomial1.getDegree());
            System.out.println("my polynomial1 = "+myPolynomial1);
            System.out.println("my polynomial2 = "+myPolynomial2);
            System.out.println(myPolynomial1.evaluate(4));
            System.out.println("equal degree = " + myPolynomial1.add(myPolynomial2));
            System.out.println("1st bigger than 2nd  (P3+P1) = " + myPolynomial3.add(myPolynomial1));
            System.out.println("2nd bigger than 1st (P1+P4) = " + myPolynomial1.add(myPolynomial4));
            System.out.println("multiply P1 with P4 = "+myPolynomial1.multiply(myPolynomial4));

        //control check for the Ball class
            System.out.println("Ball class");
            Ball ball = new Ball(4, 3, 2, 15, 30);
            System.out.println(ball);
            Container container = new Container(0, 0, 30, 30);
            System.out.println(container);
            System.out.println("checking if there's the ball inside ");
            if (container.collidesWidth(ball)) {
                System.out.println("it's inside. Now let's move it");
                ball.move();
            }
            else System.out.println("there's no ball inside :(");
            System.out.println("let's check again if the ball still inside");
            if (container.collidesWidth(ball)) {
                System.out.println("still inside. Ok, just move it again");
                ball.move();
            }
            else {
                System.out.println("seems like it flew out so we need to use reflection");
                if (((ball.getX()+ball.getRadius())>container.getX()+container.getWidth())&&(((ball.getX()-ball.getRadius())>container.getX()))) ball.reflectHorizontal();
                if (((ball.getY()+ball.getRadius())>container.getY()+container.getHeight())&&(((ball.getY()-ball.getRadius())<container.getY()))) ball.reflectVertical();
            }
            System.out.println("well, it's not so useful description of moving Ball cuz we can't properly spot the moment when we have to use reflection. idk what to do...");
    }
}
