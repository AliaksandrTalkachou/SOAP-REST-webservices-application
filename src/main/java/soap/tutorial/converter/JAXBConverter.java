package soap.tutorial.converter;

import soap.tutorial.model.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBConverter {

    public static void main(String[] args) {
        Student student = new Student();
        student.setCash(250);
        student.setCigarettes(5);
        student.setGoden(true);
        student.setHasGirlfriend(false);
        student.setName("Petya");

        try {

            File file = new File(".\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(student, file);
            jaxbMarshaller.marshal(student, System.out);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Student unmarshallXML() throws Exception {
        File file = new File(".\\file.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        return (Student) unmarshaller.unmarshal(file);
    }

}
