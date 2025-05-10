import java.util.ArrayList;
import java.util.Scanner;

public class ResultManagement {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Result> results = new ArrayList<>();

    public static void main(String[] args) {
        try {
                
            int choice;
            do {
                System.out.println("\n Menu:");
                System.out.println("1. Add Result");
                System.out.println("2. Search Result");
                System.out.println("3. Display All Results");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addResult();
                        break;
                    case 2:
                        searchResult();
                        break;
                    case 3:
                        displayResults();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            } while (choice != 4);
        }

        catch (Exception e) {
            System.out.println("Exception :"+e);
        }
    }

    private static void addResult() {
        try {
            
            System.out.print("Enter Student Enrollment: ");
            String Enrollment = scanner.next();
            

            if (Enrollment.length() != 12 ) 
            {
                System.out.println("Pls Enter Right Stundent EnrollMent Number.....");
                
            }
            else {

                System.out.print("Enter Semester: ");
                int Semester = scanner.nextInt();
                if (Semester == 1) {

                    System.out.println("Select Subject: [  Python, Maths, It_system, English, Swd] ");
                
                    System.out.print("Enter Subject: ");
                    String subject = scanner.next();

                    if (subject.equals("It_system") || subject.equals("Maths") || subject.equals("Python")
                            || subject.equals("English") || subject.equals("Swd"))

                    {
                        
                        System.out.print("Enter " + subject + " Marks: ");
                        int marks = scanner.nextInt();

                        if (marks > 70) {

                            System.out.println("\n Pliz Enter your mark less then 70..... ");

                        } else if (marks < 0) {

                            System.out.println("\n Pliz Enter your positive mark..... ");

                        } else {
                            System.out.println("Result Added Successfully!");
                        }

                        Result result = new Result(Enrollment, Semester, subject, marks);
                        results.add(result);

                    } 
                    else
                    {
                        System.out.println("Subject Not Found ");
                    }
                } 
                else if (Semester == 2) {
                    System.out.println("Select Subject: [Ad_Maths, Ad_Python, Physic, ENS, Internship-i] ");
                    System.out.print("Enter Subject: ");
                    String subject = scanner.next();

                    if (subject.equals("Ad_Maths") || subject.equals("Ad_Python") || subject.equals("Physic")
                            || subject.equals("ENS") || subject.equals("Internship-i"))

                    {

                        System.out.print("Enter " + subject + " Marks: ");
                        int marks = scanner.nextInt();

                        if (marks > 70) {

                            System.out.println("\n Pliz Enter your mark less then 70..... ");

                        } else if (marks < 0) {

                            System.out.println("\n Pliz Enter your positive mark..... ");

                        } else {
                            System.out.println("Result Added Successfully!");
                        }

                        Result result = new Result(Enrollment, Semester, subject, marks);
                        results.add(result);

                    } else {
                        System.out.println("Subject Not Found ");
                    }

                } else if (Semester == 3) {
                    System.out.println(
                            "Select Subject: [Data_Structer, Fundament_OF_Sofware_Development(FSD), Database_Management(Dbms), Linux, Seminar] ");
                    System.out.print("Enter Subject: ");
                    String subject = scanner.next();

                    if (subject.equals("Data_Structer") || subject.equals("Fundament_OF_Sofware_Development(FSD)")
                            || subject.equals("Fsd") || subject.equals("Dbms") || subject.equals("DS") || subject.equals("Database_Management(dbms)")
                            || subject.equals("Linux") || subject.equals("Seminar"))

                    {

                        System.out.print("Enter " + subject + " Marks: ");
                        int marks = scanner.nextInt();

                        if (marks > 70) {

                            System.out.println("\n Pliz Enter your mark less then 70..... ");

                        } else if (marks < 0) {

                            System.out.println("\n Pliz Enter your positive mark..... ");

                        } else {
                            System.out.println("Result Added Successfully!");
                        }

                        Result result = new Result(Enrollment, Semester, subject, marks);
                        results.add(result);

                    } else {
                        System.out.println("Subject Not Found ");
                    }
                } else if (Semester == 4) {
                    System.out.println("Select Subject: [Java, Machine_Learning, Digital_Marketing, IPDC , PHP] ");
                    System.out.print("Enter Subject: ");
                    String subject = scanner.next();
                    if (subject.equals("Java") || subject.equals("Machine_Learning") || subject.equals("ML")
                            || subject.equals("Digital_Marketing") || subject.equals("DM") || subject.equals("IPDC")
                            || subject.equals("PHP"))

                    {

                        System.out.print("Enter " + subject + " Marks: ");
                        int marks = scanner.nextInt();

                        if (marks > 70) {

                            System.out.println("\n Pliz Enter your mark less then 70..... ");

                        } else if (marks < 0) {

                            System.out.println("\n Pliz Enter your positive mark..... ");

                        } else {
                            System.out.println("Result Added Successfully!");
                        }

                        Result result = new Result(Enrollment, Semester, subject, marks);
                        results.add(result);

                    } else {
                        System.out.println("Subject Not Found ");
                    }

                } else if (Semester == 5) {
                    System.out.println(
                            "Select Subject: [AD_Java, Foml_AI, Mobile_Computing, Mobile_Application_Development, Internship-ii] ");
                    System.out.print("Enter Subject: ");
                    String subject = scanner.next();
                    if (subject.equals("AD_Java") || subject.equals("Mobile_Computing") || subject.equals("MC")
                            || subject.equals("Mobile_Application_Development") || subject.equals("MAD") || subject.equals("Foml_AI")
                            || subject.equals("AI") || subject.equals("Internship-ii"))

                    {

                        System.out.print("Enter " + subject + " Marks: ");
                        int marks = scanner.nextInt();

                        if (marks > 70) {

                            System.out.println("\n Pliz Enter your mark less then 70..... ");

                        } else if (marks < 0) {

                            System.out.println("\n Pliz Enter your positive mark..... ");

                        } else {
                            System.out.println("Result Added Successfully!");
                        }

                        Result result = new Result(Enrollment, Semester, subject, marks);
                        results.add(result);

                    } else {
                        System.out.println("Subject Not Found ");
                    }

                } else if (Semester == 6) {
                    System.out.println("Select Subject: [Cyber_Security, Cloud, Block_Chain, Software_Development] ");
                    System.out.print("Enter Subject: ");
                    String subject = scanner.next();
                    if (subject.equals("Cyber_Security") || subject.equals("Cloud") || subject.equals("Block_Chain")
                            || subject.equals("Software_Development") || subject.equals("CS")
                            || subject.equals("BC")
                            || subject.equals("SFD") )

                    {

                        System.out.print("Enter " + subject + " Marks: ");
                        int marks = scanner.nextInt();

                        if (marks > 70) {

                            System.out.println("\n Pliz Enter your mark less then 70..... ");

                        } else if (marks < 0) {

                            System.out.println("\n Pliz Enter your positive mark..... ");

                        } else {
                            System.out.println("Result Added Successfully!");
                        }

                        Result result = new Result(Enrollment, Semester, subject, marks);
                        results.add(result);

                    } else {
                        System.out.println("Subject Not Found ");
                    }
                } else {
                    System.out.println("Subject selection available only ");
                }

            }
            } 
        catch (Exception e) {
        System.out.println("Exception :"+ e);
        
        }
        
        //System.out.print("Enter Subject: ");
        //String subject = scanner.next();
        //System.out.print("Enter Marks: ");
        //int marks = scanner.nextInt();

        //Result result = new Result(Enrollment, subject, Semester, marks);
        //results.add(result);
        //
    }

