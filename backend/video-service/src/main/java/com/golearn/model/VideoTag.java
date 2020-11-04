package com.golearn.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "gl_video_tag")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "vidTagNo")
public class VideoTag {
    @Id
    private int vidTagNo;

    @ManyToOne
    @JoinColumn(name="vid_no")
    private Video video;
    @ManyToOne
    @JoinColumn(name="tag_no")
    private Tag tag;

}
