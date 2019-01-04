
package com.zl.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zl.client package. 
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

    private final static QName _GetUser2_QNAME = new QName("http://zl.com/", "getUser2");
    private final static QName _GetUser1_QNAME = new QName("http://zl.com/", "getUser1");
    private final static QName _GetUser1Response_QNAME = new QName("http://zl.com/", "getUser1Response");
    private final static QName _GetUser2Response_QNAME = new QName("http://zl.com/", "getUser2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zl.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUser1 }
     * 
     */
    public GetUser1 createGetUser1() {
        return new GetUser1();
    }

    /**
     * Create an instance of {@link GetUser2 }
     * 
     */
    public GetUser2 createGetUser2() {
        return new GetUser2();
    }

    /**
     * Create an instance of {@link GetUser1Response }
     * 
     */
    public GetUser1Response createGetUser1Response() {
        return new GetUser1Response();
    }

    /**
     * Create an instance of {@link GetUser2Response }
     * 
     */
    public GetUser2Response createGetUser2Response() {
        return new GetUser2Response();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zl.com/", name = "getUser2")
    public JAXBElement<GetUser2> createGetUser2(GetUser2 value) {
        return new JAXBElement<GetUser2>(_GetUser2_QNAME, GetUser2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zl.com/", name = "getUser1")
    public JAXBElement<GetUser1> createGetUser1(GetUser1 value) {
        return new JAXBElement<GetUser1>(_GetUser1_QNAME, GetUser1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zl.com/", name = "getUser1Response")
    public JAXBElement<GetUser1Response> createGetUser1Response(GetUser1Response value) {
        return new JAXBElement<GetUser1Response>(_GetUser1Response_QNAME, GetUser1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zl.com/", name = "getUser2Response")
    public JAXBElement<GetUser2Response> createGetUser2Response(GetUser2Response value) {
        return new JAXBElement<GetUser2Response>(_GetUser2Response_QNAME, GetUser2Response.class, null, value);
    }

}
