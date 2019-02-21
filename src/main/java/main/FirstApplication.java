package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication implements CommandLineRunner {


    @Autowired
    PersonRepository personRepository;

    @Autowired
    ManagerRepository mr;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Person person = new Person();
        person.setName("John");
        personRepository.save(person);

        Person personFromDb = personRepository.findFirstByName("John");
        System.out.println(personFromDb);*/

        ManagerEntity me = new ManagerEntity();
        me.setLastName("Potter");
        mr.save(me);

        ManagerEntity me1 = mr.findByLastName("Potter");
        System.out.println(me1.getLastName());
    }
}
