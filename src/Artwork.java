public class Artwork {
    private String title;
    private String medium;
    private double price;

    public Artwork(String title, String medium, double price) {
        this.title = title;
        this.medium = medium;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Artwork{title='" + title + '\'' + ", medium='" + medium + '\'' + ", price=" + price + '}';
    }
}
