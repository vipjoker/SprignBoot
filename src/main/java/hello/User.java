package hello;

/**
 * Created by omakhobei on 1/18/2016.
 */
public class User {
    private String name;
    private String surname;
    private long id;



    public User(long id , String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public User (){
    }


    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public void setId(long id) {
        this.id = id;
    }
}
