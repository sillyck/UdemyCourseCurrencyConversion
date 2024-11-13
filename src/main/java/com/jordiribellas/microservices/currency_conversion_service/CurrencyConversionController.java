package com.jordiribellas.microservices.currency_conversion_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion currencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable double quantity) {
		return new CurrencyConversion(10001L, from, to, quantity, 1.0, 1.0, "");
	}

}
