//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package io.spring.guides.gs_producing_web_service;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"name","population","capital","currency"}
)
@XmlRootElement(
        name = "createCountryRequest"
)
public class CreateCountryRequest {

    protected String name;
    protected int population;
    protected String capital;
    protected Currency currency;


    public CreateCountryRequest() {
    }

    public String getName() {
        return this.name;
    }
    public Currency getCurrency() { return this.currency; }
    public int getPopulation() {
        return this.population;
    }
    public String getCapital() {
        return this.capital;
    }
}
