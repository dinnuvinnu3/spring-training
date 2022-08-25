package com.dbs.project.recRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.recModel.ReceiverInfo;

public interface ReceiverRepo extends JpaRepository<ReceiverInfo, String>{

}
