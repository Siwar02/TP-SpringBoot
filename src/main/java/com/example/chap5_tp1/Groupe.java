package com.example.chap5_tp1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "capacite")
    private Integer capacite;

    @ManyToMany
    @JsonIgnore
    List<User> users;

    public Groupe(String libelle, Integer capacite, ArrayList<User> users) {
        this.libelle = libelle;
        this.capacite = capacite;
        this.users=users;

    }


}
