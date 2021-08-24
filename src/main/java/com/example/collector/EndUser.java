package com.example.collector;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class EndUser {

    private final UUID id;
    private final String name;
    private final String title;
    private final String email;
    private final String phone;
//    public EndUser(@JsonProperty("id") UUID id,
//                   @JsonProperty("name") String name,
//                   @JsonProperty("title") String title,
//                   @JsonProperty("email") String email,
//                   @JsonProperty("phone") String phone)
    public EndUser(UUID id, String name, String title, String email, String phone) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.email = email;
        this.phone = phone;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

}
