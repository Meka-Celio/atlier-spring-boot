package org.suptech.atelierspringboot1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Livre {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
private String titre;
private String auteur;
private String isbn;
}
