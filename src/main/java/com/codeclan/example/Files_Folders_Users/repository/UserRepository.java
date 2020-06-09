package com.codeclan.example.Files_Folders_Users.repository;

import com.codeclan.example.Files_Folders_Users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
