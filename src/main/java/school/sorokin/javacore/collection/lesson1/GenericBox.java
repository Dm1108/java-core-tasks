package school.sorokin.javacore.collection.lesson1;

public class GenericBox<T> {

    private T t;

    public GenericBox(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public boolean isEqual(GenericBox<T> other) {
        return (this.t == other.t);
    }

    public void swap(GenericBox<T> other) {
        if (other == null) {
            throw new IllegalArgumentException("Коробка не может быть пустой");
        }

        T temp = this.t;
        this.t = other.t;
        other.t = temp;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "t=" + t +
                '}';
    }
}
