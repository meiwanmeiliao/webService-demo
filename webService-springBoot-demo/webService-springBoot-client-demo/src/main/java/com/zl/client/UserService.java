
package com.zl.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://zl.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.zl.client.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser2", targetNamespace = "http://zl.com/", className = "com.zl.client.GetUser2")
    @ResponseWrapper(localName = "getUser2Response", targetNamespace = "http://zl.com/", className = "com.zl.client.GetUser2Response")
    public User getUser2(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.zl.client.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser1", targetNamespace = "http://zl.com/", className = "com.zl.client.GetUser1")
    @ResponseWrapper(localName = "getUser1Response", targetNamespace = "http://zl.com/", className = "com.zl.client.GetUser1Response")
    public User getUser1(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
