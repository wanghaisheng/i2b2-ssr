
package org.cdisc.ns.odm.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Snapshot"/>
 *     &lt;enumeration value="Transactional"/>
 *     &lt;maxLength value="13"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileType")
@XmlEnum
public enum FileType {

    @XmlEnumValue("Snapshot")
    SNAPSHOT("Snapshot"),
    @XmlEnumValue("Transactional")
    TRANSACTIONAL("Transactional");
    private final String value;

    FileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileType fromValue(String v) {
        for (FileType c: FileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