    private static void searchResult() {
        try {
            
        
            System.out.println("Search by:");
            System.out.println("1. Enrollment");
            System.out.println("2. Subject");
            int option = scanner.nextInt();

            String searchTerm;
            if (option == 1) {
                System.out.print("Enter Enrollment: ");
                searchTerm = scanner.next();
                
            } else {
                System.out.print("Enter Subject: ");
                searchTerm = scanner.next();
            }

            boolean found = false;
            for (Result result : results) {
                if (option == 1 && result.getEnrollment().equals(searchTerm) ||
                        option == 2 && result.getSubject().equals(searchTerm)) {
                    System.out.println(result);
                    found = true;
                    //break;
                }
            }

            if (!found) {
                System.out.println("Result Not Found!");
            }

        } catch (Exception e) {
            System.out.println("Exception :"+ e);
    }
    }

    private static void displayResults() {

        try {
        
            if (results.isEmpty()) {
                System.out.println("No Results Found!");
            } else {
                System.out.println("All Results:");
                for (Result result : results) {
                    System.out.println(result.toString());
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Exception :" + e);
    }
    }
}

class Result {
    private String Enrollment;
    private String subject;
    private int marks;
    private int Semester;

    public Result(String Enrollment, int Semester,String subject,int marks) {
        this.Enrollment = Enrollment;
        this.Semester = Semester;
        this.subject = subject;
        this.marks = marks;
        
    }

    public String getEnrollment() {
        return Enrollment;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }


 @Override
 public String toString() {
    return "Enrollment: " + Enrollment + ", Semester: " + Semester + ", Subject: " + subject + ", Marks: " + marks;

}
}