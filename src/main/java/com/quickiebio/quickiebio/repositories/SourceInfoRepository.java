package com.quickiebio.quickiebio.repositories;

import com.quickiebio.quickiebio.models.SourceInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceInfoRepository extends JpaRepository<SourceInfo, Long> {
}
