package com.enigmagpt.learning.patternrecognitionwebapi.port.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController("/task")
class TaskController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(TaskDto taskDto) {
        log.info("create!");
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<TaskDto> getAll() {
        log.info("Get All tasks");
        return List.of();
    }
}
