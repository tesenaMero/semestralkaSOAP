//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hello;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(
        name = "currency"
)
@XmlEnum
public enum Currency {
    GBP,
    EUR,
    PLN,
    CNY,
    USD,
    CHF,
    NOK,
    JPY,
    HUF,
    HRK,
    RUB,
    DKK,
    SEK,
    CZK;

    private Currency() {
    }

    public String value() {
        return this.name();
    }

    public static Currency fromValue(String v) {
        return valueOf(v);
    }
}
