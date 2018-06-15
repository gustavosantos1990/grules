package com.grules.rest.services;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

@Stateless
public class SendToSoap {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/desktop-6s2397t_8080/grules-soap-sever/EventoWebService.wsdl")
    private EventoWebService_Service service;

    private void saveEvento(com.grules.rest.services.Evento arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.grules.rest.services.EventoWebService port = service.getEventoWebServicePort();
        port.saveEvento(arg0);
    }
    
    public void save(com.grules.rest.services.Evento obj){
        saveEvento(obj);
        
    }
}
