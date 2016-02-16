//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.16 at 12:09:46 PM SGT 
//


package fuse.example.homeloan.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="nationalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bedroom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bathroom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="landSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="appraisedValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="infotype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nationalID",
    "address",
    "bedroom",
    "bathroom",
    "landSize",
    "appraisedValue"
})
@XmlRootElement(name = "HouseInfo")
public class HouseInfo {

    @XmlElement(required = true)
    protected String nationalID;
    @XmlElement(required = true)
    protected String address;
    protected int bedroom;
    protected int bathroom;
    protected int landSize;
    protected int appraisedValue;
    @XmlAttribute(name = "infotype")
    protected String infotype;

    /**
     * Gets the value of the nationalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalID() {
        return nationalID;
    }

    /**
     * Sets the value of the nationalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalID(String value) {
        this.nationalID = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the bedroom property.
     * 
     */
    public int getBedroom() {
        return bedroom;
    }

    /**
     * Sets the value of the bedroom property.
     * 
     */
    public void setBedroom(int value) {
        this.bedroom = value;
    }

    /**
     * Gets the value of the bathroom property.
     * 
     */
    public int getBathroom() {
        return bathroom;
    }

    /**
     * Sets the value of the bathroom property.
     * 
     */
    public void setBathroom(int value) {
        this.bathroom = value;
    }

    /**
     * Gets the value of the landSize property.
     * 
     */
    public int getLandSize() {
        return landSize;
    }

    /**
     * Sets the value of the landSize property.
     * 
     */
    public void setLandSize(int value) {
        this.landSize = value;
    }

    /**
     * Gets the value of the appraisedValue property.
     * 
     */
    public int getAppraisedValue() {
        return appraisedValue;
    }

    /**
     * Sets the value of the appraisedValue property.
     * 
     */
    public void setAppraisedValue(int value) {
        this.appraisedValue = value;
    }

    /**
     * Gets the value of the infotype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfotype() {
        return infotype;
    }

    /**
     * Sets the value of the infotype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfotype(String value) {
        this.infotype = value;
    }

}
