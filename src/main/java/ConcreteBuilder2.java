public class ConcreteBuilder2 implements Builder {
    private Product product;

    public ConcreteBuilder2() {
        product = new Product("");
    }

    public void buildPartA() {
        product = new Product(product.getDescription() + "Part A2, ");
    }

    public void buildPartB() {
        product = new Product(product.getDescription() + "Part B2, ");
    }

    public void buildPartC() {
        product = new Product(product.getDescription() + "Part C2");
    }

    public Product getResult() {
        return product;
    }
}
