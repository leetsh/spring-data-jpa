package com.github.leetsh.springdatajpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    @Embedded
    private Address street;

}
