package com.sparta.schedule.controller;


import com.sparta.schedule.dto.ScheduleCreateRequest;
import com.sparta.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")

@RequiredArgsConstructor

public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody ScheduleCreateRequest request){

        Long id = scheduleService.create(request);
        return ResponseEntity.ok("Schedule created");


    }
}
