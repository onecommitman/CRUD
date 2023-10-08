package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UsersController {

    UserService userService;

    public UsersController() {
    }

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/edit")//@GetMapping(value = "/{id}")
    public String showByID(@RequestParam("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserByID(id));
        return "show";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "new";
    }

    @PostMapping()
    public String craate(@ModelAttribute("persom") User user) {
        userService.saveUser(user.getName(), user.getLastName(), user.getAge());
        return "redirect:/users";

    }

    @PatchMapping("/edit")
    public String update(@RequestParam("id") int id, @ModelAttribute("user") User user, Model model) {
        userService.updateUser(id, user);
        return "redirect:/users";
    }

    @DeleteMapping
    public String delete(@RequestParam("id") Long id) {
        userService.removeUserById(id);
        return "redirect:/users";
    }

}