package com.codeforpratice.demo.application;

import com.codeforpratice.demo.api.FrameDetection;
import com.codeforpratice.demo.repository.GetVideoRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetVideoApplication {
    private final GetVideoRepo getVideoRepo;
    public FrameDetection getVideo(Integer id) {
        return getVideoRepo.findVideo(id);
    }
}
