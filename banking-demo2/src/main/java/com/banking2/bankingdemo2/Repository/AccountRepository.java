package com.banking2.bankingdemo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking2.bankingdemo2.model.Account;

public interface AccountRepository  extends JpaRepository<Account, Long>{

}
