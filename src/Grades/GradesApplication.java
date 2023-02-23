package Grades;

import java.util.*;

public class GradesApplication
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Student frodo = new Student("Frodo Bagging", new ArrayList<>(Arrays.asList(90, 80, 95)));
        Student sam = new Student("Samwise Gamgee", new ArrayList<>(Arrays.asList(70, 80, 85)));
        Student merry = new Student("Meriadoc Brandybuck", new ArrayList<>(Arrays.asList(93, 95, 89)));
        Student pippin = new Student("Peregrin Took", new ArrayList<>(Arrays.asList(75, 78, 81)));


        Map<String, Student> students = new HashMap<>();
        students.put("One-Ring-Bearer", frodo);
        students.put("potato_enthusiast", sam);
        students.put("Rohan_Knight_Merry", merry);
        students.put("foolofatook", pippin);

//        System.out.println(students);


        System.out.printf("""
                Welcome!
                                
                              
                """);
        boolean searching = true;
        do
        {
            System.out.printf("""
                    1. View grades for all the students.
                    2. View a specific student's grades.
                    
                    """);
            System.out.print("> ");
            String userInput = scanner.nextLine();
            if(userInput.equals("1"))
            {
                System.out.printf("""
                        Frodo Baggins: %s
                        Samwise Gamgee: %s
                        Meriadoc Brandybuck: %s
                        Peregrin Took: %s
                        """, students.get("One-Ring-Bearer").getGrades(),
                        students.get("potato_enthusiast").getGrades(),
                        students.get("Rohan_Knight_Merry").getGrades(),
                        students.get("foolofatook").getGrades());
            }
            else if (userInput.equals("2"))
            {
                System.out.print("""
                                    
                    |One-Ring-Bearer| |potato_enthusiast| |Rohan_Knight_Merry| |foolofatook|
                    
                    What student would you like to see more information on?
                    """);
                System.out.print("> ");
                userInput = scanner.nextLine();
//            System.out.print(userInput);

                if(!students.containsKey(userInput))
                {
                    System.out.printf("Sorry, no student found with the GitHub username of %s%n", userInput);
                }
                else
                {
                    System.out.printf("""
                        Name: %s - Github Username: %s
                        All Grades: %s
                        Current Average: %.1f
                        """, students.get(userInput).getName(), userInput, students.get(userInput).getGrades(), students.get(userInput).getGradeAverage());
                }
            }
            else
            {
                System.out.println();
                System.out.println("INVALID NUMBER, RESTARTING....");
                System.out.println();
                continue;
            }

            System.out.println("Would you like to see another student? (y/n)");
            System.out.print("> ");
            userInput = scanner.nextLine();
//            System.out.println(userInput);

            if(userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no"))
            {
                searching = false;
            }


        }while(searching);


    }






}
