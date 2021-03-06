//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.21 at 02:03:40 PM MEZ 
//


package de.og.battanimation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}animation-list" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://schemas.android.com/apk/res/android}drawable"/>
 *       &lt;attribute ref="{http://schemas.android.com/apk/res/android}duration"/>
 *       &lt;attribute ref="{http://schemas.android.com/apk/res/android}maxLevel"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "animationList"
})
@XmlRootElement(name = "item")
public class Item {

    @XmlElement(name = "animation-list")
    protected AnimationList animationList;
    @XmlAttribute(namespace = "http://schemas.android.com/apk/res/android")
    @XmlSchemaType(name = "anySimpleType")
    protected String drawable;
    @XmlAttribute(namespace = "http://schemas.android.com/apk/res/android")
    protected Integer duration;
    @XmlAttribute(namespace = "http://schemas.android.com/apk/res/android")
    protected Integer maxLevel;

    /**
     * Gets the value of the animationList property.
     * 
     * @return
     *     possible object is
     *     {@link AnimationList }
     *     
     */
    public AnimationList getAnimationList() {
        return animationList;
    }

    /**
     * Sets the value of the animationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimationList }
     *     
     */
    public void setAnimationList(AnimationList value) {
        this.animationList = value;
    }

    /**
     * Gets the value of the drawable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawable() {
        return drawable;
    }

    /**
     * Sets the value of the drawable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawable(String value) {
        this.drawable = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the maxLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * Sets the value of the maxLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLevel(Integer value) {
        this.maxLevel = value;
    }

}
