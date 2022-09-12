package net.phil.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("net.phil.addressbook.data.persistence.repository")
@EntityScan("net.phil.addressbook.data.persistence.entity")

public class AddressbookApplication {

  public static void main(String[] args) {
    SpringApplication.run(AddressbookApplication.class, args);
  }

}
