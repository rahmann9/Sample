package com.wealthGuardian.services;

import com.wealthGuardian.models.User;
import com.wealthGuardian.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public User registerUser(User user) {
    // hash password logic
    return userRepository.save(user);
  }

  public User findUserByUsername(String username) {
    return userRepository.findByUsername(username);
  }

  public Optional<User> findUserById(Long id) {
    return userRepository.findById(id);
  }

  public User updateUser(User user) {
    return userRepository.save(user);
  }

  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }
}
