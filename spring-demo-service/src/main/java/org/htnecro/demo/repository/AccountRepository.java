package org.htnecro.demo.repository;

import org.htnecro.demo.meta.Account;
import org.htnecro.demo.meta.User;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {


}
