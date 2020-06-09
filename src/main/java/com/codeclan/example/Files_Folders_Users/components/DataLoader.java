package com.codeclan.example.Files_Folders_Users.components;

import com.codeclan.example.Files_Folders_Users.models.File;
import com.codeclan.example.Files_Folders_Users.models.Folder;
import com.codeclan.example.Files_Folders_Users.models.User;
import com.codeclan.example.Files_Folders_Users.repository.FileRepository;
import com.codeclan.example.Files_Folders_Users.repository.FolderRepository;
import com.codeclan.example.Files_Folders_Users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User john = new User("John");
        userRepository.save(john);

        User roy = new User("Roy");
        userRepository.save(roy);

        User alice = new User("Alice");
        userRepository.save(alice);

        User grant = new User("Grant");
        userRepository.save(grant);

        User sophie = new User("Sophie");
        userRepository.save(sophie);



        Folder pics = new Folder("Pics", john);
        folderRepository.save(pics);

        Folder documents = new Folder("Documents", roy);
        folderRepository.save(documents);

        Folder downloads = new Folder("Downloads", alice);
        folderRepository.save(downloads);

        Folder music = new Folder("Music", grant);
        folderRepository.save(music);

        Folder movies = new Folder("Movies", sophie);
        folderRepository.save(movies);



        File pic1 = new File("IMG_0193", ".CR3", 12, pics);
        fileRepository.save(pic1);

        File pic2 = new File("IMG_0194", ".CR3", 11, pics);
        fileRepository.save(pic2);

        File pic3 = new File("IMG_0195", ".CR3", 14, pics);
        fileRepository.save(pic3);

        File pic4 = new File("IMG_0196", ".CR3", 13, pics);
        fileRepository.save(pic4);



        File cv = new File("My_CV", ".pages", 2, documents);
        fileRepository.save(cv);

        File recipe = new File("Lasagne Recipe", ".pdf", 1, documents);
        fileRepository.save(recipe);

        File taxes = new File("Tax 19/20", ".numbers", 4, documents);
        fileRepository.save(taxes);



        File adobe1 = new File("Flash_Installer", ".pkg", 28, downloads);
        fileRepository.save(adobe1);

        File adobe2 = new File("Flash_Installer1", ".pkg", 28, downloads);
        fileRepository.save(adobe2);

        File adobe3 = new File("Flash_Installer2", ".pkg", 28, downloads);
        fileRepository.save(adobe3);

        File adobe4 = new File("Flash_Installer3", ".pkg", 28, downloads);
        fileRepository.save(adobe4);

        File adobe5 = new File("Flash_Installer4", ".pkg", 28, downloads);
        fileRepository.save(adobe5);

        File adobe6 = new File("Flash_Installer5", ".pkg", 28, downloads);
        fileRepository.save(adobe6);



        File song1 = new File("Planet Telex", ".mp3", 4, music);
        fileRepository.save(song1);

        File song2 = new File("The Bends", ".mp3", 3, music);
        fileRepository.save(song2);

        File song3 = new File("High & Dry", ".mp3", 4, music);
        fileRepository.save(song3);

        File song4 = new File("Fake Plastic Trees", ".mp3", 5, music);
        fileRepository.save(song4);

        File song5 = new File("Bones", ".mp3", 4, music);
        fileRepository.save(song5);

        File song6 = new File("(Nice Dream)", ".mp3", 5, music);
        fileRepository.save(song6);

        File song7 = new File("Just", ".mp3", 6, music);
        fileRepository.save(song7);

        File song8 = new File("My Iron Lung", ".mp3", 3, music);
        fileRepository.save(song8);

        File song9 = new File("Bullet Proof...I Wish I Was", ".mp3", 5, music);
        fileRepository.save(song9);

        File song10 = new File("Black Star", ".mp3", 3, music);
        fileRepository.save(song10);

        File song11 = new File("Sulk", ".mp3", 5, music);
        fileRepository.save(song11);

        File song12 = new File("Street Spirit (Fade Out)", ".mp3", 6, music);
        fileRepository.save(song12);



        File film1 = new File("Interstellar", ".m4v", 2048, movies);
        fileRepository.save(film1);

        File film2 = new File("Shaun of the Dead", ".mkv", 1529, movies);
        fileRepository.save(film2);

        File film3 = new File("Hot Fuzz", ".m4v", 1398, movies);
        fileRepository.save(film3);

        File film4 = new File("The World's End", ".mp4", 1837, movies);
        fileRepository.save(film4);
    }
}
