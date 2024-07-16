package design_pattern.creational.Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public Student clone() {
        IntelligentStudent s = new IntelligentStudent(this);
        return s;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
