//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.18 at 02:12:55 AM MSK 
//


package com.brest.bank.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankDepositsReport" type="{http://bank.brest.com/soap}bankDepositsReport"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bankDepositsReport"
})
@XmlRootElement(name = "getBankDepositsWithDepositorsResponse")
public class GetBankDepositsWithDepositorsResponse {

    @XmlElement(required = true)
    protected BankDepositsReport bankDepositsReport;

    /**
     * Gets the value of the bankDepositsReport property.
     * 
     * @return
     *     possible object is
     *     {@link BankDepositsReport }
     *     
     */
    public BankDepositsReport getBankDepositsReport() {
        return bankDepositsReport;
    }

    /**
     * Sets the value of the bankDepositsReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankDepositsReport }
     *     
     */
    public void setBankDepositsReport(BankDepositsReport value) {
        this.bankDepositsReport = value;
    }

}
