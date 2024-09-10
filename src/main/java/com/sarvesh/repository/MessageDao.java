package com.sarvesh.repository;

import com.sarvesh.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageDao extends JpaRepository<Message, Integer> {

}
