package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "userGroups")
public class Group extends BaseModel {
    private String name;
    private String description;
    @ManyToMany
    private List<User> users;
    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
    @ManyToOne
    private User admin;
}
