package com.example.storage.implementario3.demo.repository;

import com.example.storage.implementario3.demo.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryTutorial extends JpaRepository<Tutorial, Long> {
    @Query("select t from Tutorial as t where t.situacao = true")
    List<Tutorial> tutorialBySituacao();

    @Query("select t from Tutorial as t where t.titulo = :title")
    List<Tutorial> tutorialByTitle(String title);
}
