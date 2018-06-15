
package com.grules.rest.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grules.rest.services package. 
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

    private final static QName _Hello_QNAME = new QName("http://services.soap.grules.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services.soap.grules.com/", "helloResponse");
    private final static QName _SaveEvento_QNAME = new QName("http://services.soap.grules.com/", "saveEvento");
    private final static QName _SaveEventoResponse_QNAME = new QName("http://services.soap.grules.com/", "saveEventoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grules.rest.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SaveEvento }
     * 
     */
    public SaveEvento createSaveEvento() {
        return new SaveEvento();
    }

    /**
     * Create an instance of {@link SaveEventoResponse }
     * 
     */
    public SaveEventoResponse createSaveEventoResponse() {
        return new SaveEventoResponse();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link Aluno }
     * 
     */
    public Aluno createAluno() {
        return new Aluno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.soap.grules.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.soap.grules.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEvento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveEvento }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.soap.grules.com/", name = "saveEvento")
    public JAXBElement<SaveEvento> createSaveEvento(SaveEvento value) {
        return new JAXBElement<SaveEvento>(_SaveEvento_QNAME, SaveEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEventoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveEventoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.soap.grules.com/", name = "saveEventoResponse")
    public JAXBElement<SaveEventoResponse> createSaveEventoResponse(SaveEventoResponse value) {
        return new JAXBElement<SaveEventoResponse>(_SaveEventoResponse_QNAME, SaveEventoResponse.class, null, value);
    }

}
