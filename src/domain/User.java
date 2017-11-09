package domain;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 12:14 2017/11/8
 * @Modified By:
 */
public class User {
    private int id;
    private String name;

    public User(){}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
