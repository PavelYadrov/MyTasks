package com.tasks.pavelyadrov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //control tests for the Circle class
            System.out.println("Circle");
            Circle circle1 = new Circle();
            Circle circle2 = new Circle(3);
            Circle circle3 = new Circle(10,"blue");
            System.out.println("Area = "+circle1.getArea()+ "  "+circle1.toString());
            System.out.println("Area = "+circle2.getArea()+ "  "+circle2.toString());
            System.out.println("Area = "+circle3.getArea()+ "  "+circle3.toString());

        //control tests for the Rectangle class
            System.out.println("Rectangle");
            Rectangle rectangle1 = new Rectangle();
            Rectangle rectangle2 = new Rectangle(3,4);
            System.out.println("Area= "+ rectangle1.getArea()+" Perimeter = "+rectangle1.getPerimeter()+" "+rectangle1.toString());
            System.out.println("Area= "+ rectangle2.getArea()+" Perimeter = "+rectangle2.getPerimeter()+" "+rectangle2.toString());

        //control tests for the Employee class
            System.out.println("Employee");
            Employee employee = new Employee(3,"Alexander","White",100000);
            employee.setSalary(140000);
            System.out.println(employee.getName()+" salary ="+employee.getSalary()+" AnnualSalary= "+employee.getAnnualSalary()+" RaisedSalary= " +employee.raiseSalary(15));
            System.out.println(employee);

        //control tests for the Book class
            Book book1 = new Book("Odyssey",new Author[]{new Author("Homer"),new Author("Homer's Brother (for example)")},1313,32);
            System.out.println(book1);
            System.out.println(book1.getAuthorsName());
            System.out.println(Arrays.toString(book1.getAuthors())); //check for authors
            System.out.println(book1.getAuthors()[0]);
            System.out.println(book1.getAuthors()[1]);

        //control tests for the MyPoint class
            MyPoint myPoint1 = new MyPoint(3,4);
            MyPoint myPoint2 = new MyPoint(2,2);
            System.out.println(Arrays.toString(myPoint1.getXY()));
            System.out.println(myPoint1.distance(6,6));
            System.out.println(myPoint1.distance(myPoint2));
            System.out.println(myPoint1.distance());
            myPoint1.setXY(2,2);
            System.out.println(myPoint1.distance(myPoint2));
        //control tests for the MyTriangle class
            MyTriangle myTriangle1 = new MyTriangle(-1,0,1,0,0,2);
            System.out.println(myTriangle1);
            System.out.println(myTriangle1.getPerimeter());
            System.out.println(myTriangle1.getType());
    }
}
