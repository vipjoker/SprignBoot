package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by omakhobei on 1/18/2016.
 */
public class MockUserDaoImpl implements UserDao {

    private long userCount;
    private List<User> mUsers;

    public  MockUserDaoImpl(){
        mUsers = fakeUsers();
    }

    @Override
    public List<User> getUsers() {
      return mUsers;
    }

    @Override
    public User getUserById(long id) {
        for(User user : mUsers){
            if(user.getId() == id) return user;
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        user.setId(userCount++);
        mUsers.add(user);
        return user;
    }

    @Override
    public User deleteUser(User _user) {
        for(User user :mUsers)
            if(user.getId() == _user.getId()){
                mUsers.remove(user);
                return _user;
            }
        return null;
    }

    @Override
    public User editUser(User _user) {
        for(User user :mUsers)
            if(user.getId() == _user.getId()){
                mUsers.remove(user);
                mUsers.add(_user);
                return _user;
            }
        return null;
    }

    private List<User> fakeUsers(){
        return new ArrayList<>(Arrays.asList(
                new User(userCount++,"vasia" ,"ivanov"),
                new User(userCount++,"petro" ,"shevchenko"),
                new User(userCount++,"ivan" ,"framko"),
                new User(userCount++,"jack" ,"petrenko"),
                new User(userCount++,"oleh" ,"burij"),
                new User(userCount++,"nastia" ,"smith")
        ));
    }
}
