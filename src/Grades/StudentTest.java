package Grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentTest
{
    public static void main(String[] args)
    {
        List<Integer> grades = new ArrayList<>();
        Student student = new Student("Billy", grades);

        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(100);
        System.out.println(student.getGradeAverage());


    }
}
