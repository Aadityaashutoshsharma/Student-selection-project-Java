import java.util.Scanner;   //importing scanner package for taking the input

//driver class
public class StudentSelection {
    public static void main (String[] args) {

        System.out.println("Enter the total number of Students: ");

        //getting input of total students
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();

        //making the arrays of students and their age
        String[] student = new String[numOfStudents];
        int[] age = new int[numOfStudents];

        //getting the input of names and age of students
        Scanner studentName = new Scanner(System.in);
        Scanner ageInput = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter student's name: ");
            student[i] = studentName.nextLine();
            System.out.println("Enter student's age: ");
            age[i] = ageInput.nextInt();
        }

        //created a loop to check which student meets the age criteria to play cricket
        for (int i = 0; i < numOfStudents; i++) {
            //if condition will check if the student is older than 15 years or not
            if (age[i] >= 15) {
                System.out.println(student[i] + "can play Cricket.");
                System.out.println("The student is now " + age[i]);
            }
        }

        //closing the Java Scanner Class
        input.close();
        studentName.close();
        ageInput.close();
    }
}
