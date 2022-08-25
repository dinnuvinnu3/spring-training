package com.example.dbsSecurity1.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbsSecurity1.model.DbsUser;

public interface DbsRepo extends JpaRepository<DbsUser, Integer>{

	DbsUser findByUserName(String name);

}
