package com.lambdaschool.countries;

import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class CountryPopulationController {

    @RequestMapping("/size")
    public ArrayList<Country> getCountryBySize(@RequestParam(value="people") int people) {
        ArrayList<Country> countryByPopulation = new ArrayList<>();

        CountriesApplication.mainCountryList.countryList.forEach(c -> {
            if(c.getPopulation() >= people) {
                countryByPopulation.add(c);
            }
        });

        return countryByPopulation;
    }

//    @RequestMapping("/max")
//    public ArrayList<Country> getMaxPopulation() {
//        ArrayList<Country> countryByMax = new ArrayList<>();
//        // Math.max() throws issues with reference?
//        CountriesApplication.mainCountryList.countryList.sort((c1, c2) -> Math.max(c2.getPopulation(),c1.getPopulation()));
//        CountriesApplication.mainCountryList.countryList.forEach(c -> {
//            if(CountriesApplication.mainCountryList.countryList.get(0) == c) {
//                countryByMax.add(c);
//            }
//        });
//
//        return countryByMax;
//    }

        @RequestMapping("/max")
    public ArrayList<Country> getMaxPopulation() {
        ArrayList<Country> countryByMax = new ArrayList<>();
        // Math.max() throws issues with reference?
        CountriesApplication.mainCountryList.countryList.sort((c1, c2) -> c2.getPopulation() - c1.getPopulation());
        CountriesApplication.mainCountryList.countryList.forEach(c -> {
            if(CountriesApplication.mainCountryList.countryList.get(0) == c) {
                countryByMax.add(c);
            }
        });

        return countryByMax;
    }


   @RequestMapping("/min")
   public ArrayList<Country> getMinPopulation() {
        ArrayList<Country> countryByMin = new ArrayList();
        CountriesApplication.mainCountryList.countryList.sort((c1, c2) -> c1.getPopulation() - c2.getPopulation());
       CountriesApplication.mainCountryList.countryList.forEach(c -> {
           if(CountriesApplication.mainCountryList.countryList.get(0) == c) {
               countryByMin.add(c);
           }
       });

       return countryByMin;
   }
}
