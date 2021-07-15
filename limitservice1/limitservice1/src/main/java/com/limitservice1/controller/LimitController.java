package com.limitservice1.controller;

import com.limitservice1.Entity.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController
{
    @Autowired
    private Limit limitvalues;

    @GetMapping("/")
    public Limit limitconfiguration()
    {
        return new Limit(limitvalues.getMaximum(),limitvalues.getMinimum());
        //return new Limit(100,1);
    }
}