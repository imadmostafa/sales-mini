package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Sale;
import com.models.SaleRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Sale createSale(Sale sale) {
        // Implement creation logic, including transactions
        // Calculate and set the total for the sale
        return saleRepository.save(sale);
    }

    public Sale updateSale(Long id, Sale updatedSale) {
        // Implement update logic for quantities and prices
    //    log.debug("Updating sale with ID {}: {}", id, updatedSale);

        // Update the total for the sale
        return saleRepository.save(updatedSale);
    }
}
