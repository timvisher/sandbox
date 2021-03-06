//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.11 at 09:48:37 PM EST 
//


package com.algoconnectone.collateralprotocol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MusicLibrary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MusicLibrary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="album-details" type="{http://www.algoconnectone.com/collateralProtocol}AlbumDetails"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MusicLibrary", propOrder = {
    "albumDetails"
})
public class MusicLibrary {

    @XmlElement(name = "album-details", required = true)
    protected AlbumDetails albumDetails;
    @XmlAttribute(required = true)
    protected String schemaVersion;

    /**
     * Gets the value of the albumDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AlbumDetails }
     *     
     */
    public AlbumDetails getAlbumDetails() {
        return albumDetails;
    }

    /**
     * Sets the value of the albumDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlbumDetails }
     *     
     */
    public void setAlbumDetails(AlbumDetails value) {
        this.albumDetails = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
