package org.learning.courseinfo.cli.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PluralsightCourse(String title, String duration, String level, boolean isRetired) {
}
