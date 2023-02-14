package com.codeforpratice.demo.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ControlSignal {
    Integer id;
    String region;
    String warning;
    String date;
}
