package com.example.chart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chart.model.ChartData;
import com.example.chart.repo.ChartRepository;

@Service
public class ChartService {
   
	 @Autowired
	 private ChartRepository chartDataRepository;

	  public List<ChartData> getAll() {
	        return this.chartDataRepository.findAll();
	    }
	
}
