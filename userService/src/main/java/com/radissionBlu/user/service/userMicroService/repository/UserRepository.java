package com.radissionBlu.user.service.userMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.radissionBlu.user.service.userMicroService.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	// here we can write the custonm Query
	@Query(value = "SELECT * FROM User u where u.ID=:userId", nativeQuery = true)
	public User getByUserId(@Param("userId") String userId);

}
