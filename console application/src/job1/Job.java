package job1;
//public class Job {
//    private int jobId;
//    private String title;
//    private String description;
//    private String company;
//    private double salary;
//
//    public Job(int jobId, String title, String description, String company, double salary) {
//        this.jobId = jobId;
//        this.title = title;
//        this.description = description;
//        this.company = company;
//        this.salary = salary;
//    }
//
//    // Getters and Setters
//
//    public int getJobId() {
//        return jobId;
//    }
//
//    public void setJobId(int jobId) {
//        this.jobId = jobId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Job [jobId=" + jobId + ", title=" + title + ", description=" + description + ", company=" + company
//                + ", salary=" + salary + "]";
//    }
//}

public class Job {
    private int jobId;
    private String title;
    private String description;
    private String company;
    private double salary;

    public Job(int jobId, String title, String description, String company, double salary) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.company = company;
        this.salary = salary;
    }

    // Getters and Setters

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job [jobId=" + jobId + ", title=" + title + ", description=" + description + ", company=" + company
                + ", salary=" + salary + "]";
    }
}



