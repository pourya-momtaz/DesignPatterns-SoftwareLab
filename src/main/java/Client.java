public class Client {
    private AbstractTree tree;
    private AbstractFlower flower;

    public Client(AbstractGardenCreator factory) {
        tree = factory.createTree();
        flower = factory.createFlower();
    }

    public String getTree() {
        return tree.getDescription();
    }

    public String getFlower() {
        return flower.getDescription();
    }
}