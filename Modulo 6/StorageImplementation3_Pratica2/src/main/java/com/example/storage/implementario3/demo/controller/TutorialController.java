package com.example.storage.implementario3.demo.controller;

import com.example.storage.implementario3.demo.entity.Tutorial;
import com.example.storage.implementario3.demo.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.List;

@RequestMapping("/api")
@RestController
public class TutorialController {

    @Autowired
    TutorialService tutorialService;

    @PostMapping("tutorials")
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial, HttpServletRequest http){
        Tutorial newTutorial = tutorialService.createTutorial(tutorial);
        return ResponseEntity.created(URI.create(http.getRequestURI())).body(newTutorial);
    }

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> findAllTutorials(){
        List<Tutorial> allTutorial = tutorialService.findAllTutorials();
        return ResponseEntity.ok().body(allTutorial);
    }

    @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> findTutorialById(@PathVariable Long id){
        Tutorial tutorialById = tutorialService.findTutorialById(id);
        return ResponseEntity.ok().body(tutorialById);
    }

    @DeleteMapping("/tutorials")
    public ResponseEntity<String> deleteAllTutorials(){
        tutorialService.deleteAllTutorial();
        return ResponseEntity.ok().body("Todos tutoriais deletados");
    }

    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<String> deleteTutorialsById(@PathVariable Long id){
        tutorialService.deleteTutorialById(id);
        return ResponseEntity.ok().body("Tutorial solicitado foi deletado");
    }

    @PutMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable Long id, @RequestBody Tutorial tutorial){
        Tutorial newTutorial = tutorialService.updateTutorial(id, tutorial);
        return ResponseEntity.ok().body(newTutorial);
    }

    @GetMapping("/tutorials/published")
    public ResponseEntity<List<Tutorial>> findAllTutorialsPublished(){
        List<Tutorial> tutorialPublished = tutorialService.findAllTutorialsPublished();
        return ResponseEntity.ok().body(tutorialPublished);
    }

    @GetMapping("/tutorials/search")
    public ResponseEntity<List<Tutorial>> findTutorialByTitle(@RequestParam("title") String title){
        List<Tutorial>  listTutorialByTitle = tutorialService.findTutorialByTitle(title);
        return ResponseEntity.ok().body(listTutorialByTitle);
    }
}
