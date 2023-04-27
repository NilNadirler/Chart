package com.example.chart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chart.model.ChartData;

public interface ChartRepository extends JpaRepository<ChartData, Long> {

}
