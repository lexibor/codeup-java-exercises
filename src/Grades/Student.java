package Grades;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    private String name;

    private List<Integer> grades = new ArrayList<>();



    public Student(String name, List<Integer> grades)
    {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName()
    {
        return name;
    }

    public List<Integer> getGrades()
    {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade)
    {
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage()
    {
        double sum = 0;

        for(int grade : grades)
        {
            sum += grade;
        }

        return sum/grades.size();
    }

}
