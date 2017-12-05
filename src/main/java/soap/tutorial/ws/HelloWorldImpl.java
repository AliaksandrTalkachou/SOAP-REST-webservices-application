package soap.tutorial.ws;

import soap.tutorial.converter.JAXBConverter;
import soap.tutorial.model.Student;

import javax.jws.WebService;

//Service implementation
@WebService(endpointInterface = "soap.tutorial.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(Student student) {
        return "Hello world JAX-WS " + student;
    }

}
