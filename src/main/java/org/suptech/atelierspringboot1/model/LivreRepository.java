package org.suptech.atelierspringboot1.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    @Override
    Optional<Livre> findById(Long aLong);
}
