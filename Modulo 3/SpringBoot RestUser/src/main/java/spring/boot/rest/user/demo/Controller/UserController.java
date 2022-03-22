package spring.boot.rest.user.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.boot.rest.user.demo.Entidade.User;
import spring.boot.rest.user.demo.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allAllUsers")
    public List<User> getAllUser() {
        return userService.findAll();
    }

    @PostMapping("/save")
    public User addUser(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        return userService.findByUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userService.delete(id);
    }
}
