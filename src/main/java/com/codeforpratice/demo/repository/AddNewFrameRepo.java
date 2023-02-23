package com.codeforpratice.demo.repository;

import com.codeforpratice.demo.api.FrameDetection;
import com.codeforpratice.demo.repository.Entity.FrameInfo;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddNewFrameRepo extends JpaRepository<FrameInfo, Integer> {
}
