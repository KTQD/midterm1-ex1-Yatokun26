public class MP3 extends Item {
    private int duration;

    public MP3(String name, String description, String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Thông tin MP3:");
        System.out.println("Tên: " + name);
        System.out.println("Mô tả: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Giá: " + price);
        System.out.println("Thời lượng: " + duration);
    }
}
