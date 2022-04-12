package com.example.storage.implementario3.demo.service;

import com.example.storage.implementario3.demo.entity.Tutorial;
import com.example.storage.implementario3.demo.repository.RepositoryTutorial;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialService implements ITutorialService {

    private final RepositoryTutorial repositoryTutorial;

    public TutorialService(RepositoryTutorial repositoryTutorial) {
        this.repositoryTutorial = repositoryTutorial;
    }


    @Override
    public Tutorial createTutorial(Tutorial tutorial) {
        repositoryTutorial.save(tutorial);
        return tutorial;
    }

    @Override
    public List<Tutorial> findAllTutorials() {
        return repositoryTutorial.findAll();
    }

    @Override
    public Tutorial findTutorialById(Long id) {
        return repositoryTutorial.findById(id)
                .orElseThrow(() -> new RuntimeException("Id do tutorial nao encontrado"));
    }

    @Override
    public Tutorial updateTutorial(Long id, Tutorial tutorial) {
        Tutorial updateTutorial = repositoryTutorial.findById(id)
                .orElseThrow(() -> new RuntimeException());
        updateTutorial.setTitulo(tutorial.getTitulo());
        updateTutorial.setDescricao(tutorial.getDescricao());
        updateTutorial.setSituacao(tutorial.getSituacao());
        repositoryTutorial.save(updateTutorial);
        return updateTutorial;
    }

    @Override
    public void deleteAllTutorial() {
        repositoryTutorial.deleteAll();
    }

    @Override
    public void deleteTutorialById(Long id) {
        repositoryTutorial.deleteById(id);
    }

    @Override
    public List<Tutorial> findAllTutorialsPublished() {
        return repositoryTutorial.tutorialBySituacao();
    }

    @Override
    public List<Tutorial> findTutorialByTitle(String title) {
        return repositoryTutorial.tutorialByTitle(title);
    }
}
