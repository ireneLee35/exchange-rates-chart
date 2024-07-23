package com.example.exchangerate.service;

import com.example.exchangerate.domain.ExchangeRate;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExchangeRateService {

    public Map<String, Object> fetchExchangeRates() {
        String url = "https://www.esunbank.com/zh-tw/personal/deposit/rate/forex/foreign-exchange-rates";
        Map<String, Object> rates = new HashMap<>();
        try {
            Document doc = Jsoup.connect(url).get();
            Elements rows = doc.select("tbody.l-exchangeRate__table.result > tr");

            int count = 0;
            for (Element row : rows) {
                Elements cols = row.select("td.l-exchangeRate__table--inner");
                if (cols.size() >= 2) {
                    String currency = row.select("td.l-exchangeRate__table--title .title-item").get(1).text();
                    String rate = cols.get(0).select("div.BBoardRate").text();
                    rates.put(currency, rate);
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rates;
    }
}
