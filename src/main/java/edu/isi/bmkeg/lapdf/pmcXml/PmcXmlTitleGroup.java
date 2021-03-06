//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}article-title"/>
 *         &lt;element ref="{}subtitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}trans-title-group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}alt-title" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}fn-group" minOccurs="0"/>
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
    "articleTitle",
    "subtitles",
    "transTitleGroups",
    "altTitles",
    "fnGroup"
})
@XmlRootElement(name = "title-group")
public class PmcXmlTitleGroup {

    @XmlElement(name = "article-title", required = true)
    protected PmcXmlArticleTitle articleTitle;
    @XmlElement(name = "subtitle")
    protected List<PmcXmlSubtitle> subtitles;
    @XmlElement(name = "trans-title-group")
    protected List<PmcXmlTransTitleGroup> transTitleGroups;
    @XmlElement(name = "alt-title")
    protected List<PmcXmlAltTitle> altTitles;
    @XmlElement(name = "fn-group")
    protected PmcXmlFnGroup fnGroup;

    /**
     * Gets the value of the articleTitle property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlArticleTitle }
     *     
     */
    public PmcXmlArticleTitle getArticleTitle() {
        return articleTitle;
    }

    /**
     * Sets the value of the articleTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlArticleTitle }
     *     
     */
    public void setArticleTitle(PmcXmlArticleTitle value) {
        this.articleTitle = value;
    }

    /**
     * Gets the value of the subtitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlSubtitle }
     * 
     * 
     */
    public List<PmcXmlSubtitle> getSubtitles() {
        if (subtitles == null) {
            subtitles = new ArrayList<PmcXmlSubtitle>();
        }
        return this.subtitles;
    }

    /**
     * Gets the value of the transTitleGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transTitleGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransTitleGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlTransTitleGroup }
     * 
     * 
     */
    public List<PmcXmlTransTitleGroup> getTransTitleGroups() {
        if (transTitleGroups == null) {
            transTitleGroups = new ArrayList<PmcXmlTransTitleGroup>();
        }
        return this.transTitleGroups;
    }

    /**
     * Gets the value of the altTitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altTitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltTitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlAltTitle }
     * 
     * 
     */
    public List<PmcXmlAltTitle> getAltTitles() {
        if (altTitles == null) {
            altTitles = new ArrayList<PmcXmlAltTitle>();
        }
        return this.altTitles;
    }

    /**
     * Gets the value of the fnGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlFnGroup }
     *     
     */
    public PmcXmlFnGroup getFnGroup() {
        return fnGroup;
    }

    /**
     * Sets the value of the fnGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlFnGroup }
     *     
     */
    public void setFnGroup(PmcXmlFnGroup value) {
        this.fnGroup = value;
    }

}
