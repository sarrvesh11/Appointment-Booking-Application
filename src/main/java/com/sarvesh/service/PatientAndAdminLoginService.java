package com.sarvesh.service;

import com.sarvesh.entity.LoginDTO;
import com.sarvesh.entity.LoginUUIDKey;
import com.sarvesh.exception.LoginException;

public interface PatientAndAdminLoginService {

     LoginUUIDKey logIntoAccount(LoginDTO loginDTO) throws LoginException;

     String logoutFromAccount(String key) throws LoginException;

     Boolean checkUserLoginOrNot(String key) throws LoginException;

}