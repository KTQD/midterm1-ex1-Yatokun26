// Lớp Main
public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Máy nghe nhạc MP3", "Máy nghe nhạc cầm tay", "MP3001", 49.99f, 3600);
        Book book = new Book("Lập trình Java", "Hướng dẫn cho người mới bắt đầu về lập trình Java", "BK001", 29.99f, "John Smith", 300, "Lập trình");

        mp3.showInfo();
        System.out.println();
        book.showInfo();
    }
}
