package Model;

public class Certificate {
    private int id;
    private String name;
    private String achievement;
    private String gift;
    private int playersId;

    public Certificate(int id, String name, String achievement, String gift, int playersId) {
        this.id = id;
        this.name = name;
        this.achievement = achievement;
        this.gift = gift;
        this.playersId = playersId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAchievement() {
        return achievement;
    }

    public String getGift() {
        return gift;
    }

    public int getPlayersId() {
        return playersId;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certificates{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", achievement='" + achievement + '\'' +
                ", gift='" + gift + '\'' +
                ", playersId=" + playersId +
                '}';
    }
}
