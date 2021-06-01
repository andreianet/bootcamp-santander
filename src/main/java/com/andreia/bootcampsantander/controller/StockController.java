package com.andreia.bootcampsantander.controller;

import com.andreia.bootcampsantander.dto.StockDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping (value = "/stock")
public class StockController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll(){
        List<StockDTO> list = new ArrayList<>();
        StockDTO dto = new StockDTO();
        dto.setId(1L);
        dto.setName("Santander");
        dto.setPrice(100D);
        dto.setVariation(10D);
        dto.setDate(LocalDate.now());
        list.add(dto);
        return ResponseEntity.ok(list);
    }
    @GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> findById(@PathVariable Long id){
        List<StockDTO> list = new ArrayList<>();
        StockDTO stockDTO = new StockDTO();
        stockDTO.setId(1L);
        stockDTO.setName("Santander");
        stockDTO.setPrice(100D);
        stockDTO.setVariation(10D);
        stockDTO.setDate(LocalDate.now());
        list.add(stockDTO);
        StockDTO dtoSelect = list.stream().filter(x->x.getId().compareTo(id) == 0).findFirst().get();
        return ResponseEntity.ok(dtoSelect);

    }


}
