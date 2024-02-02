package com.microservice.user.services;

import com.microservice.user.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users findById(long id) {
        return null;
    }

    @Override
    public Users saveUser(Users user) {
        return null;
    }

    @Override
    public boolean deleteUser(long id) {
        return false;
    }

    @Override
    public Users updateUser(long id, Users user) {
        return null;
    }
}
