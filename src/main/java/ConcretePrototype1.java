public class ConcretePrototype1 implements Prototype {
    private String description;

    public ConcretePrototype1(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public ConcretePrototype1 clone() throws CloneNotSupportedException {
        return (ConcretePrototype1) super.clone();
    }
}
