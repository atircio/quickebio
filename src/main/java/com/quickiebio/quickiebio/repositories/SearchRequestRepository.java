package com.quickiebio.quickiebio.repositories;

import com.quickiebio.quickiebio.models.SearchRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRequestRepository extends JpaRepository<SearchRequest, Long> {

}
