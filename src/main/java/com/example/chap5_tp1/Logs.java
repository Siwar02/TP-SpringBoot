package com.example.chap5_tp1;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@ToString
public class Logs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "date")
    private String date;

    @Column(name = "Content")
    private String Content;

    @ManyToOne
    private User user;

    public Logs( String date, String Content, User user) {
        this.date=date;
        this.Content=Content;
        this.user=user;

    }

}
