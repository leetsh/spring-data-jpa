package com.github.leetsh.springdatajpa;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("leetsh");
        account.setPassword("pass");
        //account.setCreated(new Date());         //@Temporal(TemporalType.TIMESTAMP)
        account.setEmail("leetsh@naver.com");   //@Transient
        entityManager.persist(account);
    }
}
