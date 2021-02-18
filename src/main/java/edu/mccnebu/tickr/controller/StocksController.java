package edu.mccnebu.tickr.controller;

import edu.mccnebu.tickr.AlpacaService;
import edu.mccnebu.tickr.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StocksController {
    @Autowired
    private AlpacaService alpacaService;

    @GetMapping(value = "/{symbol}")
    public void getQuote(@PathVariable String symbol) {
        alpacaService.getLastQuote(symbol);
    }
}