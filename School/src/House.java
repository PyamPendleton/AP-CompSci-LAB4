public class House {

    private String address;
    private int size;
    private int price;
    private int bedrooms;


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }


    public House(String address, int size, int price, int bedrooms) {
        this.address = address;
        this.size = size;
        this.price = price;
        this.bedrooms = bedrooms;
    }

}
