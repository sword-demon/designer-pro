package iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf BookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.BookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 判断是否有下一个元素
     *
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return index < BookShelf.getLength();
    }

    /**
     * 移动到下一个元素，且标记位也跟着移动
     *
     * @return Object
     */
    @Override
    public Object next() {
        Book book = BookShelf.getBookAt(index);
        index++;
        return book;
    }
}
