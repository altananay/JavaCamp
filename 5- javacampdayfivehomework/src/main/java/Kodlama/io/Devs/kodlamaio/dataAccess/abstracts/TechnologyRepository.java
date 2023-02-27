package Kodlama.io.Devs.kodlamaio.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.kodlamaio.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}