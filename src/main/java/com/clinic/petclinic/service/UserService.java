package com.clinic.petclinic.service;

import com.clinic.petclinic.domain.User;

public interface UserService {

    User findUserByUsername(String username);

    void saveUser(User user);


}
