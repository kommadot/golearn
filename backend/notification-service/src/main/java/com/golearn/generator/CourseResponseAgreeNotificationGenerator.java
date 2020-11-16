package com.golearn.generator;

import com.golearn.client.CourseRestClient;
import com.golearn.model.Notification;
import com.golearn.model.VideoRequestResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Data
@Component
public class CourseResponseAgreeNotificationGenerator implements NotificationGenerator {
    private int type = 6;
    private final CourseRestClient courseRestClient;

    CourseResponseAgreeNotificationGenerator(CourseRestClient courseRestClient) {
        this.courseRestClient = courseRestClient;
    }

    @Override
    public List<Integer> generate(Notification notification) {
        VideoRequestResponse videoRequestResponse = courseRestClient.getVideoRequest(notification.getDest());
        List<Integer> list = new LinkedList<>();
        list.add(videoRequestResponse.getMbrReqNo());
        return list;
    }
}
