package com.example.collector.api;

import com.example.collector.EndUser;
import com.example.collector.EndUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class EndUserController {
    private final EndUserService endUserService;

    @Autowired
    public EndUserController(EndUserService endUserService) {
        this.endUserService = endUserService;
    }

    @PostMapping( "api/v1/enduser" )
    public void addEndUser(@RequestParam MultiValueMap paramMap) {
        UUID id = UUID.randomUUID();
        Map myMap = paramMap.toSingleValueMap();
        String name = (String) myMap.get("name");
        String title = (String) myMap.get("title");
        String email = (String) myMap.get("mail");
        String phone = (String) myMap.get("phone");
        System.out.println("hi         " + name + " bye");
        EndUser l = new EndUser(id, name, title, email, phone);
        endUserService.addEndUser(l);
    }

    @GetMapping("api/v1/enduser")
    @ResponseBody
    public String finish() {
        return "Thank you for submitting";
    }

    @GetMapping("api/v1/allusers")
    @ResponseBody
    public List<EndUser> getAllUsers() {
        return endUserService.getAllUsers();
    }

    @RequestMapping("/")
    public String welcome() {
        return "landing";
    }
}
