package com.andreia.bootcampsantander.service;

import com.andreia.bootcampsantander.dto.StockDTO;
import com.andreia.bootcampsantander.entity.Stock;
import com.andreia.bootcampsantander.exceptions.BusinessException;
import com.andreia.bootcampsantander.mapper.StockMapper;
import com.andreia.bootcampsantander.repository.StockRepository;
import com.andreia.bootcampsantander.util.MessageUtils;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private StockMapper stockMapper;

    @Transactional
    public StockDTO save(StockDTO dto) {
        Optional<Stock>optionalStock = stockRepository.findByNameAndDate(dto.getName(), dto.getDate());
        if (optionalStock.isPresent()){
            throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);
        }
        Stock stock = stockMapper.toEntity(dto);
        stockRepository.save(stock);
        return stockMapper.toDto(stock);
    }
}
