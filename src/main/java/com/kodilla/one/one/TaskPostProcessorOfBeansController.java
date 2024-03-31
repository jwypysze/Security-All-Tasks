package com.kodilla.one.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskPostProcessorOfBeansController {

    private final LibraryManager libraryManager;

    public TaskPostProcessorOfBeansController(LibraryManager libraryManager) {
        this.libraryManager = libraryManager;
    }


    @ResponseBody
    @RequestMapping(path = "beanlifecycle/create", method = RequestMethod.GET)
    public LibraryManager create() {
        return new LibraryManager();
    }

}