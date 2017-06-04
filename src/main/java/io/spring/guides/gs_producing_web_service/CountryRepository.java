package io.spring.guides.gs_producing_web_service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.validation.constraints.Null;

@Component
public class CountryRepository {
    private static final List<Country> countries = new ArrayList<Country>();


    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.add(spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.add(poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.add(uk);


        Country china = new Country();
        china.setName("China");
        china.setCapital("Peking");
        china.setCurrency(Currency.CNY);
        china.setPopulation(1373541278);

        countries.add(china);
    }

    public Country findCountry(String name) {

        if (name.length()==0) {
            Assert.isTrue(1==2,"Name cant be empty");
        }

        Country result = null;

        for (Country country : countries) {
            if (name.equals(country.getName())) {
                result = country;
            }
        }
        if (result==null) {
            Assert.isTrue(1==2,"Country does not exist");
        }

        return result;
    }

    public boolean isCountryInTheList (String name) {
        for (Country country : countries) {
            if (name.equals(country.getName())) {
                return true;
            }
        }
        return false;
    }

    public String addCountry(String name, String capital, Currency currency, int population){
        if (name.length()==0) {
            Assert.isTrue(1==2,"Name cant be empty");
        }

        if (capital.length()==0) {
            Assert.isTrue(1==2,"Capital cant be empty");
        }


        if (population==0) {
            Assert.isTrue(1==2,"Population must be number and higher than 0");
        }
        if (!Currency.isMember(currency)) {
            Assert.isTrue(1==2,"Currency is not in the list");
        }


        String result = "";
        if (isCountryInTheList(name)) {
            result = "Country already exists";
            return result;
        }
        else {

            Country newCountry = new Country();
            newCountry.setName(name);
            newCountry.setCapital(capital);
            newCountry.setCurrency(currency);
            newCountry.setPopulation(population);
            countries.add(newCountry);
            result = "added";
            return result;
        }
    }


    public boolean deleteCountry(String name){
        if (name.length()==0) {
            Assert.isTrue(1==2,"Name cant be empty");
        }
        if (isCountryInTheList(name))
        {
        countries.remove(findCountry(name));
            return true;
        }
        else {
            return false;
        }


    }


    public Country editCountry(String name, String capital, Currency currency, int population ) throws Exception {
        if (name.length()==0) {
            Assert.isTrue(1==2,"Name cant be empty");
        }

        if (isCountryInTheList(name)) {
            Country editedCountry = findCountry(name);
            boolean editCapital = false;
            boolean editPopulation = false;
            boolean editCurrency = false;

            if (capital.length()!=0 && !capital.equals("?")) {
                editCapital = true;

            }
            if (population>0) {
                editPopulation = true;

            }
            else if (population==0)  {

            }
            else {
                Assert.isTrue(1==2,"Population must be higher than 0");
            }

            if (Currency.isMember(currency)) {
                editCurrency = true;

            }
            else {
                Assert.isTrue(1==2,"Currency is not in the list");
            }

            if (editCurrency && editPopulation && editCurrency) {
                editedCountry.setCapital(capital);
                editedCountry.setPopulation(population);
                editedCountry.setCurrency(currency);

            }





        }
        else {
            Assert.isTrue(1==2,"Country is not in the list");
        }


     return findCountry(name);
     }



}