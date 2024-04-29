package com.stky.kalendar.api.repo;

import com.stky.kalendar.api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {



}
