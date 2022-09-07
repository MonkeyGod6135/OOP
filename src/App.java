public class App {
    public static void main(String[] args) throws Exception {
        // Abstraction is to work with something we know how to use without 
        // knowing how it works interally
        Student student = new Student("Dwan","Conyers","CHC");
        System.out.println(student.greeting());

        //write the lines of code to create an undergradstudent
        //using the student object as the basis for creation.
        //call the greeting, creditsremaining, and ismajorcomplete methods
        //on the undergrad student object
        UndergradStudent underGrad = new UndergradStudent(student.getFirstName(), student.getLastName(), student.getSchoolName(),
         3.75, 40, "Computer Science");
         System.out.println(underGrad.greeting());
         System.out.println(underGrad.creditsRemaining(40));
         System.out.println(underGrad.isMajorComplete(40));

        Integer one = 1;
        Double two = 2.0;
        String twoString = "2.0";
        boolean bool = false;

        //Strongly typed programming languages will attempt to determine the type for you
        System.out.println(one + two);
        System.out.println(one + twoString);
        // System.out.println(one + bool);
    }
}
