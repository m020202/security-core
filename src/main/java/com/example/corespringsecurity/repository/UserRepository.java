package com.example.corespringsecurity.repository;

import com.example.corespringsecurity.domain.Account;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    public Long save(Account account) {
        em.persist(account);
        return account.getId();
    }
}
