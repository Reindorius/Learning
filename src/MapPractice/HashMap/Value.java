package MapPractice.HashMap;

public class Value {
    private boolean graduated;
    private double grade;
    private String major;

    public Value(boolean graduated, double grade, String major) {
        this.graduated = graduated;
        this.grade = grade;
        this.major = major;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString()
    {
        return "This student's major is " + this.major + ", and has achieved an overall average of " +
                this.grade;
    }
}
