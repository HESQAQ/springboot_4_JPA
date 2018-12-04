package com.example.springboot_4_jpa.dao;

import com.example.springboot_4_jpa.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountDao extends JpaRepository<Account,Integer> {

}
