package job1;
//
//import java.sql.SQLException;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/job_portal";
//        String username = "root";
//        String password = "imgokul2004";
//
//        JobPortalDAO dao = new JobPortalDAO(url, username, password);
//
//        try {
//            dao.connect();
//
//            // Create and insert a job
//            Job job1 = new Job(1, "Software Engineer", "Develop software applications", "ABC Corp", 80000.0);
//            dao.insertJob(job1);
//
//            // Create and insert an applicant
//            Applicant applicant1 = new Applicant(1, "John Doe", "john@example.com", "Resume content...");
//            dao.insertApplicant(applicant1);
//
//            // Retrieve all jobs and applicants
//            List<Job> jobs = dao.getAllJobs();
//            List<Applicant> applicants = dao.getAllApplicants();
//
//            // Display the results
//            System.out.println("All Jobs:");
//            for (Job job : jobs) {
//                System.out.println(job);
//            }
//
//            System.out.println("All Applicants:");
//            for (Applicant applicant : applicants) {
//                System.out.println(applicant);
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                dao.disconnect();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//
//           
//       
//
//


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/job_portal";
        String username = "root";
        String password = "imgokul2004";

        JobPortalDAO dao = new JobPortalDAO(url, username, password);

        try {
            dao.connect();

            Scanner scanner = new Scanner(System.in);

            // Get job details from the user
            System.out.println("Enter Job ID:");
            int jobId = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            System.out.println("Enter Job Title:");
            String title = scanner.nextLine();
            System.out.println("Enter Job Description:");
            String description = scanner.nextLine();
            System.out.println("Enter Company Name:");
            String company = scanner.nextLine();
            System.out.println("Enter Salary:");
            double salary = scanner.nextDouble();

            // Create and insert a job
            Job job1 = new Job(jobId, title, description, company, salary);
            dao.insertJob(job1);

            // Get applicant details from the user
            System.out.println("Enter Applicant ID:");
            int applicantId = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            System.out.println("Enter Applicant Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Applicant Email:");
            String email = scanner.nextLine();
            System.out.println("Enter Applicant Resume:");
            String resume = scanner.nextLine();

            // Create and insert an applicant
            Applicant applicant1 = new Applicant(applicantId, name, email, resume);
            dao.insertApplicant(applicant1);

            // Retrieve all jobs and applicants
            List<Job> jobs = dao.getAllJobs();
            List<Applicant> applicants = dao.getAllApplicants();

            // Display the results
            System.out.println("All Jobs:");
            for (Job job : jobs) {
                System.out.println(job);
            }

            System.out.println("All Applicants:");
            for (Applicant applicant : applicants) {
                System.out.println(applicant);
            }
            System.out.println("Successfully you have found a Job");
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dao.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
