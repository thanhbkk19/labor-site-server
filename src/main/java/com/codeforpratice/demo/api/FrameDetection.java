package com.codeforpratice.demo.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FrameDetection {
    Integer id;
    String[] personList;
    String[] actionList;
    String[] Bbox;
}
