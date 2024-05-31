package com.sparta.schedule.service;

import com.sparta.schedule.dto.ScheduleCreateRequest;
import com.sparta.schedule.model.Schedule;
import com.sparta.schedule.repository.ScheduleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ScheduleService {

    private final ScheduleRepository repository;



    public Long create(ScheduleCreateRequest request) {

        Schedule schedule = new Schedule(request.getTitle(),
                request.getDescription(),
                request.getPassword(),
                request.getManager()
        );

        repository.save(schedule).getId();


        return null;
    }

    }



