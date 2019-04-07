package com.spring.voter.datasource.repository;

import com.spring.voter.datasource.entity.Voting;
import org.springframework.data.repository.CrudRepository;

public interface VotingRepository extends CrudRepository<Voting, Long> {

}
