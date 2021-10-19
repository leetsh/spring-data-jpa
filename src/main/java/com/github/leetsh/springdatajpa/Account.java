package com.github.leetsh.springdatajpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created = new Date();

    @Transient
    private String email;

    //@Embedded
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name="home_street"))
    })
    private Address homeAddress;

}
