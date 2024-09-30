package com.sarvesh.service;

import com.sarvesh.entity.Doctor;
import com.sarvesh.exception.DoctorException;

import java.util.List;



public interface AdminDoctorService {


    Doctor registerDoctor(Doctor doctor) throws DoctorException;

    Doctor revokePermissionOfDoctor(Doctor doctor) throws DoctorException;

    Doctor grantPermissionOfDoctor(Doctor doctor) throws DoctorException;

    List<Doctor> getAllValidInValidDoctors(String key) throws DoctorException;

}
