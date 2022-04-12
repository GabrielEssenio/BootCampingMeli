package com.example.storage.implementario3.demo.service;

import com.example.storage.implementario3.demo.entity.Tutorial;

import java.util.List;
import java.util.Optional;

public interface ITutorialService {
    Tutorial createTutorial(Tutorial tutorial);
    List<Tutorial> findAllTutorials();
    Tutorial findTutorialById(Long id);
    Tutorial updateTutorial(Long id, Tutorial tutorial);
    void deleteAllTutorial();
    void deleteTutorialById(Long id);
    List<Tutorial> findAllTutorialsPublished();
    List<Tutorial> findTutorialByTitle(String title);
}
