// Inheritance is to use class hierarchies to enable the reuse of functionality
public class UndergradStudent extends Student implements Major{

    private Double gpa;
    private Integer creditsEarned;
    private String major;

    public UndergradStudent(final String firstName, final String lastName, final String schoolName, final Double gpa,
    final Integer creditsEarned,final String major) {
        super(firstName, lastName, schoolName);
        this.gpa = gpa;
        this.creditsEarned = creditsEarned;
        this.major = major;
    }
    

    public Double getGpa() {
        return gpa;
    }


    public void setGpa(final Double gpa) {
        this.gpa = gpa;
    }


    public Integer getCreditsEarned() {
        return creditsEarned;
    }


    public void setCreditsEarned(final Integer creditsEarned) {
        this.creditsEarned = creditsEarned;
    }


    public String getMajor() {
        return major;
    }


    public void setMajor(final String major) {
        this.major = major;
    }

    //polymorphism is to override methods to change their behavior 
    @Override
    public String greeting(){
        return super.greeting() + " My major is " + major + " My GPA is " + gpa + 
        " and I have earned " + creditsEarned + " credits.";
    }

    @Override
    public Integer creditsRemaining(final Integer creditsRequired) {
        return creditsRequired - creditsEarned;
    }

    @Override
    public Boolean isMajorComplete(final Integer creditsRequired) {
        return creditsRemaining(creditsRequired) == 0;
    }
    
}
