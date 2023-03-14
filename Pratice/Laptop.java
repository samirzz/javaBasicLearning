package Xml.Pratice;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Laptop")
public class Laptop {
    @JacksonXmlProperty(isAttribute = true)
    private String serial_ID;
    @JacksonXmlProperty
    private String name;
    @JacksonXmlProperty
    private boolean ssd;
    @JacksonXmlProperty
    private int ramSize;
    @JacksonXmlProperty
    private double price;

    public Laptop(String serial_ID, String name, boolean ssd, int ramSize, double price) {
        this.serial_ID = serial_ID;
        this.name = name;
        this.ssd = ssd;
        this.ramSize = ramSize;
        this.price = price;
    }

    public String getSerial_ID() {
        return serial_ID;
    }

    public void setSerial_ID(String serial_ID) {
        this.serial_ID = serial_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
