package soap.tutorial.ws;

import soap.tutorial.model.Student;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//Service endpoint interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {

    @WebMethod String getHelloWorldAsString(Student student);

}
