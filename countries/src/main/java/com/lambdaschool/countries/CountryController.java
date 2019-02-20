package com.lambdaschool.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryController {

    @RequestMapping("/all")
    public ArrayList<Country> getAllNames() {
        CountriesApplication.mainCountryList.countryList.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
        return CountriesApplication.mainCountryList.countryList;
    }

    @RequestMapping("/begin")
    public ArrayList<Country> getByLetter(@RequestParam(value="letter") char letter) {
        ArrayList<Country> countriesByLetter = new ArrayList<>();

        CountriesApplication.mainCountryList.countryList.forEach(c -> {
            if(c.getCountryName().toLowerCase().charAt(0) == letter) {
                countriesByLetter.add(c);
            }
        });
        return countriesByLetter;
    }

    @RequestMapping("/size")
    public Country getBySize(@RequestParam(value="letters") int size) {
        ArrayList<Country> countriesBySize = new ArrayList<>();

        CountriesApplication.mainCountryList.countryList.forEach(c -> {
            if(c.getCountryName().length() == size) {
                countriesBySize.add(c);
            }
        });

        Country maxCountry = countriesBySize.get(0);

        return maxCountry;
    }

}
