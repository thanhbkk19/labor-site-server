
package com.codeforpratice.demo.repository.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="VIDEOCAPTURE",schema = "public")
public class FrameInfo {

    @Id
    @GeneratedValue
    @Column(name="FRAME_ID")
    private Integer frameID;

    @Column(name="PERSON_LIST")
    private String[] personList;

    @Column(name="ACTION_LIST")
    private String[] actionList;

    @Column(name="BOUNDING_BOX")
    private String[] bb;
}
