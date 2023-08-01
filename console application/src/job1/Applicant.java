package job1;
//
//public class Applicant {
//    private int applicantId;
//    private String name;
//    private String email;
//    private String resume;
//
//    public Applicant(int applicantId, String name, String email, String resume) {
//        this.applicantId = applicantId;
//        this.name = name;
//        this.email = email;
//        this.resume = resume;
//    }
//
//    // Getters and Setters
//
//    public int getApplicantId() {
//        return applicantId;
//    }
//
//    public void setApplicantId(int applicantId) {
//        this.applicantId = applicantId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getResume() {
//        return resume;
//    }
//
//    public void setResume(String resume) {
//        this.resume = resume;
//    }
//
//    @Override
//    public String toString() {
//        return "Applicant [applicantId=" + applicantId + ", name=" + name + ", email=" + email + ", resume=" + resume
//                + "]";
//    }
//}
//
public class Applicant {
    private int applicantId;
    private String name;
    private String email;
    private String resume;

    public Applicant(int applicantId, String name, String email, String resume) {
        this.applicantId = applicantId;
        this.name = name;
        this.email = email;
        this.resume = resume;
    }

    // Getters and Setters

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Applicant [applicantId=" + applicantId + ", name=" + name + ", email=" + email + ", resume=" + resume
                + "]";
    }
}
