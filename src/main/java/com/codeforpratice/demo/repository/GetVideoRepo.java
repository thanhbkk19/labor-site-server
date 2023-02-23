package com.codeforpratice.demo.repository;

import com.codeforpratice.demo.api.FrameDetection;
import com.codeforpratice.demo.repository.Entity.FrameInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GetVideoRepo extends JpaRepository<FrameInfo,Integer> {
    @Query(value = "SELECT * FROM \"public\".\"VIDEOCAPTURE\" WHERE ID = ?)", nativeQuery = true)
    FrameDetection findVideo(Integer id);
}
