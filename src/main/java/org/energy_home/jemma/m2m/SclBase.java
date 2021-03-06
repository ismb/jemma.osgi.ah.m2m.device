//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.10 at 10:38:31 AM CET 
//

package org.energy_home.jemma.m2m;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * This resource is the root for all resources that are residing on the hosting
 * SCL.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "accessRightId", "creationTime", "lastModifiedTime" })
@XmlRootElement(name = "SclBase")
public class SclBase extends M2MXmlObject {

	@XmlElement(name = "Id")
	@XmlSchemaType(name = "anyURI")
	protected String id;
	@XmlElement(name = "AccessRightId")
	@XmlSchemaType(name = "anyURI")
	protected String accessRightId;
	@XmlElement(name = "CreationTime")
	protected Long creationTime;
	@XmlElement(name = "LastModifiedTime")
	protected Long lastModifiedTime;

	/**
	 * 
	 * The id property is a unique identifier of the resource related to the
	 * containing resource identifier specified by the the context of the HTTP
	 * Request or by a parent element.
	 * 
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the accessRightId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccessRightId() {
		return accessRightId;
	}

	/**
	 * Sets the value of the accessRightId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccessRightId(String value) {
		this.accessRightId = value;
	}

	/**
	 * 
	 * The CreationTime property specifies the time Time of creation of the
	 * resource as UTC milliseconds from the Epoch (January 1, 1970 00:00:00.000
	 * GMT)
	 * 
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getCreationTime() {
		return creationTime;
	}

	/**
	 * Sets the value of the creationTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setCreationTime(Long value) {
		this.creationTime = value;
	}

	/**
	 * Gets the value of the lastModifiedTime property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getLastModifiedTime() {
		return lastModifiedTime;
	}

	/**
	 * Sets the value of the lastModifiedTime property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setLastModifiedTime(Long value) {
		this.lastModifiedTime = value;
	}

}
