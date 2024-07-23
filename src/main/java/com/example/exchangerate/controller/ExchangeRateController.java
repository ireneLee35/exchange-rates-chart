package com.example.exchangerate.controller;

import com.example.exchangerate.domain.ExchangeRate;
import com.example.exchangerate.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    @GetMapping("/rates")
    public Map<String, Object> getExchangeRates() {
        return exchangeRateService.fetchExchangeRates();
    }
}