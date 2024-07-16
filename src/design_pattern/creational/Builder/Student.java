package design_pattern.creational.Builder;

import design_pattern.creational.Builder.exceptions.InvalidAgeException;
import design_pattern.creational.Builder.exceptions.InvalidPspException;
import design_pattern.creational.Builder.exceptions.InvalidYoeException;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private int id;
    private String email;
    private int yoe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
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

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    private Student(Builder b){
        this.name = b.name;
        this.age = b.age;
        this.psp = b.psp;
        this.batchName = b.batchName;
        this.id = b.id;
        this.email = b.email;
        this.yoe = b.yoe;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

     static class Builder {
        private String name;
        private int age;
        private double psp;
        private String batchName;
        private int id;
        private String email;
        private int yoe;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Student build()  {
            if(yoe < 2) {
                throw new InvalidYoeException("Yoe is not valid");
            }

            if(age < 18) {
                throw new InvalidAgeException("Age is not Valid ");
            }

            if(psp < 70) {
                throw new InvalidPspException("Invalid PSP! ");
            }

            Student s = new Student(this);
            return s;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", yoe=" + yoe +
                ", name='" + name + '\'' +
                '}';
    }
}
