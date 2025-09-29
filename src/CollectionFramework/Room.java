package CollectionFramework;

public class Room {
    private String name;
    private String city;
    private int capacity;
    private int price;
    private boolean petFriendly = false;

    public Room(String name, String city, int capacity, int price) {
        this.name = name;
        this.city = city;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
