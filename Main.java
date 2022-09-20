import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            CollegeCourseDetails ccd = new CollegeCourseDetails();
            boolean flag = false;
            System.out.println("\t\t Welcome to ABC Colege of Education \t\t");
            System.out.println("\t\t\t ABC nagar,Tenkasi \t");
            do{
                System.out.println("________________________________________");
                System.out.println("Choose the option:");
                System.out.println("1. Course details");
                System.out.println("2. Admission details & contact");
                System.out.println("3. Exit");
                System.out.println("________________________________________");
                System.out.print("Enter your option:  ");
                String option = sc.next();
                switch (option){
                    case "1":
                        ccd.courseDetails();
                        System.out.println("___________________________________________");
                        System.out.println("Enter the course which one do you want:");
                        System.out.println("1. Engineering");
                        System.out.println("2. Medical");
                        System.out.println("3. Arts & Science");
                        System.out.println("___________________________________________");
                        System.out.print("Enter your option: ");
                        int choice = sc.nextInt();
                        ccd.courseDetails(choice);
                        break;
                    case "2":
                        System.out.println("Enter Required Details:");
                        System.out.println("NAME: ");
                        String name = sc.next();
                        System.out.println("Enter your mobile number: ");
                        String no = sc.next();
                        System.out.println("Enter your email ID: ");
                        String mailId = sc.next();
                        System.out.println("Enter which department do you want to enquire: ");
                        String dept = sc.next();
                        ccd.admissionDetails(name,no,mailId,dept);
                        break;
                    case "3":
                        System.out.println("~~\u200B\uD83D\uDE4F Thank You for contacting us \u200B\uD83D\uDE4F ~~");
                        flag = true;
                        break;
                    default:
                        System.out.println("Enter valid option");
                        break;
                }

            }while(!flag);
        }catch (InputMismatchException e){
                System.out.println("Enter valid choose");
            }

        }
}