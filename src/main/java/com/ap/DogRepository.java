package com.ap;

import com.ap.data.entities.DogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<DogEntity,Long> {
}
