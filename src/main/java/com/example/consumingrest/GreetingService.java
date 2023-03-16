package com.example.consumingrest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;

@Service
public class GreetingService {
    RestTemplate restTemplate = new RestTemplate();
    public  PopulationQuote[] getPopulationQuote() {

        PopulationQuote[] quote = restTemplate.getForObject(
                "https://analisi.transparenciacatalunya.cat/resource/b4rr-d25b.json", PopulationQuote[].class);
        return quote;

    }
}
