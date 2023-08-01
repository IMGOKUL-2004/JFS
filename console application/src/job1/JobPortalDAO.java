package job1;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class JobPortalDAO {
//    private String url;
//    private String username;
//    private String password;
//    private Connection connection;
//
//    public JobPortalDAO(String url, String username, String password) {
//        this.url = url;
//        this.username = username;
//        this.password = password;
//    }
//
//    public void connect() throws SQLException {
//        connection = DriverManager.getConnection(url, username, password);
//    }
//
//    public void disconnect() throws SQLException {
//        if (connection != null && !connection.isClosed()) {
//            connection.close();
//        }
//    }
//
//    public void insertJob(Job job) throws SQLException {
//        String sql = "INSERT INTO jobs (jobId, title, description, company, salary) VALUES (?, ?, ?, ?, ?)";
//
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, job.getJobId());
//            statement.setString(2, job.getTitle());
//            statement.setString(3, job.getDescription());
//            statement.setString(4, job.getCompany());
//            statement.setDouble(5, job.getSalary());
//
//            statement.executeUpdate();
//        }
//    }
//
//    public void insertApplicant(Applicant applicant) throws SQLException {
//        String sql = "INSERT INTO applicants (applicantId, name, email, resume) VALUES (?, ?, ?, ?)";
//
//        try (PreparedStatement statement = connection.prepareStatement(sql)) {
//            statement.setInt(1, applicant.getApplicantId());
//            statement.setString(2, applicant.getName());
//            statement.setString(3, applicant.getEmail());
//            statement.setString(4, applicant.getResume());
//
//            statement.executeUpdate();
//        }
//    }
//
//    public List<Job> getAllJobs() throws SQLException {
//        List<Job> jobs = new ArrayList<>();
//        String sql = "SELECT * FROM jobs";
//
//        try (Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(sql)) {
//
//            while (resultSet.next()) {
//                int jobId = resultSet.getInt("jobId");
//                String title = resultSet.getString("title");
//                String description = resultSet.getString("description");
//                String company = resultSet.getString("company");
//                double salary = resultSet.getDouble("salary");
//
//                Job job = new Job(jobId, title, description, company, salary);
//                jobs.add(job);
//            }
//        }
//
//        return jobs;
//    }
//
//    public List<Applicant> getAllApplicants() throws SQLException {
//        List<Applicant> applicants = new ArrayList<>();
//        String sql = "SELECT * FROM applicants";
//
//        try (Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(sql)) {
//
//            while (resultSet.next()) {
//                int applicantId = resultSet.getInt("applicantId");
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String resume = resultSet.getString("resume");
//
//                Applicant applicant = new Applicant(applicantId, name, email, resume);
//                applicants.add(applicant);
//            }
//        }
//
//        return applicants;
//    }
//}
//
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobPortalDAO {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    public JobPortalDAO(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public void insertJob(Job job) throws SQLException {
        String sql = "INSERT INTO jobs (jobId, title, description, company, salary) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, job.getJobId());
            statement.setString(2, job.getTitle());
            statement.setString(3, job.getDescription());
            statement.setString(4, job.getCompany());
            statement.setDouble(5, job.getSalary());

            statement.executeUpdate();
        }
    }

    public void insertApplicant(Applicant applicant) throws SQLException {
        String sql = "INSERT INTO applicants (applicantId, name, email, resume) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, applicant.getApplicantId());
            statement.setString(2, applicant.getName());
            statement.setString(3, applicant.getEmail());
            statement.setString(4, applicant.getResume());

            statement.executeUpdate();
        }
    }

    public List<Job> getAllJobs() throws SQLException {
        List<Job> jobs = new ArrayList<>();
        String sql = "SELECT * FROM jobs";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int jobId = resultSet.getInt("jobId");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String company = resultSet.getString("company");
                double salary = resultSet.getDouble("salary");

                Job job = new Job(jobId, title, description, company, salary);
                jobs.add(job);
            }
        }

        return jobs;
    }

    public List<Applicant> getAllApplicants() throws SQLException {
        List<Applicant> applicants = new ArrayList<>();
        String sql = "SELECT * FROM applicants";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int applicantId = resultSet.getInt("applicantId");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String resume = resultSet.getString("resume");

                Applicant applicant = new Applicant(applicantId, name, email, resume);
                applicants.add(applicant);
            }
        }

        return applicants;
    }
}
