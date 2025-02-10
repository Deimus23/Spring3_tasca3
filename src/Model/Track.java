package Model;

public class Track {

    private int id;
    private String name;
    private String topics;
    private String details;
    private int roomId;

    public Track(int id, String name, String topics, String details, int roomId) {
        this.id = id;
        this.name = name;
        this.topics = topics;
        this.details = details;
        this.roomId = roomId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTopics() {
        return topics;
    }

    public String getDetails() {
        return details;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics='" + topics + '\'' +
                ", details='" + details + '\'' +
                ", roomId=" + roomId +
                '}';
    }
}
