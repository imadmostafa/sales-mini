package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.Sale;
import com.service.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    // Get all sales
    @GetMapping
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    // Create a new sale with multiple transactions
    @PostMapping
    public Sale createSale(@RequestBody Sale sale) {
        return saleService.createSale(sale);
    }

    // Edit quantities and prices of the sale
    @PutMapping("/{id}")
    public Sale updateSale(@PathVariable Long id, @RequestBody Sale updatedSale) {
        return saleService.updateSale(id, updatedSale);
    }
}
