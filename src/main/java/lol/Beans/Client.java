package lol.Beans;

/**
 * Created by Violetta on 2017-08-06.
 */
public class Client {

    private String id;

    private String fullName;

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Client() {
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

}
