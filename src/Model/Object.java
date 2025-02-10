package Model;

public class Object {
    private int id;
    private String name;
    private String material;
    private float price;
    private int roomId;

    public Object(int id, String name, String material, float price, int roomId) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.price = price;
        this.roomId = roomId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrice() {
        return price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Object{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", roomId=" + roomId +
                '}';
    }
}
