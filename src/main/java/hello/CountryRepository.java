package hello;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

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
    }

    public Country findCountry(String name) {
        Assert.notNull(name);

        Country result = null;

        for (Country country : countries) {
            if (name.equals(country.getName())) {
                result = country;
            }
        }

        return result;
    }

    public String addCountry(String name, String capital, Currency currency, int population){
        String result = "";
        if (countries.contains(findCountry(name))) {
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
        if (countries.contains(findCountry(name)))
        {
        countries.remove(findCountry(name));
            return true;
        }
        else {
            return false;
        }


    }

    public Country editCountry(String name, String capital, Currency currency, int population ) throws Exception {
        if (countries.contains(findCountry(name))) {
            for(Country country : countries) {
                if(country!=null && name.equals(country.getName()))
                    if (capital!=null) {
                        country.setCapital(capital);
                    }
                if (currency!=null) {
                    country.setCurrency(currency);
                }
                if (population!=0) {
                    country.setPopulation(population);
                }
            }
            return findCountry(name);
        }
        else {
            throw new Exception();
        }
    }




}