package com.sarvesh.service;

import com.sarvesh.entity.Doctor;
import com.sarvesh.entity.Message;
import com.sarvesh.entity.Patient;
import com.sarvesh.exception.DoctorException;
import com.sarvesh.exception.PatientException;

import java.util.List;

public interface MessageService {

    Message sendMessageFromPatientToDoctor(String key, Message message) throws PatientException, DoctorException;

    Message sendMessageFromDoctorToPatient(String key, Message message) throws PatientException, DoctorException;

    List<Message> getMessageOfPatientParticularDoctor(String key, Doctor doctor) throws DoctorException, PatientException;

    List<Message> getMessageOfDoctorParticularPatient(String key, Patient patient) throws DoctorException, PatientException;

}
