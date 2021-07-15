package com.currency_caluculation_service.controller;
import com.currency_caluculation_service.data.CurrencyCaluculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyCaluculationController
{
    RestTemplate restTemplate = new RestTemplate();
/*
    @Autowired
    private RestTemplate restTemplate;
*/

    @GetMapping("/currency-caluculation/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyCaluculation currencyCaluculationAmount(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity)
    {
        System.out.println("got");
        Map<String,String> uriVariables=new HashMap<>();
        uriVariables.put("from",from);
        uriVariables.put("to",to);
         ResponseEntity<CurrencyCaluculation> responseEntity = restTemplate.getForEntity
                 ("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyCaluculation.class,uriVariables);
         CurrencyCaluculation response= responseEntity.getBody();
        return new CurrencyCaluculation(response.getId(),from,to,response.getConversionMultiple(), quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());


    }
}
