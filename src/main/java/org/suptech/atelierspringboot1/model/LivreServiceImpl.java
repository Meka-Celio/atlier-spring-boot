package org.suptech.atelierspringboot1.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreService{

    private final LivreRepository livreRepository;

    public LivreServiceImpl(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    @Override
    public void addLivre(Livre livre) {

    }

    @Override
    public void deleteLivre(Long id) {

    }

    @Override
    public void updateLivre(Long id, Livre livre) {

    }

    @Override
    public Livre getLivre(Long id) {
        return null;
    }

    @Override
    public List<Livre> getLivres() {
        return null;
    }
}
