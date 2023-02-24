package com.codeforpratice.demo.controller;

import com.codeforpratice.demo.api.FrameDetection;
import com.codeforpratice.demo.application.GetVideoApplication;
import com.codeforpratice.demo.application.NewFrameApplication;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AddNewFrame {
    private final NewFrameApplication newFrameApplication;
    private final GetVideoApplication getVideoApplication;

    @PostMapping("/addinfo")
    public void insertFrameInfo(@RequestBody FrameDetection frameDetection) {
        newFrameApplication.saveDB(frameDetection);
    }
    @GetMapping("/getlatestvideo/{videoID}")
    public FrameDetection getVideo(@PathVariable Integer videoID) {
        return getVideoApplication.getVideo(videoID);
    }

    @GetMapping("/getlatestvideo")
    public FrameDetection getLatestVideo() {
        return getVideoApplication.getVideo(1);
    }
}
