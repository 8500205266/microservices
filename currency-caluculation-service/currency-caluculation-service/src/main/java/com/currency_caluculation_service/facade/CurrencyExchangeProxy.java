package com.currency_caluculation_service.facade;

import com.currency_caluculation_service.data.CurrencyCaluculation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service")
//@RiibonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy
{
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyCaluculation currencyExchange(@PathVariable String from, @PathVariable String to);
}
