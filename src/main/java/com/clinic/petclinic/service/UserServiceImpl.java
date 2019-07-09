package com.clinic.petclinic.service;

import com.clinic.petclinic.domain.Pet;
import com.clinic.petclinic.domain.Role;
import com.clinic.petclinic.domain.User;
import com.clinic.petclinic.repository.RoleRepository;
import com.clinic.petclinic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUsername(String username) { return userRepository.findByUsername(username); }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRole(user.getRole());
        userRepository.save(user);
    }




}
