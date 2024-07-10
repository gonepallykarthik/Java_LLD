package OOP_LLD.Practice;

public abstract class Animal {
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void play();
    public abstract void eat();
}
