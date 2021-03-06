package com.ms.learnapp.repository;

import com.ms.learnapp.domain.UserPoints;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the UserPoints entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UserPointsRepository extends MongoRepository<UserPoints, String> {

}
