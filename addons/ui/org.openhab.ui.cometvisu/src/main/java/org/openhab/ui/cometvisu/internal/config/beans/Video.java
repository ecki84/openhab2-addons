//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.17 at 05:50:37 PM CEST 
//

package org.openhab.ui.cometvisu.internal.config.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for video complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="video">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="layout" type="{}layout" minOccurs="0"/>
 *         &lt;element name="label" type="{}label" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="src" use="required" type="{}uri" />
 *       &lt;attribute name="width" type="{}dimension" />
 *       &lt;attribute name="height" type="{}dimension" />
 *       &lt;attribute name="autoplay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{}flavour"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "video", propOrder = { "layout", "label" })
public class Video {

    protected Layout layout;
    protected Label label;
    @XmlAttribute(name = "src", required = true)
    protected String src;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "height")
    protected String height;
    @XmlAttribute(name = "autoplay")
    protected String autoplay;
    @XmlAttribute(name = "flavour")
    protected String flavour;

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *         possible object is
     *         {@link Layout }
     * 
     */
    public Layout getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *            allowed object is
     *            {@link Layout }
     * 
     */
    public void setLayout(Layout value) {
        this.layout = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *         possible object is
     *         {@link Label }
     * 
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *            allowed object is
     *            {@link Label }
     * 
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the autoplay property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAutoplay() {
        return autoplay;
    }

    /**
     * Sets the value of the autoplay property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setAutoplay(String value) {
        this.autoplay = value;
    }

    /**
     * Gets the value of the flavour property.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFlavour() {
        return flavour;
    }

    /**
     * Sets the value of the flavour property.
     * 
     * @param value
     *            allowed object is
     *            {@link String }
     * 
     */
    public void setFlavour(String value) {
        this.flavour = value;
    }

}