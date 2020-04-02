package com.exercises.ex1;

public interface Measurable {
   //For the first exercise
     double getMeasure();

     default String getName(){
         return "";
     }

    static double average(Measurable[] objects) {
        double average=0.0;
        for(Measurable obj:objects){
            average+=obj.getMeasure();
        }
        return average/objects.length;
    }

    //For the second exercise
    static String largest(Measurable[] objects){
        int index=0;
        double sal=0;
        for(int i=0;i<objects.length;i++){
            if (objects[i].getMeasure()>sal){
                sal=objects[i].getMeasure();
                index=i;
            }
        }
        return objects[index].getName();
    }
}
