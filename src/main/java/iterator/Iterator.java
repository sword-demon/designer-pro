package iterator;

public interface Iterator {
    /**
     * 判断是否有下一个元素
     *
     * @return boolean
     */
    public abstract boolean hasNext();

    /**
     * 移动到下一个元素，且标记位也跟着移动
     *
     * @return Object
     */
    public abstract Object next();
}
