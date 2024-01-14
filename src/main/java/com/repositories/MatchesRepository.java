package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entities.Matches;

public interface MatchesRepository extends JpaRepository<Matches, Integer> {

}
