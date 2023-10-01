package com.geekster.Event_Management.Repo;

import com.geekster.Event_Management.Model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends CrudRepository<Event,Long> {
}
