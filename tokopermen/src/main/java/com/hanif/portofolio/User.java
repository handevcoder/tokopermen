package com.hanif.portofolio;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "\"user\"") // Double quotes around user to avoid conflict with reserved keyword
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private  Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
}
