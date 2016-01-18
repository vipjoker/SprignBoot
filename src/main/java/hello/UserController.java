package hello;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by omakhobei on 1/18/2016.
 */
@RestController
public class UserController {

    private UserDao mUserDao = new MockUserDaoImpl();

    @RequestMapping(path = "users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return mUserDao.getUsers();
    }


    @RequestMapping(path = "user", method = RequestMethod.GET)
    public User getUserById(@RequestParam long id) {
        return mUserDao.getUserById(id);
    }

    @RequestMapping(path = "user" , method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return mUserDao.saveUser(user);
    }

    @RequestMapping(path = "user" ,method = RequestMethod.PUT)
    public User editUser(@RequestBody User user){
        return mUserDao.editUser(user);
    }

    @RequestMapping(path = "user" ,method =  RequestMethod.DELETE)
    public User deleteUser(User user){
        return mUserDao.deleteUser(user);
    }



}


