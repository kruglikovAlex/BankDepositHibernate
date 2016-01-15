//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.16 at 12:35:54 AM MSK 
//


package com.brest.bank.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bankDepositor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankDepositor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="depositorName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Z][a-z]+[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depositorDateDeposit" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="depositorAmountDeposit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depositorAmountPlusDeposit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depositorAmountMinusDeposit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="depositorDateReturnDeposit" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="depositorMarkReturnDeposit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;pattern value="[0,1]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankDepositor", propOrder = {
    "depositorId",
    "depositorName",
    "depositorDateDeposit",
    "depositorAmountDeposit",
    "depositorAmountPlusDeposit",
    "depositorAmountMinusDeposit",
    "depositorDateReturnDeposit",
    "depositorMarkReturnDeposit"
})
public class BankDepositor {

    protected long depositorId;
    @XmlElement(required = true)
    protected String depositorName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depositorDateDeposit;
    protected int depositorAmountDeposit;
    protected int depositorAmountPlusDeposit;
    protected int depositorAmountMinusDeposit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depositorDateReturnDeposit;
    protected int depositorMarkReturnDeposit;

    /**
     * Gets the value of the depositorId property.
     * 
     */
    public long getDepositorId() {
        return depositorId;
    }

    /**
     * Sets the value of the depositorId property.
     * 
     */
    public void setDepositorId(long value) {
        this.depositorId = value;
    }

    /**
     * Gets the value of the depositorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositorName() {
        return depositorName;
    }

    /**
     * Sets the value of the depositorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositorName(String value) {
        this.depositorName = value;
    }

    /**
     * Gets the value of the depositorDateDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositorDateDeposit() {
        return depositorDateDeposit;
    }

    /**
     * Sets the value of the depositorDateDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositorDateDeposit(XMLGregorianCalendar value) {
        this.depositorDateDeposit = value;
    }

    /**
     * Gets the value of the depositorAmountDeposit property.
     * 
     */
    public int getDepositorAmountDeposit() {
        return depositorAmountDeposit;
    }

    /**
     * Sets the value of the depositorAmountDeposit property.
     * 
     */
    public void setDepositorAmountDeposit(int value) {
        this.depositorAmountDeposit = value;
    }

    /**
     * Gets the value of the depositorAmountPlusDeposit property.
     * 
     */
    public int getDepositorAmountPlusDeposit() {
        return depositorAmountPlusDeposit;
    }

    /**
     * Sets the value of the depositorAmountPlusDeposit property.
     * 
     */
    public void setDepositorAmountPlusDeposit(int value) {
        this.depositorAmountPlusDeposit = value;
    }

    /**
     * Gets the value of the depositorAmountMinusDeposit property.
     * 
     */
    public int getDepositorAmountMinusDeposit() {
        return depositorAmountMinusDeposit;
    }

    /**
     * Sets the value of the depositorAmountMinusDeposit property.
     * 
     */
    public void setDepositorAmountMinusDeposit(int value) {
        this.depositorAmountMinusDeposit = value;
    }

    /**
     * Gets the value of the depositorDateReturnDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositorDateReturnDeposit() {
        return depositorDateReturnDeposit;
    }

    /**
     * Sets the value of the depositorDateReturnDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositorDateReturnDeposit(XMLGregorianCalendar value) {
        this.depositorDateReturnDeposit = value;
    }

    /**
     * Gets the value of the depositorMarkReturnDeposit property.
     * 
     */
    public int getDepositorMarkReturnDeposit() {
        return depositorMarkReturnDeposit;
    }

    /**
     * Sets the value of the depositorMarkReturnDeposit property.
     * 
     */
    public void setDepositorMarkReturnDeposit(int value) {
        this.depositorMarkReturnDeposit = value;
    }

}
