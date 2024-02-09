package org.suptech.atelierspringboot1.model;

import java.util.List;

public interface LivreService {
    void addLivre(Livre livre);
    void deleteLivre(Long id);
    void updateLivre (Long id, Livre livre);
    Livre getLivre(Long id);
    List<Livre> getLivres();
}
