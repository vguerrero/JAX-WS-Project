
package com.globinch;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.globinch package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JxRes_QNAME = new QName("http://globinch.com", "jxRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.globinch
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JxRes }
     * 
     */
    public JxRes createJxRes() {
        return new JxRes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JxRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://globinch.com", name = "jxRes")
    public JAXBElement<JxRes> createJxRes(JxRes value) {
        return new JAXBElement<JxRes>(_JxRes_QNAME, JxRes.class, null, value);
    }

}
