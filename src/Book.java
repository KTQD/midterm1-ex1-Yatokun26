// Lớp Book
public class Book extends Item {
    private String author;
    private int numberOfPages;
    private String genre;

    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        System.out.println("Thông tin Sách:");
        System.out.println("Tên: " + name);
        System.out.println("Mô tả: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Giá: " + price);
        System.out.println("Tác giả: " + author);
        System.out.println("Số trang: " + numberOfPages);
        System.out.println("Thể loại: " + genre);
    }
}
