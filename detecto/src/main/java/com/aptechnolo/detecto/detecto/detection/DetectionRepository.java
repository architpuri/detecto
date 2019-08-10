package com.aptechnolo.detecto.detecto.detection;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DetectionRepository extends CrudRepository<Detection,Integer>{
	
	@Query("SELECT p from Detection p where p.userId = :userId")
	public Optional<List<Detection>> findDetectionsByUserId(@Param("userId")Integer userId);

}
