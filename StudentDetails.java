import java.util.ArrayList;

public class StudentDetails 
{
    // List to store student details
    static ArrayList<ArrayList<String>> student = new ArrayList<>();

    //Add Student
    public static void addStudentInfo(String name, String rollNumber, String marks)
    {
        student.add(new ArrayList<String>());
        student.get(student.size() - 1).add(name);
        student.get(student.size() - 1).add(rollNumber);
        student.get(student.size() - 1).add(marks);
    }

    //View Student Details
    public static void viewStudentDetails()
    {
        //Check if the list is empty
        if(student.size() == 0)
        {
            System.out.println("No student records available to display the topper.");
            return;
        }
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Roll Number", "Marks");
        for(int i = 0; i < student.size(); i++)
        {
            for(int j = 0; j < student.get(i).size(); j++)
            {
                System.out.printf("%-20s", student.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();
    }

    //Search Student
    public static void searchStudent(String rollNumber)
    {
        //Check if the list is empty
        if(student.size() == 0)
        {
            System.out.println("No student records available to display the topper.");
            return;
        }
        for(int i = 0; i < student.size(); i++)
        {
            if(student.get(i).get(1).equals(rollNumber))
            {
                System.out.printf("%-20s%-20s%-20s\n", "Name", "Roll Number", "Marks");
                for(int j = 0; j < student.get(i).size(); j++)
                {
                    System.out.printf("%-20s", student.get(i).get(j));
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Student record not found.");
    }

    //Delete Student
    public static void deleteStudent(String rollNumber)
    {
        //Check if the list is empty
        if(student.size() == 0)
        {
            System.out.println("No student records available to display the topper.");
            return;
        }
        for(int i = 0; i < student.size(); i++)
        {
            if(student.get(i).get(1).equals(rollNumber))
            {
                student.remove(i);
                System.out.println("Student record successfully deleted.");
                return;
            }
        }
        System.out.println("Student record not found.");
    }

    //Calculate Average Marks
    public static double calculateAllStudentAverage()
    {
        // Code to calculate the average marks of all students
        double total = 0;
        for(int i = 0; i < student.size(); i++)
        {
            total += Double.parseDouble(student.get(i).get(2));
        }
        double average = total / student.size();
        return average;
    }

    //Display Topper
    public static void displayTopper()
    {
        //Check if the list is empty
        if(student.size() == 0)
        {
            System.out.println("No student records available to display the topper.");
            return;
        }
        // Code to display the details of the student with the highest marks
        double highestMarks = 0;
        int Index = 0;
        for(int i = 0; i < student.size(); i++)
        {
            double marks = Double.parseDouble(student.get(i).get(2));
            if(marks > highestMarks)
            {
                highestMarks = marks;
                Index = i;
            }
        }
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Roll Number", "Marks");
        for(int j = 0; j < student.get(Index).size(); j++)
        {
            System.out.printf("%-20s", student.get(Index).get(j));
        }
        System.out.println();
    }
}
