package com.example.chap5_tp1;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity //this tells hibernate to make a table out of this class
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;


    @OneToMany
    private  List<Logs> Logs;

    @ManyToMany
    //@JoinTable(name = "Groupe")
    List<Groupe> group;

}
