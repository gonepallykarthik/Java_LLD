package design_pattern.creational.Prototype;

public class Student implements prototype<Student>{
    private String name;
    private int id;
    private String email;
    private int yoe;
    private int gradYear;
    private double avgPSP;
    private int yearOfEnrollment;
    private String BatchName;

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public Student(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatchName() {
        return BatchName;
    }

    public void setBatchName(String batchName) {
        BatchName = batchName;
    }

    public Student(Student student){
        this.avgPSP = student.avgPSP;
        this.BatchName = student.BatchName;
        this.yearOfEnrollment = student.yearOfEnrollment;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getAvgPSP() {
        return avgPSP;
    }

    public void setAvgPSP(double avgPSP) {
        this.avgPSP = avgPSP;
    }


    @Override
    public Student clone() {
        Student s = new Student(this);
        return s;
    }
}
