package Model;

public class Ticket {
    private int  id;
    private int  userId;
    private int roomId;
    private double price;

    public Ticket(int id, int userId, int roomId, double price) {
        this.id = id;
        this.userId = userId;
        this.roomId = roomId;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public double getPrice() {
        return price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", userId=" + userId +
                ", roomId=" + roomId +
                ", price=" + price +
                '}';
    }
}
