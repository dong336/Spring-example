package com.example.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	// // query method
	// User findByNo(int no);
	
	// // native query
	// @Query(name = "User.findUserBySiteid", nativeQuery = true)
	// List<Map<String, Object>> findUserBySiteid(@Param("siteid") String siteid);
}
