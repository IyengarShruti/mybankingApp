package net.javafiles.mybanking.repository;

import net.javafiles.mybanking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
