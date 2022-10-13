package ru.bot;

public class Student {
    String name = "";
    int m;
    int f;
    int e;

}
class StudentTest {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.name = "Ivan";
        ivan.m = 5;
        ivan.f = 3;
        ivan.e = 2;
        int edSubj = 3;
        float averageRating = (ivan.m + ivan.f + ivan.e)/edSubj;
        System.out.println("Student " + ivan.name + " have that average rating: " + averageRating);


    }


}
