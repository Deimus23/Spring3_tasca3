package Model;

public class Client {
    private int id;
    private String name;
    private  String mail;
    private boolean notifications;
    private int sesionId;

    public Client(int id, String name, String mail, boolean notifications, int sesionId) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.notifications = notifications;
        this.sesionId = sesionId;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public int getSesionId() {
        return sesionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public void setSesionId(int sesionId) {
        this.sesionId = sesionId;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", notifications=" + notifications +
                ", sesionId=" + sesionId +
                '}';
    }
}
