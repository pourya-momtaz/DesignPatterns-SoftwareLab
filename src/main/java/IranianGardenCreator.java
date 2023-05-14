public class IranianGardenCreator implements AbstractGardenCreator {
    public AbstractTree createTree() {
        return new IranianTree();
    }

    public AbstractFlower createFlower() {
        return new IranianFlower();
    }
}