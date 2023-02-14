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
    public FrameDetection getLatestVideo(@PathVariable Integer videoID) {
        return getVideoApplication.getLatestVideo(videoID);
    }
}
