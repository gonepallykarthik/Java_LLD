package design_pattern.creational.Builder;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("welcome to this application");
        Student s = Student.builder()
                .setId(1)
                .setName("John")
                .setYoe(4)
                .setAge(23)
                .setPsp(90)
                .setEmail("john@email.com")
                .setBatchName("some batch name")
                .build();

        System.out.println(s.getName());
    }
}
