package com.codeforpratice.demo.repository;

import com.codeforpratice.demo.api.FrameDetection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddNewFrameRepo extends JpaRepository<FrameDetection, Integer> {
}
