package com.example.ecommercebackend.controller;

import com.example.ecommercebackend.model.payload.country.CountryPayloadResponse;
import com.example.ecommercebackend.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/countries")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200")
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    public ResponseEntity<List<CountryPayloadResponse>> getAllShippingCountries() {
        return ResponseEntity.status(OK)
                .body(countryService.findAllCountries());
    }
}