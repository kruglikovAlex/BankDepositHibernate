//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.30 at 10:56:17 PM MSK 
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
 *         &lt;element name="bankDepositors" type="{http://bank.brest.com/soap}bankDepositors"/>
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
    "bankDepositors"
})
@XmlRootElement(name = "getBankDepositorsResponse")
public class GetBankDepositorsResponse {

    @XmlElement(required = true)
    protected BankDepositors bankDepositors;

    /**
     * Gets the value of the bankDepositors property.
     * 
     * @return
     *     possible object is
     *     {@link BankDepositors }
     *     
     */
    public BankDepositors getBankDepositors() {
        return bankDepositors;
    }

    /**
     * Sets the value of the bankDepositors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankDepositors }
     *     
     */
    public void setBankDepositors(BankDepositors value) {
        this.bankDepositors = value;
    }

}
