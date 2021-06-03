package com.andreia.bootcampsantander.mapper;

import com.andreia.bootcampsantander.dto.StockDTO;
import com.andreia.bootcampsantander.entity.Stock;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {
    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;
    }
}
