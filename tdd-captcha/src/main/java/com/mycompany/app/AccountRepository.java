package com.mycompany.app;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AccountRepository extends CrudRepository<Account, Long> {

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param email the user email.
     */
    public Account findByEmail(String email);
}
