package by.tms.aviasales_c26.entity;

import javax.persistence.*;

import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String userName;
    private String password;
}
