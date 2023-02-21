import java.util.Scanner;   //importing scanner package for taking the input

//driver class
public class StudentSelection {
    public static void main (String[] args) {
        System.out.println("Enter the total number of Students: ");

        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();

        String[] student = new String[numOfStudents];
        int[] age = new int[numOfStudents];

        Scanner studentName = new Scanner(System.in);
        Scanner ageInput = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("enter Student's name: ");
            student[i] = studentName.nextLine();
            age[i] = ageInput.nextInt();
        }

        for (int i = 0; i < numOfStudents; i++) {
            if (age[i] >= 15) {
                System.out.println(student[i] + "can play Cricket.");
                System.out.println("The student is now " + age[i]);
            }
        }

        input.close();
        studentName.close();
        ageInput.close();
    }
}
