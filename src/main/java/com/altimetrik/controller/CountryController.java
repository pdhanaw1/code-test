package com.altimetrik.controller;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;



@Controller()
@RequestMapping("/api")
@Validated
public class CountryController {
	
	@Autowired(required = true)
	RestTemplate restTemplate;
	
	@GetMapping(value = "/countries" , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?> getAllCountries() throws Exception{
	
		Object[] countries = restTemplate.getForObject("http://api.worldbank.org/v2/country?format=json", Object[].class);	
		return new ResponseEntity<>(countries , HttpStatus.OK);
	}
	
	@GetMapping(value = "/countryInfo/{countryCode}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?> getCountryInfo(@PathVariable("countryCode") @Size(min = 1) String countryCode) {
		System.out.println("countrycode provided by user " + countryCode );

			try {
				Object[] countries = restTemplate.getForObject("http://api.worldbank.org/v2/country/" + countryCode + "?format=json", Object[].class);		
				
				return new ResponseEntity<>(countries , HttpStatus.CREATED);
			}catch (HttpClientErrorException | HttpServerErrorException httpClientOrServerExc) {

			    if(HttpStatus.NOT_FOUND.equals(httpClientOrServerExc.getStatusCode())) {
					throw new CustomExceptionMessage("ID not found ");
			    }
		    else {
				throw new CustomExceptionMessage("Internal Server Error");
			}
		}
	}
}
