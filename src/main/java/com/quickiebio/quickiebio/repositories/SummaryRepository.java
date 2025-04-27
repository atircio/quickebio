package com.quickiebio.quickiebio.repositories;

import com.quickiebio.quickiebio.models.Summary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Long> {

}
