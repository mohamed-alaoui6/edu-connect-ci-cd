package com.example.videotest.client;

import com.example.videotest.models.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "COURSE-SERVICE")
public interface CourseClient {

    @GetMapping("/Course/{id}")
    Course TeacherById(@PathVariable Long id);
}
