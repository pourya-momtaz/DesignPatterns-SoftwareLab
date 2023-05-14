public class ConcretePrototype2 implements Prototype {
    private String description;

    public ConcretePrototype2(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public ConcretePrototype2 clone() throws CloneNotSupportedException {
        return (ConcretePrototype2) super.clone();
    }
}
