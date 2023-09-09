package org.learning.courseinfo.cli;

import org.learning.courseinfo.cli.service.CourseRetrieverService;
import org.learning.courseinfo.cli.service.PluralsightCourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CourseRetriever {

    private static final Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);

    public static void main(String[] args) {
        LOG.info("CourseRetriever starting...");
        if (args.length == 0) {
            LOG.warn("Please provide an author name as first argument.");
            return;
        }

        try {
            retrieveCourse(args[0]);
        } catch (Exception ex) {
            LOG.error("Unexpected error", ex);
            ex.printStackTrace();
        }
    }

    private static void retrieveCourse(String authorId) {
        LOG.info("Retrieving courses for author {}", authorId);
        CourseRetrieverService courseRetrieverService = new CourseRetrieverService();
        List<PluralsightCourse> coursesToStore = courseRetrieverService.getCourseFor(authorId)
                .stream()
                .filter(course -> !course.isRetired())
                .toList();
        LOG.info("The following {} courses retrieved.", coursesToStore.size());
        coursesToStore.forEach(c -> LOG.info("{}", c));
    }
}
