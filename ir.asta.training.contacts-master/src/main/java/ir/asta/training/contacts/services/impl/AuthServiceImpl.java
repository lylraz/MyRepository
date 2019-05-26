package ir.asta.training.contacts.services.impl;

import ir.asta.training.contacts.entities.UserEntity;
import ir.asta.training.contacts.manager.AuthManager;
import ir.asta.training.contacts.services.AuthService;
import ir.asta.wise.core.datamanagement.ActionResult;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Named("authService")
public class AuthServiceImpl implements AuthService {
    @Inject
    private AuthManager manager;
    @Override
    public ActionResult<UserEntity> register(String fName, String lName, String email, String password ,String rePassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return manager.register(fName, lName, email, password, rePassword);
    }

    @Override
    public ActionResult<UserEntity> login(String email, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return manager.login(email, password);
    }
}
