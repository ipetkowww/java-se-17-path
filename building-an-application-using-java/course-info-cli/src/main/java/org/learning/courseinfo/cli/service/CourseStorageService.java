package org.learning.courseinfo.cli.service;

import org.learning.courseinfo.domain.Course;
import org.learning.courseinfo.repository.CourseRepository;

import java.util.List;

public class CourseStorageService {

    private final CourseRepository courseRepository;

    public CourseStorageService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void storePluralsightCourses(List<PluralsightCourse> courses) {
        for (PluralsightCourse course : courses) {
            Course c = new Course(course.title(), course.level());
            courseRepository.saveCourse(c);
        }
    }

}
