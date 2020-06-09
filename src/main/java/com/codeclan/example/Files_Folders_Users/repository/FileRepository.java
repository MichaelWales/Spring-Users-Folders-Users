package com.codeclan.example.Files_Folders_Users.repository;

import com.codeclan.example.Files_Folders_Users.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
