package org.learning.courseinfo.repository;

import org.h2.jdbcx.JdbcDataSource;
import org.learning.courseinfo.custom_exceptions.RepositoryException;
import org.learning.courseinfo.domain.Course;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CourseJDBCRepository implements CourseRepository {

    private static final String H2_DB_URL = "jdbc:h2:file:%s;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM './db_init.sql'";
    private static final String INSERT_COURSE = "MERGE INTO Courses (title, level) VALUES (?, ?)";
    private final DataSource dataSource;

    public CourseJDBCRepository(String dbFile) {
        JdbcDataSource jdbcDataSource = new JdbcDataSource();
        jdbcDataSource.setURL(H2_DB_URL.formatted(dbFile));
        dataSource = jdbcDataSource;
    }

    @Override
    public void saveCourse(Course course) {
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(INSERT_COURSE);
            statement.setString(1, course.title());
            statement.setString(2, course.level());
            statement.execute();
        } catch (SQLException e) {
            throw new RepositoryException("message", e);
        }

    }

    @Override
    public List<Course> getAllCourses() throws RepositoryException {
        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM COURSES");

            List<Course> courses = new ArrayList<>();
            while (resultSet.next()) {
                Course course = new Course(resultSet.getString(1), resultSet.getString(2));
                courses.add(course);
            }
            return Collections.unmodifiableList(courses);
        } catch (SQLException e) {
            throw new RepositoryException("Failed to retrieve courses", e);
        }
    }
}
