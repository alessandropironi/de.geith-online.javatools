//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.21 at 11:56:05 AM MESZ 
//


package de.og.orgdatenreader.infra.abschnittsgrenzknoten;

import java.math.BigInteger;
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
 *       &lt;attribute name="ABGRKN_BF_GRENZKM" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ABGRKN_GLEISKENNZEICHEN" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ABGRKN_KM_UEBERLAENGE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ABGRKN_ORIENTIERUNG" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ABGRKN_POSITION_X" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ABGRKN_POSITION_X_LEIDAS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ABGRKN_POSITION_Y" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ABGRKN_POSITION_Y_LEIDAS" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ABGRKN_TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="KWENDEL_ELEMENTNAME" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SPLKN_KEY" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SPLKN_KEY_IST_PARTNER_VON" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STRABSCH_KEY" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="WANFANG_BAUART" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ZNMA_KEY" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ABSCHNITTSGRENZKNOTEN")
public class ABSCHNITTSGRENZKNOTEN {

    @XmlAttribute(name = "ABGRKN_BF_GRENZKM", required = true)
    protected BigInteger abgrknbfgrenzkm;
    @XmlAttribute(name = "ABGRKN_GLEISKENNZEICHEN", required = true)
    protected BigInteger abgrkngleiskennzeichen;
    @XmlAttribute(name = "ABGRKN_KM_UEBERLAENGE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String abgrknkmueberlaenge;
    @XmlAttribute(name = "ABGRKN_ORIENTIERUNG", required = true)
    protected BigInteger abgrknorientierung;
    @XmlAttribute(name = "ABGRKN_POSITION_X", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String abgrknpositionx;
    @XmlAttribute(name = "ABGRKN_POSITION_X_LEIDAS", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String abgrknpositionxleidas;
    @XmlAttribute(name = "ABGRKN_POSITION_Y", required = true)
    protected BigInteger abgrknpositiony;
    @XmlAttribute(name = "ABGRKN_POSITION_Y_LEIDAS", required = true)
    protected BigInteger abgrknpositionyleidas;
    @XmlAttribute(name = "ABGRKN_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String abgrkntype;
    @XmlAttribute(name = "KWENDEL_ELEMENTNAME", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String kwendelelementname;
    @XmlAttribute(name = "SPLKN_KEY", required = true)
    protected BigInteger splknkey;
    @XmlAttribute(name = "SPLKN_KEY_IST_PARTNER_VON", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String splknkeyistpartnervon;
    @XmlAttribute(name = "STRABSCH_KEY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String strabschkey;
    @XmlAttribute(name = "WANFANG_BAUART", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String wanfangbauart;
    @XmlAttribute(name = "ZNMA_KEY", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String znmakey;

    /**
     * Gets the value of the abgrknbfgrenzkm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getABGRKNBFGRENZKM() {
        return abgrknbfgrenzkm;
    }

    /**
     * Sets the value of the abgrknbfgrenzkm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setABGRKNBFGRENZKM(BigInteger value) {
        this.abgrknbfgrenzkm = value;
    }

    /**
     * Gets the value of the abgrkngleiskennzeichen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getABGRKNGLEISKENNZEICHEN() {
        return abgrkngleiskennzeichen;
    }

    /**
     * Sets the value of the abgrkngleiskennzeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setABGRKNGLEISKENNZEICHEN(BigInteger value) {
        this.abgrkngleiskennzeichen = value;
    }

    /**
     * Gets the value of the abgrknkmueberlaenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABGRKNKMUEBERLAENGE() {
        return abgrknkmueberlaenge;
    }

    /**
     * Sets the value of the abgrknkmueberlaenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABGRKNKMUEBERLAENGE(String value) {
        this.abgrknkmueberlaenge = value;
    }

    /**
     * Gets the value of the abgrknorientierung property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getABGRKNORIENTIERUNG() {
        return abgrknorientierung;
    }

    /**
     * Sets the value of the abgrknorientierung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setABGRKNORIENTIERUNG(BigInteger value) {
        this.abgrknorientierung = value;
    }

    /**
     * Gets the value of the abgrknpositionx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABGRKNPOSITIONX() {
        return abgrknpositionx;
    }

    /**
     * Sets the value of the abgrknpositionx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABGRKNPOSITIONX(String value) {
        this.abgrknpositionx = value;
    }

    /**
     * Gets the value of the abgrknpositionxleidas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABGRKNPOSITIONXLEIDAS() {
        return abgrknpositionxleidas;
    }

    /**
     * Sets the value of the abgrknpositionxleidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABGRKNPOSITIONXLEIDAS(String value) {
        this.abgrknpositionxleidas = value;
    }

    /**
     * Gets the value of the abgrknpositiony property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getABGRKNPOSITIONY() {
        return abgrknpositiony;
    }

    /**
     * Sets the value of the abgrknpositiony property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setABGRKNPOSITIONY(BigInteger value) {
        this.abgrknpositiony = value;
    }

    /**
     * Gets the value of the abgrknpositionyleidas property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getABGRKNPOSITIONYLEIDAS() {
        return abgrknpositionyleidas;
    }

    /**
     * Sets the value of the abgrknpositionyleidas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setABGRKNPOSITIONYLEIDAS(BigInteger value) {
        this.abgrknpositionyleidas = value;
    }

    /**
     * Gets the value of the abgrkntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABGRKNTYPE() {
        return abgrkntype;
    }

    /**
     * Sets the value of the abgrkntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABGRKNTYPE(String value) {
        this.abgrkntype = value;
    }

    /**
     * Gets the value of the kwendelelementname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKWENDELELEMENTNAME() {
        return kwendelelementname;
    }

    /**
     * Sets the value of the kwendelelementname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKWENDELELEMENTNAME(String value) {
        this.kwendelelementname = value;
    }

    /**
     * Gets the value of the splknkey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSPLKNKEY() {
        return splknkey;
    }

    /**
     * Sets the value of the splknkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSPLKNKEY(BigInteger value) {
        this.splknkey = value;
    }

    /**
     * Gets the value of the splknkeyistpartnervon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPLKNKEYISTPARTNERVON() {
        return splknkeyistpartnervon;
    }

    /**
     * Sets the value of the splknkeyistpartnervon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPLKNKEYISTPARTNERVON(String value) {
        this.splknkeyistpartnervon = value;
    }

    /**
     * Gets the value of the strabschkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRABSCHKEY() {
        return strabschkey;
    }

    /**
     * Sets the value of the strabschkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRABSCHKEY(String value) {
        this.strabschkey = value;
    }

    /**
     * Gets the value of the wanfangbauart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWANFANGBAUART() {
        return wanfangbauart;
    }

    /**
     * Sets the value of the wanfangbauart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWANFANGBAUART(String value) {
        this.wanfangbauart = value;
    }

    /**
     * Gets the value of the znmakey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZNMAKEY() {
        return znmakey;
    }

    /**
     * Sets the value of the znmakey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZNMAKEY(String value) {
        this.znmakey = value;
    }

}