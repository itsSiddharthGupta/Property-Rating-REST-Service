package com.example.propertyrating.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserAuth, Integer> {
	public boolean existsByEmailAndPassword(String email, String password);
}
