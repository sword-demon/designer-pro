package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("无解的游戏"));
        bookShelf.appendBook(new Book("无解的游戏1"));
        bookShelf.appendBook(new Book("无解的游戏2"));
        bookShelf.appendBook(new Book("无解的游戏3"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
