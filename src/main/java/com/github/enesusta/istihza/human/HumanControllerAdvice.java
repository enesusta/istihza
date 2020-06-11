package com.github.enesusta.istihza.human;

import com.github.enesusta.istihza.human.exception.HumanNotFoundException;
import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = HumanController.class)
public class HumanControllerAdvice {

    private final static Logger logger = Logger.getLogger(HumanControllerAdvice.class);

    @ExceptionHandler(HumanNotFoundException.class)
    public ResponseEntity<String> handleHumanNotFoundException(HumanNotFoundException e) {
        logger.error(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

}
