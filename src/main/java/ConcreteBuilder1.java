public class ConcreteBuilder1 implements Builder {
    private Product product;

    public ConcreteBuilder1() {
        product = new Product("");
    }

    public void buildPartA() {
        product = new Product(product.getDescription() + "Part A1, ");
    }

    public void buildPartB() {
        product = new Product(product.getDescription() + "Part B1, ");
    }

    public void buildPartC() {
        product = new Product(product.getDescription() + "Part C1");
    }

    public Product getResult() {
        return product;
    }
}

