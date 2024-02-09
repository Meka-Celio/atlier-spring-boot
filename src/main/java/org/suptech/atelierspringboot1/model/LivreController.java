package org.suptech.atelierspringboot1.model;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/livre")
public class LivreController {
private final LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    // Add a new book
    @PostMapping
    public void addLivre(@RequestBody Livre livre) {
        livreService.addLivre(livre);
    }

    // Delete a book
    @DeleteMapping(path = "{livreId}")
    public void deleteLivre(@PathVariable("livreId") Long id) {
        livreService.deleteLivre(id);
    }

    // Update a book
    @PutMapping(path="{livreId}")
    public void updateLivre(@PathVariable("livreId") Long id, @RequestBody Livre livre) {
        livreService.updateLivre(id, livre);
    }

    // Get a book
    @GetMapping(path = "{livreId}")
    public Livre getLivre(@PathVariable("livreId") Long id) {
        return livreService.getLivre(id);
    }

    // Get all books
    @GetMapping
    public List<Livre> getLivres() {
        return livreService.getLivres();
    }

}
