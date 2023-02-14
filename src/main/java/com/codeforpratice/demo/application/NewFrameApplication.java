package com.codeforpratice.demo.application;

import com.codeforpratice.demo.api.FrameDetection;
import com.codeforpratice.demo.repository.AddNewFrameRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NewFrameApplication {
    private final AddNewFrameRepo addNewFrameRepo;
    public void extractKeypoint(FrameDetection frameDetection) {
//        String[] keypoint = personKeyPoint.getKeypoint();
//        Integer rows = keypoint.length;
//        Integer cols = 4;
//        Integer[][] keypointArray = new Integer[rows][cols];
//        for (int personIndex = 0; personIndex<rows; personIndex++ ) {
//            String[] person = keypoint[personIndex].split(",");
//            for (int i = 0; i<cols; i++) {
//                keypointArray[personIndex][i] = Integer.parseInt(person[i]);
//            }
//        }
    };
    public void saveDB(FrameDetection frameDetection) {
        FrameDetection dataFrame = new FrameDetection(null, frameDetection.getPersonList(), frameDetection.getActionList(), frameDetection.getBbox());
        addNewFrameRepo.save(dataFrame);
    }
}
