package com.limitservice.controller;

import com.limitservice.data.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LimitController
{
    @Autowired
    private Limit limit;

    @GetMapping("/")
    public Limit returnlimits()
    {
        return new Limit(limit.getMaximum(), limit.getMinimum());
    }
}