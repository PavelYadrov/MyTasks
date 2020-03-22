/*
Condition:
Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
Print the reciprocal as a hexadecimal floating-point number.
 */
package com.exercices.ex1;
public class IntRepresentation {
        private int value;
        public IntRepresentation(int value){
            this.value=value;
        }
        public void representationPrint(){
            System.out.println("int value - "+value+";  binary - "+Integer.toBinaryString(value)+"; octal - "+Integer.toOctalString(value)+" hexadecimal - "+Integer.toHexString(value));
        }
        public void hexdecRep(){
            System.out.printf("%8.2a", (float)1/value);
            System.out.println(" - hexadecimal floating-point representation of reciprocal number "+ value);
        }

}
