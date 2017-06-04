//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"result"}
)
@XmlRootElement(
        name = "deleteCountryResponse"
)
public class DeleteCountryResponse {

    protected boolean result;

    public DeleteCountryResponse() {
    }

    public boolean getResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
