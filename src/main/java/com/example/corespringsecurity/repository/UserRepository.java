package com.example.corespringsecurity.repository;

import com.example.corespringsecurity.domain.Account;
import com.example.corespringsecurity.domain.QAccount;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.corespringsecurity.domain.QAccount.account;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;
    private final JPAQueryFactory queryFactory;
    public Long save(Account account) {
        em.persist(account);
        return account.getId();
    }

    public Account findByUsername(String username) {
        Account result = queryFactory.selectFrom(account)
                .where(account.username.eq(username))
                .fetchOne();
        return result;
    }
}
