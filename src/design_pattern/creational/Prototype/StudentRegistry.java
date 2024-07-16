package design_pattern.creational.Prototype;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> hm;

    public StudentRegistry(){
        this.hm = new HashMap<>();
    }

    public Student get(String batchName){
        return this.hm.get(batchName);
    }

    public void put(String batchName, Student s ){
        this.hm.put(batchName, s);
    }
}
