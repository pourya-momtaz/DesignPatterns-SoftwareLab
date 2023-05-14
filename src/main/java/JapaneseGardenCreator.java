public class JapaneseGardenCreator implements AbstractGardenCreator {
    public AbstractTree createTree() {
        return new JapaneseTree();
    }

    public AbstractFlower createFlower() {
        return new JapaneseFlower();
    }
}
