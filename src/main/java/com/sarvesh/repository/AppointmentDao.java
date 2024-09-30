package com.sarvesh.repository;

import ch.qos.logback.core.model.INamedModel;
import com.sarvesh.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDao extends JpaRepository<Appointment, Integer> {

}
