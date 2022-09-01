public class App {
    public static void main(String[] args) throws Exception {
        // Abstraction is to work with something we know how to use without 
        // knowing how it works interally
        Student student = new Student("Dwan","Conyers","CHC");
        System.out.println(student.greeting());

        Integer one = 1;
        Double two = 2.0;
        String twoString = "2.0";
        boolean bool = false;

        //Strongly typed programming languages will attempt to determine the type for you
        System.out.println(one + two);
        System.out.println(one + twoString);
    }
}
