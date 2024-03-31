package pkge01;

public class Main1 {
    public static void main(String[] args) {
    	System.out.println("R/BCA-22-219");
        // Create an object of TeacherTeaches class
        TeacherTeaches teacher = new TeacherTeaches();

        // Set values for type and name
        teacher.type = "Mathematics";
        teacher.name = "John Doe";

        // Call methods
        teacher.Teaches();
        teacher.Subjects();
    }
}