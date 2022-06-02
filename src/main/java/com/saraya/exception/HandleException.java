package com.saraya.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@EnableWebMvc
public class HandleException {

    private Log logger = LogFactory.getLog(HandleException.class);

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(HttpServletRequest request, Exception ex) {
        logger.error("Request " + request.getRequestURL() + " throws exeption : \n" + ex);
        return "error";
    }
}
