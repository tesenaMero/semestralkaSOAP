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
        propOrder = {"name"}
)
@XmlRootElement(
        name = "deleteCountryRequest",
        namespace="http://hello"
)
public class DeleteCountryRequest {

    protected String name;

    public DeleteCountryRequest() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
