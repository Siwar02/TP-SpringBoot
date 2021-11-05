package com.example.chap5_tp1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Chap5Tp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Chap5Tp1Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository, LogsRepository repository1, GroupeRepository repository2) {
        return (args) -> {

                    // save a few Users
                    User u1= new User(1, "Chloe", "O'Brian", new ArrayList<Logs>(), new ArrayList<Groupe>());
                    User u2= new User(2, "Kim", "Bauer", new ArrayList<Logs>(), new ArrayList<Groupe>());
                    User u3 = new User(3, "David", "Palmer", new ArrayList<Logs>(), new ArrayList<Groupe>());


                    repository.save(u1);
                    repository.save(u2);
                    repository.save(u3);

                    // save a few Logs

                    Logs l1= new Logs( "2021-10-11", "this is first logs", u1);
                    Logs l2= new Logs("2021-10-20", "this is thirs logs",u2);
                    Logs l3=new Logs("2021-12-15", "this is fourth logs",u3);


                    repository1.save(l1);
                    repository1.save(l2);
                    repository1.save(l3);


                    // save a few Groups

                    Groupe g1 = new Groupe( "group1", 40, new ArrayList<User>());
                    Groupe g2 = new Groupe("groupe2", 30, new ArrayList<User>() );

                    repository2.save(g1);
                    repository2.save(g2);

                    ArrayList<Groupe> group =  new ArrayList();
                    group.add(g1);
                    group.add(g2);
                    u1.setGroup(group);
                    repository.save(u1);


                    ArrayList<User> users = new ArrayList();
                    users.add(u1);
                    users.add(u2);
                    g1.setUsers(users);
                    repository2.save(g1);



                    ArrayList<Logs> logs= new ArrayList<>();
                    logs.add(l1);
                    logs.add(l2);
                    u1.setLogs(logs);
                    repository.save(u1);
                };

            }

        }
            // save a few Users
/*
            User user1= new User( "Jack", "Bauer");
            User user2= new User("Chloe", "O'Brian");


            Logs logs1= new Logs( "2021-10-11", "this is first logs");
            Logs logs2= new Logs("2021-10-20", "this is thirs logs");
            Logs logs3=new Logs("2021-12-15", "this is fourth logs");
            Logs logs4= new Logs("2021-07-12", "this is fifth logs");

            Groupe group1 = new Groupe("groupe1", 2 );
            Groupe group2 = new Groupe("groupe2", 3 );


           *//* user1.getGroupe().add(group1);
            user2.getGroupe().add(group1);*//*


            repository.save(user1);
            repository.save(user2);
            // save a few Logs

            repository1.save(logs1);
            repository1.save(logs2);
            repository1.save(logs3);
            repository1.save(logs4);
            // save a few Group

            repository2.save(group1);
            repository2.save(group2);


           *//* List<Groupe> groups =  new ArrayList();
            groups.add(group1); groups.add(group2);
            User.setGroupe(groups);*//*


            repository2.save(group1);
            repository2.save(group2);




 *//*fetch an individual User by ID
            User User = userRespository.findById(1L);
            log.info("User found with findById(1L):");
            log.info("--------------------------------");
            log.info(User.toString());
            log.info("");

            // fetch Users by last name
            log.info("User found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            userRespository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            for (User bauer : repository.findByLastName("Bauer")) {
             log.info(bauer.toString());
             }
            log.info(""); *//*
        };

    };
}*/
