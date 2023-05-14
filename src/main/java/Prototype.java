public interface Prototype extends Cloneable {
    String getDescription();
    Prototype clone() throws CloneNotSupportedException;
}
