package com.andreia.bootcampsantander.service;

import com.andreia.bootcampsantander.dto.StockDTO;
import com.andreia.bootcampsantander.entity.Stock;
import com.andreia.bootcampsantander.mapper.StockMapper;
import com.andreia.bootcampsantander.repository.StockRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private StockMapper stockMapper;

    public StockDTO save(StockDTO dto) {
        Stock stock = stockMapper.toEntity(dto);
        stockRepository.save(stock);
        return dto;
    }
}
