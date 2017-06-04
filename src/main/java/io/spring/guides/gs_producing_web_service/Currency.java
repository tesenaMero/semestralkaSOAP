//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(
        name = "currency"
)
@XmlEnum
public enum Currency {
    GBP("GBP"),
    EUR("EUR"),
    PLN("PLN"),
    CNY("CNY"),
    USD("USD"),
    CHF("CHF"),
    NOK("NOK"),
    JPY("JPY"),
    HUF("HUF"),
    HRK("HRK"),
    RUB("RUB"),
    DKK("DKK"),
    SEK("SEK"),
    CZK("CZK");

    private final String code;

    static public boolean isMember(Currency aName) {
        Currency[] aCurrencies = Currency.values();
        for (Currency aCurrency : aCurrencies)
            if (aCurrency.equals(aName))
                return true;
        return false;
    }

    private Currency(String code) {
        this.code = code;
    }

    public String value() {
        return this.name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }
}
