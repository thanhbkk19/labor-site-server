package com.codeforpratice.demo.application;

import com.codeforpratice.demo.api.FrameDetection;
import com.codeforpratice.demo.repository.GetVideoRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetVideoApplication {
    private final GetVideoRepo getVideoRepo;
    public FrameDetection getLatestVideo(Integer id) {
        return getVideoRepo.findVideo(id);
    }
}
