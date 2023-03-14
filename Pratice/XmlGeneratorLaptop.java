package Xml.Pratice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class XmlGeneratorLaptop {
    public static void main(String[] args) throws IOException {
        Laptop laptop = new Laptop("1", "Dell", false, 256, 30500);
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        FileOutputStream fos = new FileOutputStream(new File(".\\src\\Xml\\Pratice\\Laptop.xml"));
        fos.write(xmlMapper.writeValueAsBytes(laptop));
        fos.close();
        System.out.println();
    }
}
