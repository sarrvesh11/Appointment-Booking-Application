package com.sarvesh.repository;

import com.sarvesh.entity.CurrentSession;
import com.sarvesh.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDao extends JpaRepository<CurrentSession, Integer> {

    public CurrentSession findByUuid(String uuid);

}
