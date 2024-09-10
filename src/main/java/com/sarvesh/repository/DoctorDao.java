package com.sarvesh.repository;

import com.sarvesh.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDao extends JpaRepository<Doctor, Integer> {

    public Doctor findByMobileNo(String mobileNo);
}
