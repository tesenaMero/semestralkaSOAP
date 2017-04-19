//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hello;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"name","population","capital","currency"}
)
@XmlRootElement(
        name = "createCountryRequest",
        namespace="http://hello"
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
