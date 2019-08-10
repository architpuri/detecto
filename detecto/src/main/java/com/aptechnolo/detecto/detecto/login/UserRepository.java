package com.aptechnolo.detecto.detecto.login;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer>{
	
	@Query("SELECT p from User p where LOWER(p.userName) = LOWER(:userName)")
	public Optional<User> findUserByUserName(@Param("userName")String userName);

}
