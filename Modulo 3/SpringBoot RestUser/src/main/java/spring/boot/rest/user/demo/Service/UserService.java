package spring.boot.rest.user.demo.Service;

import org.springframework.stereotype.Service;
import spring.boot.rest.user.demo.Entidade.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public List<User> findAll(){
        return users;
    }

    public User add(User user){
        users.add(user);
        return user;
    }

    public User findByUser(int id){
       return users.stream().filter(x -> x.getId() == id).findAny().get();
    }

    public void delete(int id){
        users.removeIf( user -> user.getId() == id);
    }

}
