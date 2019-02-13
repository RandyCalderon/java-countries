package com.lambdaschool.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class CountryAgeController {

    @RequestMapping("/age")
    public ArrayList<Country> medianAgeRange(@RequestParam(value="age") int age) {
        ArrayList<Country> ageRange = new ArrayList<>();

        CountriesApplication.mainCountryList.countryList.forEach(c -> {
            if(c.getCountryAge() >= age) {
                ageRange.add(c);
            }
        });
                return ageRange;
    }

    @RequestMapping("/min")
    public Country minAge() {
        CountriesApplication.mainCountryList.countryList.sort((c1, c2) -> c1.getCountryAge() - c2.getCountryAge());
        Country minAge = CountriesApplication.mainCountryList.countryList.get(0);

        return minAge;
    }

    @RequestMapping("/max")
    public Country maxAge() {
        CountriesApplication.mainCountryList.countryList.sort((c1, c2) -> c2.getCountryAge() - c1.getCountryAge());
        Country maxAge = CountriesApplication.mainCountryList.countryList.get(0);

        return maxAge;
    }
}
