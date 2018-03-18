package com.headhunt.managementportal.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
class HeadHuntExceptionHandler {
    
    @ExceptionHandler(Exception.class)
    public ModelAndView handleHeadHuntError(Exception ex) {
    	ModelAndView modelAndView = new ModelAndView("HeadHuntError");
        modelAndView.addObject("results", ex.toString());
        return modelAndView;
    }
}