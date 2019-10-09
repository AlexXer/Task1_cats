package bean;

public class Cat {
    private int id;
    private String name;
    private Cat father;
    private Cat mother;

    public Cat(int id, String name, Cat father, Cat mother) {
        this.id = id;
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getFather() {
        return father;
    }

    public void setFather(Cat father) {
        this.father = father;
    }

    public Cat getMother() {
        return mother;
    }

    public void setMother(Cat mother) {
        this.mother = mother;
    }

}
