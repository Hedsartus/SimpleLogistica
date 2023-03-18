package ru.konsystem.simplelogistics.exceptions;

import org.springframework.http.HttpStatus;

public interface CloudApiExceptions {
    HttpStatus getStatus();
    String getMessage();
}
