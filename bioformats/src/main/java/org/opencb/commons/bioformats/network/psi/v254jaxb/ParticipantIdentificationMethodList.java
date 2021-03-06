//
// This path was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this path will be lost upon recompilation of the source schema.
// Generated on: 2012.05.04 at 12:38:29 AM CEST 
//


package org.opencb.commons.bioformats.network.psi.v254jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * The method(s) by which this participant has been determined. If this element is present,
 * its value supersedes experimentDescription/ participantIdentificationMethod.
 * <p/>
 * <p/>
 * <p>Java class for participantIdentificationMethodList complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="participantIdentificationMethodList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participantIdentificationMethod" type="{http://psi.hupo.org/mi/mif}participantIdentificationMethod" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "participantIdentificationMethodList", propOrder = {
        "participantIdentificationMethod"
})
public class ParticipantIdentificationMethodList {

    @XmlElement(required = true)
    protected List<ParticipantIdentificationMethod> participantIdentificationMethod;

    /**
     * Gets the value of the participantIdentificationMethod property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantIdentificationMethod property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantIdentificationMethod().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantIdentificationMethod }
     */
    public List<ParticipantIdentificationMethod> getParticipantIdentificationMethod() {
        if (participantIdentificationMethod == null) {
            participantIdentificationMethod = new ArrayList<ParticipantIdentificationMethod>();
        }
        return this.participantIdentificationMethod;
    }

}
