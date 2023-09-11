package org.learning.courseinfo.custom_exceptions;

public class RepositoryException extends RuntimeException {

    public RepositoryException(String message, Exception e) {
        super(message, e);
    }
}
