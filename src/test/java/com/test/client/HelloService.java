
package com.test.client;

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
@WebService(name = "HelloService", targetNamespace = "http://service.thg.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloService {


    /**
     * 
     * @param userId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getName", targetNamespace = "http://service.thg.com/", className = "com.test.client.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://service.thg.com/", className = "com.test.client.GetNameResponse")
    public String getName(
        @WebParam(name = "userId", targetNamespace = "")
        String userId);

}
