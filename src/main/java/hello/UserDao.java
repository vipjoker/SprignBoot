package hello;

import java.util.List;

/**
 * Created by omakhobei on 1/18/2016.
 */
public interface UserDao {

    List<User> getUsers();

    User saveUser(User user);

    User deleteUser(User user);

    User editUser(User user);

    User getUserById(long id);
}
