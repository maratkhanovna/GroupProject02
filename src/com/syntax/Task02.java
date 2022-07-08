package com.syntax;

public class Task02 {
    /*
    We have to calculate the average of marks obtained in three subjects
    by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that
    will be returning the average of marks. Provide implementation of abstract method
    in classes 'A' and 'B'. The constructor of student A takes the marks in three subjects
    as its parameters and the marks in four subjects as its parameters for student B. Test your code
     */
    public static void main(String[] args) {
        Marks [] marks = {new A(85,91,92), new B(88,93,96,89)};
        for (Marks test:marks){
            System.out.println(test.getAverage());
        }
    }
}
abstract class Marks{
    abstract double getAverage();
}
class A extends Marks{
    double markSubject1;
    double markSubject2;
    double markSubject3;

    public A(double markSubject1, double markSubject2, double markSubject3) {
        this.markSubject1 = markSubject1;
        this.markSubject2 = markSubject2;
        this.markSubject3 = markSubject3;
    }

    @Override
    double getAverage() {
        double average = (markSubject1+markSubject2+markSubject3)/3;
        return average;
    }
}
class B extends Marks {
    double markSubject1;
    double markSubject2;
    double markSubject3;
    double markSubject4;

    public B(double markSubject1, double markSubject2, double markSubject3, double markSubject4) {
        this.markSubject1 = markSubject1;
        this.markSubject2 = markSubject2;
        this.markSubject3 = markSubject3;
        this.markSubject4 = markSubject4;
    }

    @Override
    double getAverage() {
        double average = (markSubject1+markSubject2+markSubject3+markSubject4)/4;
        return average;
    }
}
