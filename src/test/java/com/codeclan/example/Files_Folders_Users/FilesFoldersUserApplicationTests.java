package com.codeclan.example.Files_Folders_Users;

import com.codeclan.example.Files_Folders_Users.models.File;
import com.codeclan.example.Files_Folders_Users.models.Folder;
import com.codeclan.example.Files_Folders_Users.models.User;
import com.codeclan.example.Files_Folders_Users.repository.FileRepository;
import com.codeclan.example.Files_Folders_Users.repository.FolderRepository;
import com.codeclan.example.Files_Folders_Users.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilesFoldersUserApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	FolderRepository folderRepository;
	
	@Autowired
	FileRepository fileRepository;
	
	@Test
	void contextLoads() {
	}

	@Test
	void canCreateUserAndFolderAndFileAndThenSave() {
		User john = new User("John");
		userRepository.save(john);
		Folder pics = new Folder("Pics", john);
		folderRepository.save(pics);
		File photo = new File("IMG_0193", ".CR3", 12, pics);
		fileRepository.save(photo);
	}
}
