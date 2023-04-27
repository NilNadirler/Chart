package com.example.chart.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chart.service.ChartService;

@RestController
@CrossOrigin(maxAge = 3600)
public class ChartController {

    @Autowired
    ChartService chartService;

    @GetMapping("api/chart/findAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.chartService.getAll());
    }
}
