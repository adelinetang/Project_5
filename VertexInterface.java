public interface VertexInterface<T>{
    public void add(T newEntry);
    public T removeMax();
    public T getMax();
    public boolean isEmpty();
    public int getSize();
    public void clear();
}