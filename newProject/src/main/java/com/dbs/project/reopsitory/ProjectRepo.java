package com.dbs.project.reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.project.model.ProjectInfo;

public interface ProjectRepo extends JpaRepository<ProjectInfo, String> {

}
