//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.21 at 11:56:01 AM MESZ 
//


package de.og.orgdatenreader.orgd.strichdefinitionen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="STRICH_ART" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="STRICH_GILT_FUER_CODE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="STRICH_KEY" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="STRICH_MUSTER" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="STRICH_STAERKE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Format")
public class Format {

    @XmlAttribute(name = "STRICH_ART", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String strichart;
    @XmlAttribute(name = "STRICH_GILT_FUER_CODE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String strichgiltfuercode;
    @XmlAttribute(name = "STRICH_KEY", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String strichkey;
    @XmlAttribute(name = "STRICH_MUSTER", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String strichmuster;
    @XmlAttribute(name = "STRICH_STAERKE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String strichstaerke;

    /**
     * Gets the value of the strichart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRICHART() {
        return strichart;
    }

    /**
     * Sets the value of the strichart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRICHART(String value) {
        this.strichart = value;
    }

    /**
     * Gets the value of the strichgiltfuercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRICHGILTFUERCODE() {
        return strichgiltfuercode;
    }

    /**
     * Sets the value of the strichgiltfuercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRICHGILTFUERCODE(String value) {
        this.strichgiltfuercode = value;
    }

    /**
     * Gets the value of the strichkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRICHKEY() {
        return strichkey;
    }

    /**
     * Sets the value of the strichkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRICHKEY(String value) {
        this.strichkey = value;
    }

    /**
     * Gets the value of the strichmuster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRICHMUSTER() {
        return strichmuster;
    }

    /**
     * Sets the value of the strichmuster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRICHMUSTER(String value) {
        this.strichmuster = value;
    }

    /**
     * Gets the value of the strichstaerke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRICHSTAERKE() {
        return strichstaerke;
    }

    /**
     * Sets the value of the strichstaerke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRICHSTAERKE(String value) {
        this.strichstaerke = value;
    }

}
