package soap.tutorial.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

    private String name;
    private double cash;
    private int cigarettes;
    private boolean hasGirlfriend;
    private boolean isGoden;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    @XmlElement
    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getCigarettes() {
        return cigarettes;
    }

    @XmlElement
    public void setCigarettes(int cigarettes) {
        this.cigarettes = cigarettes;
    }

    public boolean isHasGirlfriend() {
        return hasGirlfriend;
    }

    @XmlElement
    public void setHasGirlfriend(boolean hasGirlfriend) {
        this.hasGirlfriend = hasGirlfriend;
    }

    public boolean isGoden() {
        return isGoden;
    }

    @XmlElement
    public void setGoden(boolean goden) {
        isGoden = goden;
    }

    @Override
    public String toString() {
        return "\n" + name + "\n" + cigarettes + "\n" + cash;
    }
}
