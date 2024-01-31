public class ItemHolder<T extends Object> {

    T item;

    public ItemHolder(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
