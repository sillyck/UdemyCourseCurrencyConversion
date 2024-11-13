package com.jordiribellas.microservices.currency_conversion_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private double quantity;
	private double conversionMultiple;
	private double totalCalculatedAmount;
	private String enviorment;
}
