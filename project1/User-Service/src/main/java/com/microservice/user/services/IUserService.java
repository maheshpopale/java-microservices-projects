package com.microservice.user.services;

import com.microservice.user.model.Users;

import java.util.List;

public interface IUserService {

    public List<Users> findAll();
    public Users findById(long id);
    public Users saveUser(Users user);
    public boolean deleteUser(long id);
    public Users updateUser(long id,Users user);
}
