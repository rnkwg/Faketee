package com.konai.kurong.faketee.vacation.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class VacRequestService {

    private final VacTypeService vacTypeService;

}