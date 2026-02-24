import java.util.Scanner;
public class Main extends StudentDetails
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int choice;
        System.out.println("\nWelcome to Student Record Manager");
        while(true)
        {
            System.out.println("-------------------------------");
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. SEARCH");
            System.out.println("4. DELETE");
            System.out.println("5. CALCULATE AVERAGE");
            System.out.println("6. DISPLAY TOPPER");
            System.out.println("7. EXIT");
            System.out.println("Enter your choice: ");
            choice = obj.nextInt();
            switch (choice) 
            {
                case 1://Adding new student details
                    System.out.println("\n-------------------------------");
                    System.out.println("Enter Student Details:");
                    System.out.print("Student Name: ");
                    obj.nextLine(); // Consume newline left-over
                    String name = obj.nextLine();
                    System.out.print("Roll Number: ");
                    String rollNumber = obj.next();
                    obj.nextLine(); // Consume newline left-over
                    System.out.print("Marks: ");
                    String marks = obj.next();
                    addStudentInfo(name, rollNumber, marks);
                    break;
                case 2://viewing details of all students
                    System.out.println("\n-------------------------------");
                    viewStudentDetails();
                    break;
                case 3://Searching for a specific roll number
                    System.out.println("\n-------------------------------");
                    System.out.print("Enter 'Roll Number' of the student: ");
                    searchStudent(obj.next());
                    break;
                case 4://Deleting a student record based on roll number
                    System.out.println("\n-------------------------------");
                    System.out.print("Enter 'Roll Number' of the student to delete: ");
                    deleteStudent(obj.next());
                    break;
                case 5://Calculating the average marks of all students
                    System.out.println("\n-------------------------------");
                    double average = calculateAllStudentAverage();
                    System.out.println("Average Marks of All Students: " + average);
                    break;
                case 6://Displaying the details of the student with the highest marks
                    System.out.println("\n-------------------------------");
                    displayTopper();
                    break;
                case 7:
                    System.out.println("\n-----------------------------");
                    System.out.println("Exiting the program......");
                    System.exit(0); 
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
        //obj.close();
    }
}
