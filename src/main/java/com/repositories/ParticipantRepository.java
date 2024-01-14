package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
